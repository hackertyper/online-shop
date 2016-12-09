
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShopManagerBasicProductGroup extends PersistentObject implements PersistentShopManagerBasicProductGroup{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentShopManagerBasicProductGroup getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade.getClass(objectId);
        return (PersistentShopManagerBasicProductGroup)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentShopManagerBasicProductGroup createShopManagerBasicProductGroup() throws PersistenceException{
        return createShopManagerBasicProductGroup(false);
    }
    
    public static PersistentShopManagerBasicProductGroup createShopManagerBasicProductGroup(boolean delayed$Persistence) throws PersistenceException {
        PersistentShopManagerBasicProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade
                .newDelayedShopManagerBasicProductGroup();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade
                .newShopManagerBasicProductGroup(-1);
        }
        while (!(result instanceof ShopManagerBasicProductGroup)) result = (PersistentShopManagerBasicProductGroup)result.getTheObject();
        ((ShopManagerBasicProductGroup)result).setThis(result);
        return result;
    }
    
    public ShopManagerBasicProductGroup provideCopy() throws PersistenceException{
        ShopManagerBasicProductGroup result = this;
        result = new ShopManagerBasicProductGroup(this.observer, 
                                                  this.observee, 
                                                  this.This, 
                                                  this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentShopManager observer;
    protected PersistentProductGroup observee;
    protected PersistentShopManagerBasicProductGroup This;
    
    public ShopManagerBasicProductGroup(PersistentShopManager observer,PersistentProductGroup observee,PersistentShopManagerBasicProductGroup This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 310;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 310) ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade
            .newShopManagerBasicProductGroup(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade.observerSet(this.getId(), newValue);
        }
    }
    public PersistentProductGroup getObservee() throws PersistenceException {
        return this.observee;
    }
    public void setObservee(PersistentProductGroup newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observee)) return;
        PersistentProductGroup oldValue =  this.getObservee();
        if (oldValue != null) oldValue.deregister(this);
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observee = (PersistentProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentShopManagerBasicProductGroup newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentShopManagerBasicProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerBasicProductGroupFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentShopManagerBasicProductGroup getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopManagerBasicProductGroup result = (PersistentShopManagerBasicProductGroup)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopManagerBasicProductGroup)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopManagerBasicProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManagerBasicProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManagerBasicProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManagerBasicProductGroup(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopManagerBasicProductGroup(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManagerBasicProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManagerBasicProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManagerBasicProductGroup(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getObserver() != null) return 1;
        if (this.getObservee() != null) return 1;
        return 0;
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        this.observer.getThis().basicProductGroup_update((model.meta.ProductGroupMssgs)event);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
