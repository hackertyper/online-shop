
package model;

import persistence.*;

import java.util.Iterator;

import model.visitor.*;


/* Additional import section end */

public class OrderManager extends PersistentObject implements PersistentOrderManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentOrderManager getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.getClass(objectId);
        return (PersistentOrderManager)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentOrderManager createOrderManager() throws PersistenceException{
        return createOrderManager(false);
    }
    
    public static PersistentOrderManager createOrderManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentOrderManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
                .newDelayedOrderManager(0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
                .newOrderManager(0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentOrderManager createOrderManager(boolean delayed$Persistence,PersistentOrderManager This) throws PersistenceException {
        PersistentOrderManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
                .newDelayedOrderManager(0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
                .newOrderManager(0,-1);
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
            result.put("orders", this.getOrders().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            result.put("preOrders", this.getPreOrders().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            result.put("retourePrice", new Long(this.getRetourePrice()).toString());
            AbstractPersistentRoot customerManager = (AbstractPersistentRoot)this.getCustomerManager();
            if (customerManager != null) {
                result.put("customerManager", customerManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    customerManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && customerManager.hasEssentialFields())customerManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot myOrderServer = (AbstractPersistentRoot)this.getMyOrderServer();
            if (myOrderServer != null) {
                result.put("myOrderServer", myOrderServer.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myOrderServer.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myOrderServer.hasEssentialFields())myOrderServer.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public OrderManager provideCopy() throws PersistenceException{
        OrderManager result = this;
        result = new OrderManager(this.retourePrice, 
                                  this.subService, 
                                  this.This, 
                                  this.getId());
        result.orders = this.orders.copy(result);
        result.preOrders = this.preOrders.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected OrderManager_OrdersProxi orders;
    protected OrderManager_PreOrdersProxi preOrders;
    protected long retourePrice;
    protected SubjInterface subService;
    protected PersistentOrderManager This;
    
    public OrderManager(long retourePrice,SubjInterface subService,PersistentOrderManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.orders = new OrderManager_OrdersProxi(this);
        this.preOrders = new OrderManager_PreOrdersProxi(this);
        this.retourePrice = retourePrice;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 238;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 238) ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
            .newOrderManager(retourePrice,this.getId());
        super.store();
        this.getOrders().store();
        this.getPreOrders().store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public OrderManager_OrdersProxi getOrders() throws PersistenceException {
        return this.orders;
    }
    public OrderManager_PreOrdersProxi getPreOrders() throws PersistenceException {
        return this.preOrders;
    }
    public long getRetourePrice() throws PersistenceException {
        return this.retourePrice;
    }
    public void setRetourePrice(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.retourePriceSet(this.getId(), newValue);
        this.retourePrice = newValue;
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
            ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentOrderManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentOrderManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOrderManager result = (PersistentOrderManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOrderManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getOrders().getLength() > 0) return 1;
        if (this.getPreOrders().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void acceptDelivery(final PersistentCustomerOrder arrivedOrder, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentAcceptDeliveryCommand command = model.meta.AcceptDeliveryCommand.createAcceptDeliveryCommand(now, now);
		command.setArrivedOrder(arrivedOrder);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void cancel(final PersistentPreOrder preOrder, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentCancelCommand command = model.meta.CancelCommand.createCancelCommand(now, now);
		command.setPreOrder(preOrder);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        CustomerManagerSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
										.inverseGetOrderMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public PersistentOrderService getMyOrderServer() 
				throws PersistenceException{
        OrderServiceSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theOrderServiceFacade
										.inverseGetOrderMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentOrderManager)This);
		if(this.isTheSameAs(This)){
		}
    }
    public void preorder(final PersistentPreOrder preOrder, final PersistentCustomerDelivery deliveryMethod, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentPreorderCommand command = model.meta.PreorderCommand.createPreorderCommand(now, now);
		command.setPreOrder(preOrder);
		command.setDeliveryMethod(deliveryMethod);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    public void retoureArticle(final PersistentQuantifiedArticles article, final long amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentRetoureArticleCommand command = model.meta.RetoureArticleCommand.createRetoureArticleCommand(amount, now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void retoureDelivery(final PersistentCustomerOrder arrivedOrder, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentRetoureDeliveryCommand command = model.meta.RetoureDeliveryCommand.createRetoureDeliveryCommand(now, now);
		command.setArrivedOrder(arrivedOrder);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    
    /**
     * Accepts the arrived delivery. Deletes the delivery from view. 
     */
    public void acceptDelivery(final PersistentCustomerOrder arrivedOrder) 
				throws model.NotArrived, PersistenceException{
    	arrivedOrder.getMyState().accept(new CustomerOrderStateExceptionVisitor<NotArrived>() {
			@Override
			public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder)
					throws PersistenceException, NotArrived {}
			@Override
			public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException, NotArrived {
				throw new NotArrived(serverConstants.ErrorMessages.NotArrived);
			}
		});
    	arrivedOrder.accepted();
    	getThis().getOrders().filter(new Predcate<PersistentCustomerOrder>() {
			@Override
			public boolean test(PersistentCustomerOrder argument) throws PersistenceException {
				return !arrivedOrder.equals(argument);
			}
		});
    	getThis().getCustomerManager().getMyCustomerServer().getServices().applyToAll(new Procdure<PersistentCustomerService>() {
			@Override
			public void doItTo(PersistentCustomerService argument) throws PersistenceException {
				argument.signalChanged(true);
			}
		});
    }
    /**
     * Adds new order to view.
     */
    public void addOrder(final PersistentCustomerOrder order) 
				throws PersistenceException{
    	order.setOrdermngr(getThis());
    	getThis().getOrders().add(order);
    	getThis().getCustomerManager().signalChanged();
    }
    public void addPreOrder(final PersistentPreOrder preOrder) 
				throws PersistenceException{
        getThis().getPreOrders().add(preOrder);
        getThis().getCustomerManager().signalChanged();
    }
    public void cancel(final PersistentPreOrder preOrder) 
				throws PersistenceException{
        preOrder.cancel();
        getThis().getPreOrders().removeFirstSuccess(new Predcate<PersistentPreOrder>() {
			@Override
			public boolean test(PersistentPreOrder argument) throws PersistenceException {
				return argument.equals(preOrder);
			}
		});
        getThis().getCustomerManager().signalChanged();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    public void preorder(final PersistentPreOrder preOrder, final PersistentCustomerDelivery deliveryMethod) 
				throws model.InsufficientFunds, PersistenceException{
    	PersistentCustomerOrder co = preOrder.preorder(deliveryMethod);
    	if(co != null) {
    		co.send();
            getThis().getOrders().add(co);
            getThis().getPreOrders().removeFirstSuccess(new Predcate<PersistentPreOrder>() {
    			@Override
    			public boolean test(PersistentPreOrder argument) throws PersistenceException {
    				return argument.equals(preOrder);
    			}
    		});
            getThis().getCustomerManager().signalChanged();
    	}
    }
    /**
     * Returns a single Article of the delivery.
     */
    public void retoureArticle(final PersistentQuantifiedArticles article, final long amount) 
				throws model.NotArrived, model.InsufficientFunds, PersistenceException{
    	if(article.getMyOrder() != null) {
	    	PersistentCustomerOrder order = getThis().getOrders().findFirst(new Predcate<PersistentCustomerOrder>() {
				@Override
				public boolean test(PersistentCustomerOrder argument) throws PersistenceException {
					Iterator<PersistentQuantifiedArticles> iterator = argument.getArticleList().iterator();
					while(iterator.hasNext()) {
						PersistentQuantifiedArticles next = iterator.next();
						return next.equals(article);
					}
					return false;
				}
			});
	    	order.getMyState().accept(new CustomerOrderStateExceptionVisitor<NotArrived>() {
				@Override
				public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder)
						throws PersistenceException, NotArrived {}
				@Override
				public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException, NotArrived {
					throw new NotArrived(serverConstants.ErrorMessages.NotArrived);
				}
			});
	    	article.retoure(amount);
	        getThis().setRetourePrice(getThis().getRetourePrice() + article.fetchPrice());
	        returnPayment();
    	}
    }
    /**
     * Returns the whole delivery.
     */
    public void retoureDelivery(final PersistentCustomerOrder arrivedOrder) 
				throws model.NotArrived, model.InsufficientFunds, PersistenceException{
        arrivedOrder.retoure();
        arrivedOrder.getArticleList().applyToAll(new Procdure<PersistentQuantifiedArticles>() {
			@Override
			public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException {
				getThis().setRetourePrice(getThis().getRetourePrice() + argument.fetchPrice());
			}
		});
        returnPayment();
        getThis().getOrders().filter(new Predcate<PersistentCustomerOrder>() {
			@Override
			public boolean test(PersistentCustomerOrder argument) throws PersistenceException {
				return !arrivedOrder.equals(argument);
			}
		});
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    /**
     * Returns the payment for the delivery. Charges the current retoure percentage.
     * @throws PersistenceException
     * @throws InsufficientFunds
     */
    private void returnPayment() throws PersistenceException, InsufficientFunds {
    	getThis().getCustomerManager().returnPayment(getThis().getRetourePrice());
        getThis().setRetourePrice((getThis().getRetourePrice() * serverConstants.ConfigConstants.getRetourePercentage())/100);
        getThis().getCustomerManager().pay(getThis().getRetourePrice());
    }
    /* End of protected part that is not overridden by persistence generator */
    
}
