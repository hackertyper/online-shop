
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerOrderArticleList extends PersistentObject implements PersistentCustomerOrderArticleList{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCustomerOrderArticleList getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade.getClass(objectId);
        return (PersistentCustomerOrderArticleList)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCustomerOrderArticleList createCustomerOrderArticleList() throws PersistenceException{
        return createCustomerOrderArticleList(false);
    }
    
    public static PersistentCustomerOrderArticleList createCustomerOrderArticleList(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerOrderArticleList result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade
                .newDelayedCustomerOrderArticleList();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade
                .newCustomerOrderArticleList(-1);
        }
        while (!(result instanceof CustomerOrderArticleList)) result = (PersistentCustomerOrderArticleList)result.getTheObject();
        ((CustomerOrderArticleList)result).setThis(result);
        return result;
    }
    
    public CustomerOrderArticleList provideCopy() throws PersistenceException{
        CustomerOrderArticleList result = this;
        result = new CustomerOrderArticleList(this.observer, 
                                              this.This, 
                                              this.getId());
        result.observee = this.observee.copy(result);
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomerOrder observer;
    protected CustomerOrderArticleList_ObserveeProxi observee;
    protected PersistentCustomerOrderArticleList This;
    
    public CustomerOrderArticleList(PersistentCustomerOrder observer,PersistentCustomerOrderArticleList This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = new CustomerOrderArticleList_ObserveeProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 158;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 158) ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade
            .newCustomerOrderArticleList(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade.observerSet(this.getId(), getObserver());
        }
        this.getObservee().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentCustomerOrder getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(PersistentCustomerOrder newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentCustomerOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade.observerSet(this.getId(), newValue);
        }
    }
    public CustomerOrderArticleList_ObserveeProxi getObservee() throws PersistenceException {
        return this.observee;
    }
    protected void setThis(PersistentCustomerOrderArticleList newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerOrderArticleList)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerOrderArticleList getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerOrderArticleList result = (PersistentCustomerOrderArticleList)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerOrderArticleList)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderArticleList(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderArticleList(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderArticleList(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderArticleList(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderArticleList(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderArticleList(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderArticleList(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderArticleList(this);
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
