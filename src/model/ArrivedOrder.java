
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ArrivedOrder extends PersistentObject implements PersistentArrivedOrder{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentArrivedOrder getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade.getClass(objectId);
        return (PersistentArrivedOrder)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentArrivedOrder createArrivedOrder() throws PersistenceException{
        return createArrivedOrder(false);
    }
    
    public static PersistentArrivedOrder createArrivedOrder(boolean delayed$Persistence) throws PersistenceException {
        PersistentArrivedOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade
                .newDelayedArrivedOrder(0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade
                .newArrivedOrder(0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentArrivedOrder createArrivedOrder(boolean delayed$Persistence,PersistentArrivedOrder This) throws PersistenceException {
        PersistentArrivedOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade
                .newDelayedArrivedOrder(0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade
                .newArrivedOrder(0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("timtToAccept", new Long(this.getTimtToAccept()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ArrivedOrder provideCopy() throws PersistenceException{
        ArrivedOrder result = this;
        result = new ArrivedOrder(this.timtToAccept, 
                                  this.This, 
                                  this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected long timtToAccept;
    protected PersistentArrivedOrder This;
    
    public ArrivedOrder(long timtToAccept,PersistentArrivedOrder This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.timtToAccept = timtToAccept;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 172;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 172) ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade
            .newArrivedOrder(timtToAccept,this.getId());
        super.store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public long getTimtToAccept() throws PersistenceException {
        return this.timtToAccept;
    }
    public void setTimtToAccept(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade.timtToAcceptSet(this.getId(), newValue);
        this.timtToAccept = newValue;
    }
    protected void setThis(PersistentArrivedOrder newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentArrivedOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentArrivedOrder getThis() throws PersistenceException {
        if(this.This == null){
            PersistentArrivedOrder result = (PersistentArrivedOrder)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentArrivedOrder)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArrivedOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArrivedOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArrivedOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArrivedOrder(this);
    }
    public void accept(CustomerOrderStateVisitor visitor) throws PersistenceException {
        visitor.handleArrivedOrder(this);
    }
    public <R> R accept(CustomerOrderStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArrivedOrder(this);
    }
    public <E extends model.UserException>  void accept(CustomerOrderStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArrivedOrder(this);
    }
    public <R, E extends model.UserException> R accept(CustomerOrderStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArrivedOrder(this);
    }
    public int getLeafInfo() throws PersistenceException{
        return 0;
    }
    
    
    public PersistentCustomerOrder getCustomerOrder() 
				throws PersistenceException{
        CustomerOrderSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
										.inverseGetMyState(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentArrivedOrder)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void acceptDelivery() 
				throws PersistenceException{
        //TODO: implement method: acceptDelivery
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnCreation
        
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    public void retoure(final QuantifiedArticlesSearchList list) 
				throws PersistenceException{
        //TODO: implement method: retoure
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
