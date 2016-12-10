
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class QuantifiedArticlesArticle extends PersistentObject implements PersistentQuantifiedArticlesArticle{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentQuantifiedArticlesArticle getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade.getClass(objectId);
        return (PersistentQuantifiedArticlesArticle)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentQuantifiedArticlesArticle createQuantifiedArticlesArticle() throws PersistenceException{
        return createQuantifiedArticlesArticle(false);
    }
    
    public static PersistentQuantifiedArticlesArticle createQuantifiedArticlesArticle(boolean delayed$Persistence) throws PersistenceException {
        PersistentQuantifiedArticlesArticle result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade
                .newDelayedQuantifiedArticlesArticle();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade
                .newQuantifiedArticlesArticle(-1);
        }
        while (!(result instanceof QuantifiedArticlesArticle)) result = (PersistentQuantifiedArticlesArticle)result.getTheObject();
        ((QuantifiedArticlesArticle)result).setThis(result);
        return result;
    }
    
    public QuantifiedArticlesArticle provideCopy() throws PersistenceException{
        QuantifiedArticlesArticle result = this;
        result = new QuantifiedArticlesArticle(this.observer, 
                                               this.observee, 
                                               this.This, 
                                               this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentQuantifiedArticles observer;
    protected PersistentArticle observee;
    protected PersistentQuantifiedArticlesArticle This;
    
    public QuantifiedArticlesArticle(PersistentQuantifiedArticles observer,PersistentArticle observee,PersistentQuantifiedArticlesArticle This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 160;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 160) ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade
            .newQuantifiedArticlesArticle(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentQuantifiedArticles getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(PersistentQuantifiedArticles newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentQuantifiedArticles)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade.observerSet(this.getId(), newValue);
        }
    }
    public PersistentArticle getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(PersistentArticle newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        PersistentArticle oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentArticle)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentQuantifiedArticlesArticle newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentQuantifiedArticlesArticle)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentQuantifiedArticlesArticle getThis() throws PersistenceException {
        if(this.This == null){
            PersistentQuantifiedArticlesArticle result = (PersistentQuantifiedArticlesArticle)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentQuantifiedArticlesArticle)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleQuantifiedArticlesArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleQuantifiedArticlesArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleQuantifiedArticlesArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleQuantifiedArticlesArticle(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleQuantifiedArticlesArticle(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleQuantifiedArticlesArticle(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleQuantifiedArticlesArticle(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleQuantifiedArticlesArticle(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().article_update((model.meta.ArticleMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
