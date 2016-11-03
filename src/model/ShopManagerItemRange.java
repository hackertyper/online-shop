
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShopManagerItemRange extends PersistentObject implements PersistentShopManagerItemRange{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentShopManagerItemRange getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade.getClass(objectId);
        return (PersistentShopManagerItemRange)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentShopManagerItemRange createShopManagerItemRange() throws PersistenceException{
        return createShopManagerItemRange(false);
    }
    
    public static PersistentShopManagerItemRange createShopManagerItemRange(boolean delayed$Persistence) throws PersistenceException {
        PersistentShopManagerItemRange result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade
                .newDelayedShopManagerItemRange();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade
                .newShopManagerItemRange(-1);
        }
        while (!(result instanceof ShopManagerItemRange)) result = (PersistentShopManagerItemRange)result.getTheObject();
        ((ShopManagerItemRange)result).setThis(result);
        return result;
    }
    
    public ShopManagerItemRange provideCopy() throws PersistenceException{
        ShopManagerItemRange result = this;
        result = new ShopManagerItemRange(this.observer, 
                                          this.This, 
                                          this.getId());
        result.observee = this.observee.copy(result);
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentShopManager observer;
    protected ShopManagerItemRange_ObserveeProxi observee;
    protected PersistentShopManagerItemRange This;
    
    public ShopManagerItemRange(PersistentShopManager observer,PersistentShopManagerItemRange This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = new ShopManagerItemRange_ObserveeProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 204;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 204) ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade
            .newShopManagerItemRange(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade.observerSet(this.getId(), getObserver());
        }
        this.getObservee().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentShopManager getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(PersistentShopManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentShopManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade.observerSet(this.getId(), newValue);
        }
    }
    public ShopManagerItemRange_ObserveeProxi getObservee() throws PersistenceException {
        return this.observee;
    }
    protected void setThis(PersistentShopManagerItemRange newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentShopManagerItemRange)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentShopManagerItemRange getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopManagerItemRange result = (PersistentShopManagerItemRange)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopManagerItemRange)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopManagerItemRange(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManagerItemRange(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManagerItemRange(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManagerItemRange(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopManagerItemRange(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManagerItemRange(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManagerItemRange(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManagerItemRange(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void add(final PersistentItem observee) 
				throws PersistenceException{
        this.getObservee().add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<PersistentItem,R,E> aggregtion) 
				throws E, PersistenceException{
        return this.getObservee().aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<PersistentItem,R> aggregtion) 
				throws PersistenceException{
        return this.getObservee().aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<PersistentItem,E> procdure) 
				throws E, PersistenceException{
        this.getObservee().applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<PersistentItem> procdure) 
				throws PersistenceException{
        this.getObservee().applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().filterException(predcate);
    }
    public void filter(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        this.getObservee().filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<PersistentItem> findAllException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findAllException(predcate);
    }
    public SearchListRoot<PersistentItem> findAll(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        return this.getObservee().findAll(predcate);
    }
    public <E extends model.UserException> PersistentItem findFirstException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        return this.getObservee().findFirstException(predcate);
    }
    public PersistentItem findFirst(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        return this.getObservee().findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        		return this.getObservee().getLength();
    }
    public ItemSearchList getList() 
				throws PersistenceException{
        return this.getObservee().getList();
    }
    public java.util.Iterator<PersistentItem> iterator() 
				throws PersistenceException{
        return this.getObservee().iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        this.getObservee().removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        this.getObservee().removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().itemRange_update((model.meta.ItemMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}