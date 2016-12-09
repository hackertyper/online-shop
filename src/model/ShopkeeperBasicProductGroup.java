
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShopkeeperBasicProductGroup extends PersistentObject implements PersistentShopkeeperBasicProductGroup{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentShopkeeperBasicProductGroup getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade.getClass(objectId);
        return (PersistentShopkeeperBasicProductGroup)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentShopkeeperBasicProductGroup createShopkeeperBasicProductGroup() throws PersistenceException{
        return createShopkeeperBasicProductGroup(false);
    }
    
    public static PersistentShopkeeperBasicProductGroup createShopkeeperBasicProductGroup(boolean delayed$Persistence) throws PersistenceException {
        PersistentShopkeeperBasicProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade
                .newDelayedShopkeeperBasicProductGroup();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade
                .newShopkeeperBasicProductGroup(-1);
        }
        while (!(result instanceof ShopkeeperBasicProductGroup)) result = (PersistentShopkeeperBasicProductGroup)result.getTheObject();
        ((ShopkeeperBasicProductGroup)result).setThis(result);
        return result;
    }
    
    public ShopkeeperBasicProductGroup provideCopy() throws PersistenceException{
        ShopkeeperBasicProductGroup result = this;
        result = new ShopkeeperBasicProductGroup(this.observer, 
                                                 this.observee, 
                                                 this.This, 
                                                 this.getId());
        
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentShopkeeper observer;
    protected PersistentProductGroup observee;
    protected PersistentShopkeeperBasicProductGroup This;
    
    public ShopkeeperBasicProductGroup(PersistentShopkeeper observer,PersistentProductGroup observee,PersistentShopkeeperBasicProductGroup This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.observer = observer;
        this.observee = observee;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 272;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 272) ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade
            .newShopkeeperBasicProductGroup(this.getId());
        super.store();
        if(this.getObserver() != null){
            this.getObserver().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade.observerSet(this.getId(), getObserver());
        }
        if(this.getObservee() != null){
            this.getObservee().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade.observeeSet(this.getId(), getObservee());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentShopkeeper getObserver() throws PersistenceException {
        return this.observer;
    }
    public void setObserver(PersistentShopkeeper newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.observer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.observer = (PersistentShopkeeper)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade.observerSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade.observeeSet(this.getId(), newValue);
        }
        newValue.register(this);
    }
    protected void setThis(PersistentShopkeeperBasicProductGroup newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentShopkeeperBasicProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperBasicProductGroupFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentShopkeeperBasicProductGroup getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopkeeperBasicProductGroup result = (PersistentShopkeeperBasicProductGroup)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopkeeperBasicProductGroup)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperBasicProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperBasicProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperBasicProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperBasicProductGroup(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperBasicProductGroup(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperBasicProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperBasicProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperBasicProductGroup(this);
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
