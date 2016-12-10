
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CartManagerStandardDelivery extends PersistentObject implements PersistentCartManagerStandardDelivery{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCartManagerStandardDelivery getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade.getClass(objectId);
        return (PersistentCartManagerStandardDelivery)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCartManagerStandardDelivery createCartManagerStandardDelivery() throws PersistenceException{
        return createCartManagerStandardDelivery(false);
    }
    
    public static PersistentCartManagerStandardDelivery createCartManagerStandardDelivery(boolean delayed$Persistence) throws PersistenceException {
        PersistentCartManagerStandardDelivery result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade
                .newDelayedCartManagerStandardDelivery();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade
                .newCartManagerStandardDelivery(-1);
        }
        while (!(result instanceof CartManagerStandardDelivery)) result = (PersistentCartManagerStandardDelivery)result.getTheObject();
        ((CartManagerStandardDelivery)result).setThis(result);
        return result;
    }
    
    public CartManagerStandardDelivery provideCopy() throws PersistenceException{
        CartManagerStandardDelivery result = this;
        result = new CartManagerStandardDelivery(this.observer, 
                                                 this.observee, 
                                                 this.This, 
                                                 this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCartManager observer;
    protected PersistentStandardDelivery observee;
    protected PersistentCartManagerStandardDelivery This;
    
    public CartManagerStandardDelivery(PersistentCartManager observer,PersistentStandardDelivery observee,PersistentCartManagerStandardDelivery This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 169;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 169) ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade
            .newCartManagerStandardDelivery(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade.observerSet(this.getId(), newValue);
        }
    }
    public PersistentStandardDelivery getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(PersistentStandardDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        PersistentStandardDelivery oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentStandardDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentCartManagerStandardDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCartManagerStandardDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCartManagerStandardDelivery getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCartManagerStandardDelivery result = (PersistentCartManagerStandardDelivery)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCartManagerStandardDelivery)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerStandardDelivery(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerStandardDelivery(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerStandardDelivery(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerStandardDelivery(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerStandardDelivery(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerStandardDelivery(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerStandardDelivery(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerStandardDelivery(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().standardDelivery_update((model.meta.StandardDeliveryMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
