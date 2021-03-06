package model.meta;

import persistence.*;

public class ArticleChangePriceIntegerMssg implements ArticleDOWNMssgs,ArticleUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentArticle rcvr;
    public final long newPrice;
    
    public ArticleChangePriceIntegerMssg(long newPrice,
                                         persistence.PersistentArticle rcvr){
        this.newPrice = newPrice;
        this.rcvr = rcvr;
    }
    public void accept(ArticleMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleChangePriceIntegerMssg(this);
    }
    public void accept(ItemMssgsVisitor visitor) throws PersistenceException{
        visitor.handleArticleChangePriceIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.changePriceImplementation(this.newPrice);
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
