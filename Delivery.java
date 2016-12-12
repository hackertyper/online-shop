
package model;

import java.util.TimerTask;

import common.DeliveryTask;
import common.OrderTimer;
import persistence.*;


/* Additional import section end */

public abstract class Delivery extends PersistentObject implements PersistentDelivery{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentDelivery getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getClass(objectId);
        return (PersistentDelivery)PersistentProxi.createProxi(objectId, classId);
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("remainingTimeToDelivery", new Long(this.getRemainingTimeToDelivery()).toString());
            result.put("sentDate", this.getSentDate());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public abstract Delivery provideCopy() throws PersistenceException;
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected long remainingTimeToDelivery;
    protected java.sql.Timestamp sentDate;
    protected SubjInterface subService;
    protected PersistentDelivery This;
    
    public Delivery(long remainingTimeToDelivery,java.sql.Timestamp sentDate,SubjInterface subService,PersistentDelivery This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.remainingTimeToDelivery = remainingTimeToDelivery;
        this.sentDate = sentDate;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 212;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        super.store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public long getRemainingTimeToDelivery() throws PersistenceException {
        return this.remainingTimeToDelivery;
    }
    public void setRemainingTimeToDelivery(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.remainingTimeToDeliverySet(this.getId(), newValue);
        this.remainingTimeToDelivery = newValue;
    }
    public java.sql.Timestamp getSentDate() throws PersistenceException {
        return this.sentDate;
    }
    public void setSentDate(java.sql.Timestamp newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.sentDateSet(this.getId(), newValue);
        this.sentDate = newValue;
    }
    public SubjInterface getSubService() throws PersistenceException {
        return this.subService;
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.subService)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.subService = (SubjInterface)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.ThisSet(this.getId(), newValue);
        }
    }
    public abstract PersistentDelivery getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentDelivery)This);
		if(this.isTheSameAs(This)){
			this.setRemainingTimeToDelivery((Long)final$$Fields.get("remainingTimeToDelivery"));
			this.setSentDate((java.sql.Timestamp)final$$Fields.get("sentDate"));
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    
    
    // Start of section that contains overridden operations only.
    
    /**
     * Starts the concurrent sending of order.
     */
    public void send() 
				throws PersistenceException{
		OrderTimer.getInstance().send(new DeliveryTask(getThis()), getThis().getRemainingTimeToDelivery());
    }

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
