
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerManager extends PersistentObject implements PersistentCustomerManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCustomerManager getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.getClass(objectId);
        return (PersistentCustomerManager)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCustomerManager createCustomerManager() throws PersistenceException{
        return createCustomerManager(false);
    }
    
    public static PersistentCustomerManager createCustomerManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
                .newDelayedCustomerManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
                .newCustomerManager(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCustomerManager createCustomerManager(boolean delayed$Persistence,PersistentCustomerManager This) throws PersistenceException {
        PersistentCustomerManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
                .newDelayedCustomerManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
                .newCustomerManager(-1);
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
            AbstractPersistentRoot myCustomerServer = (AbstractPersistentRoot)this.getMyCustomerServer();
            if (myCustomerServer != null) {
                result.put("myCustomerServer", myCustomerServer.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myCustomerServer.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myCustomerServer.hasEssentialFields())myCustomerServer.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerManager provideCopy() throws PersistenceException{
        CustomerManager result = this;
        result = new CustomerManager(this.shopMngr, 
                                     this.accMngr, 
                                     this.cartMngr, 
                                     this.This, 
                                     this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentShopManager shopMngr;
    protected PersistentAccountManager accMngr;
    protected PersistentCartManager cartMngr;
    protected PersistentCustomerManager This;
    
    public CustomerManager(PersistentShopManager shopMngr,PersistentAccountManager accMngr,PersistentCartManager cartMngr,PersistentCustomerManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.shopMngr = shopMngr;
        this.accMngr = accMngr;
        this.cartMngr = cartMngr;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 184;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 184) ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
            .newCustomerManager(this.getId());
        super.store();
        if(this.getShopMngr() != null){
            this.getShopMngr().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.shopMngrSet(this.getId(), getShopMngr());
        }
        if(this.getAccMngr() != null){
            this.getAccMngr().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.accMngrSet(this.getId(), getAccMngr());
        }
        if(this.getCartMngr() != null){
            this.getCartMngr().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.cartMngrSet(this.getId(), getCartMngr());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentShopManager getShopMngr() throws PersistenceException {
        return this.shopMngr;
    }
    public void setShopMngr(PersistentShopManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.shopMngr)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.shopMngr = (PersistentShopManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.shopMngrSet(this.getId(), newValue);
        }
    }
    public PersistentAccountManager getAccMngr() throws PersistenceException {
        return this.accMngr;
    }
    public void setAccMngr(PersistentAccountManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.accMngr)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.accMngr = (PersistentAccountManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.accMngrSet(this.getId(), newValue);
        }
    }
    public PersistentCartManager getCartMngr() throws PersistenceException {
        return this.cartMngr;
    }
    public void setCartMngr(PersistentCartManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.cartMngr)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.cartMngr = (PersistentCartManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.cartMngrSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentCustomerManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerManager result = (PersistentCustomerManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        return 0;
    }
    
    
    public void acceptDelivery(final PersistentCustomerOrder customerOrder, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentAcceptDeliveryCommand command = model.meta.AcceptDeliveryCommand.createAcceptDeliveryCommand(now, now);
		command.setCustomerOrder(customerOrder);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void addToCart(final PersistentArticle article, final long amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentAddToCartCommand command = model.meta.AddToCartCommand.createAddToCartCommand(amount, now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void checkOut(final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentCheckOutCommand command = model.meta.CheckOutCommand.createCheckOutCommand(now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void deposit(final long amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentDepositCommand command = model.meta.DepositCommand.createDepositCommand(amount, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void findArticle(final String description, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentFindArticleCommand command = model.meta.FindArticleCommand.createFindArticleCommand(description, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public PersistentCustomerService getMyCustomerServer() 
				throws PersistenceException{
        CustomerServiceSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
										.inverseGetManager(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerManager)This);
		if(this.isTheSameAs(This)){
		}
    }
    public void order(final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentOrderCommand command = model.meta.OrderCommand.createOrderCommand(now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void withdraw(final long amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentWithdrawCommand command = model.meta.WithdrawCommand.createWithdrawCommand(amount, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void acceptDelivery(final PersistentCustomerOrder customerOrder) 
				throws PersistenceException{
        //TODO: implement method: acceptDelivery
        
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
    	getThis().getCartMngr().addToCart(article, amount);
    }
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException{
        //TODO: implement method: checkOut
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void deposit(final long amount) 
				throws PersistenceException{
        getThis().getAccMngr().deposit(amount);
    }
    public void findArticle(final String description) 
				throws PersistenceException{
        //TODO: implement method: findArticle
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        getThis().setShopMngr(ShopManager.createShopManager());
        getThis().setAccMngr(AccountManager.createAccountManager());
        getThis().setCartMngr(CartManager.createCartManager());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    public void order() 
				throws PersistenceException{
        //TODO: implement method: order
        
    }
    public void pay(final long sum) 
				throws PersistenceException{
        //TODO: implement method: pay
        
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
        getThis().getAccMngr().withdraw(amount);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
