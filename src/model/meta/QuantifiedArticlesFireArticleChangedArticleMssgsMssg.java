package model.meta;

import persistence.*;

public class QuantifiedArticlesFireArticleChangedArticleMssgsMssg implements QuantifiedArticlesDOWNMssgs,QuantifiedArticlesUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentQuantifiedArticles rcvr;
    public final model.meta.ArticleMssgs evnt;
    
    public QuantifiedArticlesFireArticleChangedArticleMssgsMssg(model.meta.ArticleMssgs evnt,
                                                                persistence.PersistentQuantifiedArticles rcvr){
        this.evnt = evnt;
        this.rcvr = rcvr;
    }
    public void accept(QuantifiedArticlesMssgsVisitor visitor) throws PersistenceException{
        visitor.handleQuantifiedArticlesFireArticleChangedArticleMssgsMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.fireArticleChangedImplementation(this.evnt);
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
