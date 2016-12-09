
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CartManagerOnDelivery extends PersistentObject implements PersistentCartManagerOnDelivery{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCartManagerOnDelivery getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade.getClass(objectId);
        return (PersistentCartManagerOnDelivery)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCartManagerOnDelivery createCartManagerOnDelivery() throws PersistenceException{
        return createCartManagerOnDelivery(false);
    }
    
    public static PersistentCartManagerOnDelivery createCartManagerOnDelivery(boolean delayed$Persistence) throws PersistenceException {
        PersistentCartManagerOnDelivery result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade
                .newDelayedCartManagerOnDelivery();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade
                .newCartManagerOnDelivery(-1);
        }
        while (!(result instanceof CartManagerOnDelivery)) result = (PersistentCartManagerOnDelivery)result.getTheObject();
        ((CartManagerOnDelivery)result).setThis(result);
        return result;
    }
    
    public CartManagerOnDelivery provideCopy() throws PersistenceException{
        CartManagerOnDelivery result = this;
        result = new CartManagerOnDelivery(this.observer, 
                                           this.observee, 
                                           this.This, 
                                           this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCartManager observer;
    protected PersistentOverNightDelivery observee;
    protected PersistentCartManagerOnDelivery This;
    
    public CartManagerOnDelivery(PersistentCartManager observer,PersistentOverNightDelivery observee,PersistentCartManagerOnDelivery This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 286;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 286) ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade
            .newCartManagerOnDelivery(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade.observerSet(this.getId(), newValue);
        }
    }
    public PersistentOverNightDelivery getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(PersistentOverNightDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        PersistentOverNightDelivery oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentOverNightDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentCartManagerOnDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCartManagerOnDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCartManagerOnDelivery getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCartManagerOnDelivery result = (PersistentCartManagerOnDelivery)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCartManagerOnDelivery)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerOnDelivery(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerOnDelivery(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerOnDelivery(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerOnDelivery(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerOnDelivery(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerOnDelivery(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerOnDelivery(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerOnDelivery(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().onDelivery_update((model.meta.OverNightDeliveryMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
