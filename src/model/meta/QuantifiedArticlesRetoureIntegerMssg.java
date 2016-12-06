package model.meta;

import persistence.*;

public class QuantifiedArticlesRetoureIntegerMssg implements QuantifiedArticlesDOWNMssgs,QuantifiedArticlesUPMssgs{
    
    private java.util.Date exctDte = null;
    private Exception excptn;
    public final persistence.PersistentQuantifiedArticles rcvr;
    public final long amount;
    
    public QuantifiedArticlesRetoureIntegerMssg(long amount,
                                                persistence.PersistentQuantifiedArticles rcvr){
        this.amount = amount;
        this.rcvr = rcvr;
    }
    public void accept(QuantifiedArticlesMssgsVisitor visitor) throws PersistenceException{
        visitor.handleQuantifiedArticlesRetoureIntegerMssg(this);
    }
    public synchronized void execute() {
        if (this.exctDte == null){
            this.exctDte = new java.util.Date();
            try{
                this.rcvr.retoureImplementation(this.amount);
            }catch(Exception exception){
                this.excptn = exception;
            }
        }
    }
    public synchronized void getResult() throws model.NotArrived, PersistenceException {
        if(this.excptn != null) {
            if(this.excptn instanceof model.NotArrived) throw (model.NotArrived) this.excptn;
            if(this.excptn instanceof PersistenceException) throw (PersistenceException) this.excptn;
            if(this.excptn instanceof RuntimeException) throw (RuntimeException) this.excptn;
            throw new Error(this.excptn);
            
        }
    }
    
}
