package model.meta;

import persistence.*;

public class ArticleReceiveDeliveryIntegerMssg implements ArticleDOWNMssgs,ArticleUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentArticle rcvr;
    public final long amount;
    
    public ArticleReceiveDeliveryIntegerMssg(long amount,
                                             persistence.PersistentArticle rcvr){
        this.amount = amount;
        this.rcvr = rcvr;
    }
    public void accept(ArticleMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleReceiveDeliveryIntegerMssg(this);
    }
    public void accept(ItemMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleReceiveDeliveryIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.receiveDeliveryImplementation(this.amount);
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
