package model.meta;

import persistence.*;

public class CartManagerAddArticleArticleIntegerMssg implements CartManagerDOWNMssgs,CartManagerUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentCartManager rcvr;
    public final persistence.PersistentArticle article;
    public final long amount;
    
    public CartManagerAddArticleArticleIntegerMssg(persistence.PersistentArticle article,
                                                   long amount,
                                                   persistence.PersistentCartManager rcvr){
        this.article = article;
        this.amount = amount;
        this.rcvr = rcvr;
    }
    public void accept(CartManagerMssgsVisitor visitor) throws PersistenceException{
        visitor.handleCartManagerAddArticleArticleIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.addArticleImplementation(this.article, this.amount);
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
