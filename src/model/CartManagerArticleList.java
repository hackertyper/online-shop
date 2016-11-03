
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CartManagerArticleList extends PersistentObject implements PersistentCartManagerArticleList{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCartManagerArticleList getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade.getClass(objectId);
        return (PersistentCartManagerArticleList)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCartManagerArticleList createCartManagerArticleList() throws PersistenceException{
        return createCartManagerArticleList(false);
    }
    
    public static PersistentCartManagerArticleList createCartManagerArticleList(boolean delayed$Persistence) throws PersistenceException {
        PersistentCartManagerArticleList result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade
                .newDelayedCartManagerArticleList();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade
                .newCartManagerArticleList(-1);
        }
        while (!(result instanceof CartManagerArticleList)) result = (PersistentCartManagerArticleList)result.getTheObject();
        ((CartManagerArticleList)result).setThis(result);
        return result;
    }
    
    public CartManagerArticleList provideCopy() throws PersistenceException{
        CartManagerArticleList result = this;
        result = new CartManagerArticleList(this.observer, 
                                            this.This, 
                                            this.getId());
        result.observee = this.observee.copy(result);
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCartManager observer;
    protected CartManagerArticleList_ObserveeProxi observee;
    protected PersistentCartManagerArticleList This;
    
    public CartManagerArticleList(PersistentCartManager observer,PersistentCartManagerArticleList This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = new CartManagerArticleList_ObserveeProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 213;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 213) ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade
            .newCartManagerArticleList(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade.observerSet(this.getId(), getObserver());
        }
        this.getObservee().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentCartManager getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(PersistentCartManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentCartManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade.observerSet(this.getId(), newValue);
        }
    }
    public CartManagerArticleList_ObserveeProxi getObservee() throws PersistenceException {
        return this.observee;
    }
    protected void setThis(PersistentCartManagerArticleList newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCartManagerArticleList)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCartManagerArticleList getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCartManagerArticleList result = (PersistentCartManagerArticleList)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCartManagerArticleList)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerArticleList(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerArticleList(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerArticleList(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerArticleList(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerArticleList(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerArticleList(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerArticleList(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerArticleList(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void add(final PersistentQuantifiedArticles observee) 
				throws PersistenceException{
        this.getObservee().add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<PersistentQuantifiedArticles,R,E> aggregtion) 
				throws E, PersistenceException{
        return this.getObservee().aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<PersistentQuantifiedArticles,R> aggregtion) 
				throws PersistenceException{
        return this.getObservee().aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<PersistentQuantifiedArticles,E> procdure) 
				throws E, PersistenceException{
        this.getObservee().applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<PersistentQuantifiedArticles> procdure) 
				throws PersistenceException{
        this.getObservee().applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().filterException(predcate);
    }
    public void filter(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        this.getObservee().filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<PersistentQuantifiedArticles> findAllException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findAllException(predcate);
    }
    public SearchListRoot<PersistentQuantifiedArticles> findAll(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        return this.getObservee().findAll(predcate);
    }
    public <E extends model.UserException> PersistentQuantifiedArticles findFirstException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findFirstException(predcate);
    }
    public PersistentQuantifiedArticles findFirst(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        return this.getObservee().findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        		return this.getObservee().getLength();
    }
    public QuantifiedArticlesSearchList getList() 
				throws PersistenceException{
        return this.getObservee().getList();
    }
    public java.util.Iterator<PersistentQuantifiedArticles> iterator() 
				throws PersistenceException{
        return this.getObservee().iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().articleList_update((model.meta.QuantifiedArticlesMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
