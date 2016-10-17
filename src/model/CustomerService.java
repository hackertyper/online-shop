
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerService extends model.Service implements PersistentCustomerService{
    
    
    public static PersistentCustomerService createCustomerService() throws PersistenceException{
        return createCustomerService(false);
    }
    
    public static PersistentCustomerService createCustomerService(boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
                .newDelayedCustomerService(0,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
                .newCustomerService(0,0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCustomerService createCustomerService(boolean delayed$Persistence,PersistentCustomerService This) throws PersistenceException {
        PersistentCustomerService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
                .newDelayedCustomerService(0,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
                .newCustomerService(0,0,-1);
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
            AbstractPersistentRoot manager = (AbstractPersistentRoot)this.getManager();
            if (manager != null) {
                result.put("manager", manager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    manager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && manager.hasEssentialFields())manager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerService provideCopy() throws PersistenceException{
        CustomerService result = this;
        result = new CustomerService(this.lowerLimitPreset, 
                                     this.balancePreset, 
                                     this.This, 
                                     this.manager, 
                                     this.getId());
        result.errors = this.errors.copy(result);
        result.errors = this.errors.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCustomer manager;
    
    public CustomerService(long lowerLimitPreset,long balancePreset,PersistentService This,PersistentCustomer manager,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)lowerLimitPreset,(long)balancePreset,(PersistentService)This,id);
        this.manager = manager;        
    }
    
    static public long getTypeId() {
        return -103;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == -103) ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
            .newCustomerService(lowerLimitPreset,balancePreset,this.getId());
        super.store();
        if(this.getManager() != null){
            this.getManager().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.managerSet(this.getId(), getManager());
        }
        
    }
    
    public PersistentCustomer getManager() throws PersistenceException {
        return this.manager;
    }
    public void setManager(PersistentCustomer newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.manager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.manager = (PersistentCustomer)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.managerSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerService getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerService result = (PersistentCustomerService)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerService)this.This;
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getManager() != null && this.getManager().getTheObject().getLeafInfo() != 0) return 1;
        return 0;
    }
    
    
    public String customerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        String result = "+++";
		return result;
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerService)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void acceptDelivery(final PersistentCustomerOrder customerOrder) 
				throws PersistenceException{
    	customerOrder.acceptDelivery();
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
    	getThis().getManager().addToCart(article, amount, getThis());
    }
    public void checkOut() 
				throws PersistenceException{
    	getThis().getManager().checkOut(getThis());
    }
    public void connected(final String user) 
				throws PersistenceException{
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void deposit(final long amount) 
				throws PersistenceException{
    	getThis().getManager().deposit(amount, getThis());
    }
    public void disconnected() 
				throws PersistenceException{
    }
    public void findArticle(final String description) 
				throws PersistenceException{
    	getThis().getManager().findArticle(description, getThis());
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
        PersistentCustomer customer = Customer.createCustomer();
        customer.setMyAccount(Account.createAccount(super.getLowerLimitPreset(), super.getBalancePreset()));
		getThis().setManager(customer);
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void order() 
				throws PersistenceException{
    	getThis().getManager().order(getThis());
    }
    public void removeFCart(final PersistentQuantifiedArticles article, final PersistentCart cart) 
				throws PersistenceException{
        //TODO: implement method: removeFCart
        
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
    	getThis().getManager().withdraw(amount, getThis());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
