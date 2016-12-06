
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class OrderService extends model.CustomerService implements PersistentOrderService{
    
    
    public static PersistentOrderService createOrderService(PersistentCustomerManager manager) throws PersistenceException{
        return createOrderService(manager,false);
    }
    
    public static PersistentOrderService createOrderService(PersistentCustomerManager manager,boolean delayed$Persistence) throws PersistenceException {
        PersistentOrderService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderServiceFacade
                .newDelayedOrderService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderServiceFacade
                .newOrderService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("manager", manager);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentOrderService createOrderService(PersistentCustomerManager manager,boolean delayed$Persistence,PersistentOrderService This) throws PersistenceException {
        PersistentOrderService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderServiceFacade
                .newDelayedOrderService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderServiceFacade
                .newOrderService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("manager", manager);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot orderMngr = (AbstractPersistentRoot)this.getOrderMngr();
            if (orderMngr != null) {
                result.put("orderMngr", orderMngr.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    orderMngr.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && orderMngr.hasEssentialFields())orderMngr.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public OrderService provideCopy() throws PersistenceException{
        OrderService result = this;
        result = new OrderService(this.subService, 
                                  this.This, 
                                  this.manager, 
                                  this.orderMngr, 
                                  this.getId());
        result.errors = this.errors.copy(result);
        result.errors = this.errors.copy(result);
        result.services = this.services.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentOrderManager orderMngr;
    
    public OrderService(SubjInterface subService,PersistentService This,PersistentCustomerManager manager,PersistentOrderManager orderMngr,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentService)This,(PersistentCustomerManager)manager,id);
        this.orderMngr = orderMngr;        
    }
    
    static public long getTypeId() {
        return -223;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == -223) ConnectionHandler.getTheConnectionHandler().theOrderServiceFacade
            .newOrderService(this.getId());
        super.store();
        if(this.getOrderMngr() != null){
            this.getOrderMngr().store();
            ConnectionHandler.getTheConnectionHandler().theOrderServiceFacade.orderMngrSet(this.getId(), getOrderMngr());
        }
        
    }
    
    public PersistentOrderManager getOrderMngr() throws PersistenceException {
        return this.orderMngr;
    }
    public void setOrderMngr(PersistentOrderManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.orderMngr)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.orderMngr = (PersistentOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOrderServiceFacade.orderMngrSet(this.getId(), newValue);
        }
    }
    public PersistentOrderService getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOrderService result = (PersistentOrderService)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOrderService)this.This;
    }
    
    public void accept(CustomerServiceVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getManager() != null && this.getManager().getTheObject().getLeafInfo() != 0) return 1;
        if (this.getOrderMngr() != null && this.getOrderMngr().getTheObject().getLeafInfo() != 0) return 1;
        if (this.getServices().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentOrderService)This);
		if(this.isTheSameAs(This)){
			this.setManager((PersistentCustomerManager)final$$Fields.get("manager"));
		}
    }
    public String orderService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        String result = "+++";
		return result;
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void acceptDelivery(final PersistentCustomerOrder customerOrder) 
				throws PersistenceException{
        getThis().getOrderMngr().acceptDelivery(customerOrder, getThis());
    }
    public void cancel(final PersistentPreOrder preOrder) 
				throws PersistenceException{
        getThis().getOrderMngr().cancel(preOrder, getThis());
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
		getThis().setOrderMngr(getThis().getManager().getOrderMngr());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void preorder(final PersistentPreOrder preOrder, final PersistentCustomerDelivery deliveryMethod) 
				throws PersistenceException{
        getThis().getOrderMngr().preorder(preOrder, deliveryMethod, getThis());
    }
    public void retoureArticle(final PersistentQuantifiedArticles article, final long amount) 
				throws PersistenceException{
        getThis().getOrderMngr().retoureArticle(article, amount, getThis());
    }
    public void retoureDelivery(final PersistentCustomerOrder customerOrder) 
				throws PersistenceException{
        getThis().getOrderMngr().retoureDelivery(customerOrder, getThis());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
