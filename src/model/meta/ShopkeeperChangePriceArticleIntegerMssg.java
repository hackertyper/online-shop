package model.meta;

import persistence.*;

public class ShopkeeperChangePriceArticleIntegerMssg implements ShopkeeperDOWNMssgs,ShopkeeperUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShopkeeper rcvr;
    public final persistence.PersistentArticle article;
    public final long newPrice;
    
    public ShopkeeperChangePriceArticleIntegerMssg(persistence.PersistentArticle article,
                                                   long newPrice,
                                                   persistence.PersistentShopkeeper rcvr){
        this.article = article;
        this.newPrice = newPrice;
        this.rcvr = rcvr;
    }
    public void accept(ShopkeeperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopkeeperChangePriceArticleIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changePriceImplementation(this.article, this.newPrice);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
