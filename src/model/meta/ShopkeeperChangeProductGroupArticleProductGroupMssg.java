package model.meta;

import persistence.*;

public class ShopkeeperChangeProductGroupArticleProductGroupMssg implements ShopkeeperDOWNMssgs,ShopkeeperUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentShopkeeper rcvr;
    public final persistence.PersistentArticle article;
    public final persistence.PersistentProductGroup newPG;
    
    public ShopkeeperChangeProductGroupArticleProductGroupMssg(persistence.PersistentArticle article,
                                                               persistence.PersistentProductGroup newPG,
                                                               persistence.PersistentShopkeeper rcvr){
        this.article = article;
        this.newPG = newPG;
        this.rcvr = rcvr;
    }
    public void accept(ShopkeeperMssgsVisitor visitor) throws PersistenceException{
        visitor.handleShopkeeperChangeProductGroupArticleProductGroupMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changeProductGroupImplementation(this.article, this.newPG);
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
