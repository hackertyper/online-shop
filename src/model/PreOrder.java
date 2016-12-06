
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class PreOrder extends PersistentObject implements PersistentPreOrder{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentPreOrder getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.getClass(objectId);
        return (PersistentPreOrder)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentPreOrder createPreOrder(PersistentCustomerOrder order) throws PersistenceException{
        return createPreOrder(order,false);
    }
    
    public static PersistentPreOrder createPreOrder(PersistentCustomerOrder order,boolean delayed$Persistence) throws PersistenceException {
        PersistentPreOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
                .newDelayedPreOrder();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
                .newPreOrder(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("order", order);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentPreOrder createPreOrder(PersistentCustomerOrder order,boolean delayed$Persistence,PersistentPreOrder This) throws PersistenceException {
        PersistentPreOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
                .newDelayedPreOrder();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
                .newPreOrder(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("order", order);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot order = (AbstractPersistentRoot)this.getOrder();
            if (order != null) {
                result.put("order", order.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    order.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && order.hasEssentialFields())order.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public PreOrder provideCopy() throws PersistenceException{
        PreOrder result = this;
        result = new PreOrder(this.order, 
                              this.subService, 
                              this.This, 
                              this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomerOrder order;
    protected SubjInterface subService;
    protected PersistentPreOrder This;
    
    public PreOrder(PersistentCustomerOrder order,SubjInterface subService,PersistentPreOrder This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.order = order;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 240;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 240) ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
            .newPreOrder(this.getId());
        super.store();
        if(this.getOrder() != null){
            this.getOrder().store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.orderSet(this.getId(), getOrder());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentCustomerOrder getOrder() throws PersistenceException {
        return this.order;
    }
    public void setOrder(PersistentCustomerOrder newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.order)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.order = (PersistentCustomerOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.orderSet(this.getId(), newValue);
        }
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
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentPreOrder newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentPreOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentPreOrder getThis() throws PersistenceException {
        if(this.This == null){
            PersistentPreOrder result = (PersistentPreOrder)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentPreOrder)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrder(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrder(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getOrder() != null) return 1;
        return 0;
    }
    
    
    public synchronized void deregister(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentPreOrder)This);
		if(this.isTheSameAs(This)){
			this.setOrder((PersistentCustomerOrder)final$$Fields.get("order"));
		}
    }
    public synchronized void register(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.register(observee);
    }
    public synchronized void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.updateObservers(event);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void cancel() 
				throws PersistenceException{
        //TODO: implement method: cancel
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{}
    public void initializeOnCreation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnCreation
        
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{}
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
