package model.meta;

import persistence.*;

public class ShopManagerAddToCartArticleIntegerMssg implements ShopManagerDOWNMssgs,ShopManagerUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShopManager rcvr;
    public final persistence.PersistentArticle article;
    public final long amount;
    
    public ShopManagerAddToCartArticleIntegerMssg(persistence.PersistentArticle article,
                                                  long amount,
                                                  persistence.PersistentShopManager rcvr){
        this.article = article;
        this.amount = amount;
        this.rcvr = rcvr;
    }
    public void accept(ShopManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopManagerAddToCartArticleIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.addToCartImplementation(this.article, this.amount);
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
