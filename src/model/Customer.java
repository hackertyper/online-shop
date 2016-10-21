
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class Customer extends PersistentObject implements PersistentCustomer{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCustomer getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCustomerFacade.getClass(objectId);
        return (PersistentCustomer)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCustomer createCustomer() throws PersistenceException{
        return createCustomer(false);
    }
    
    public static PersistentCustomer createCustomer(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomer result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerFacade
                .newDelayedCustomer();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerFacade
                .newCustomer(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCustomer createCustomer(boolean delayed$Persistence,PersistentCustomer This) throws PersistenceException {
        PersistentCustomer result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerFacade
                .newDelayedCustomer();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerFacade
                .newCustomer(-1);
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
            AbstractPersistentRoot myAccount = (AbstractPersistentRoot)this.getMyAccount();
            if (myAccount != null) {
                result.put("myAccount", myAccount.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myAccount.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myAccount.hasEssentialFields())myAccount.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot myCart = (AbstractPersistentRoot)this.getMyCart();
            if (myCart != null) {
                result.put("myCart", myCart.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myCart.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myCart.hasEssentialFields())myCart.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("itemRange", this.getItemRange().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Customer provideCopy() throws PersistenceException{
        Customer result = this;
        result = new Customer(this.myAccount, 
                              this.myCart, 
                              this.This, 
                              this.getId());
        result.itemRange = this.itemRange.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentAccount myAccount;
    protected PersistentCart myCart;
    protected Customer_ItemRangeProxi itemRange;
    protected PersistentCustomer This;
    
    public Customer(PersistentAccount myAccount,PersistentCart myCart,PersistentCustomer This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.myAccount = myAccount;
        this.myCart = myCart;
        this.itemRange = new Customer_ItemRangeProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 106;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 106) ConnectionHandler.getTheConnectionHandler().theCustomerFacade
            .newCustomer(this.getId());
        super.store();
        if(this.getMyAccount() != null){
            this.getMyAccount().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerFacade.myAccountSet(this.getId(), getMyAccount());
        }
        if(this.getMyCart() != null){
            this.getMyCart().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerFacade.myCartSet(this.getId(), getMyCart());
        }
        this.getItemRange().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentAccount getMyAccount() throws PersistenceException {
        return this.myAccount;
    }
    public void setMyAccount(PersistentAccount newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.myAccount)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.myAccount = (PersistentAccount)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerFacade.myAccountSet(this.getId(), newValue);
        }
    }
    public PersistentCart getMyCart() throws PersistenceException {
        return this.myCart;
    }
    public void setMyCart(PersistentCart newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.myCart)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.myCart = (PersistentCart)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerFacade.myCartSet(this.getId(), newValue);
        }
    }
    public Customer_ItemRangeProxi getItemRange() throws PersistenceException {
        return this.itemRange;
    }
    protected void setThis(PersistentCustomer newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomer)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomer getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomer result = (PersistentCustomer)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomer)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomer(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomer(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomer(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomer(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getMyAccount() != null) return 1;
        if (this.getMyCart() != null) return 1;
        if (this.getItemRange().getLength() > 0) return 1;
        return 0;
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
    public PersistentCustomerService getMyServer() 
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
        this.setThis((PersistentCustomer)This);
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
    public void pay(final long sum, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentPayCommand command = model.meta.PayCommand.createPayCommand(sum, now, now);
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
    
    public void addToCart(final PersistentArticle article, final long amount) 
				throws model.InsufficientStock, PersistenceException{
    	article.addToCart(amount, getMyCart());
    }
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException{
    	getThis().getMyCart().checkOut();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void deposit(final long amount) 
				throws PersistenceException{
    	getThis().getMyAccount().deposit(amount);
    }
    public void findArticle(final String description) 
				throws PersistenceException{
    	/*getThis().getItemRange().filterException(new PredcateException<PersistentItem, NoSearchResult>() {
			@Override
			public boolean test(PersistentItem argument) throws PersistenceException, NoSearchResult {
				return false;
			}
		});*/
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    	getThis().setMyCart(Cart.createCart());
    	PersistentArticle a1 = Article.createArticle(Manufacturer.createManufacturer("M1"), 100, 10, 200, 0);
    	a1.setDescription("A1");
    	a1.setState(OfferedFSale.createOfferedFSale());
    	a1.setStock(200);
    	getThis().getItemRange().add(a1);
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    public void order() 
				throws PersistenceException{
    	getThis().getMyCart().order();
    }
    public void pay(final long sum) 
				throws PersistenceException{
    	getThis().getMyAccount().pay(sum);
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
    	getThis().getMyAccount().withdraw(amount);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
