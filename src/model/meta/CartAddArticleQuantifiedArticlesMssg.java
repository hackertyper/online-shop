package model.meta;

import persistence.*;

public class CartAddArticleQuantifiedArticlesMssg implements CartDOWNMssgs,CartUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentCart rcvr;
    public final persistence.PersistentQuantifiedArticles article;
    
    public CartAddArticleQuantifiedArticlesMssg(persistence.PersistentQuantifiedArticles article,
                                                persistence.PersistentCart rcvr){
        this.article = article;
        this.rcvr = rcvr;
    }
    public void accept(CartMssgsVisitor visitor) throws PersistenceException{
        visitor.handleCartAddArticleQuantifiedArticlesMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.addArticleImplementation(this.article);
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
