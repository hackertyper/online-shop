
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class AccountService extends model.CustomerService implements PersistentAccountService{
    
    
    public static PersistentAccountService createAccountService(PersistentCustomerManager manager) throws PersistenceException{
        return createAccountService(manager,false);
    }
    
    public static PersistentAccountService createAccountService(PersistentCustomerManager manager,boolean delayed$Persistence) throws PersistenceException {
        PersistentAccountService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theAccountServiceFacade
                .newDelayedAccountService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theAccountServiceFacade
                .newAccountService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("manager", manager);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentAccountService createAccountService(PersistentCustomerManager manager,boolean delayed$Persistence,PersistentAccountService This) throws PersistenceException {
        PersistentAccountService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theAccountServiceFacade
                .newDelayedAccountService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theAccountServiceFacade
                .newAccountService(-1);
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
            AbstractPersistentRoot accMngr = (AbstractPersistentRoot)this.getAccMngr();
            if (accMngr != null) {
                result.put("accMngr", accMngr.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    accMngr.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && accMngr.hasEssentialFields())accMngr.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public AccountService provideCopy() throws PersistenceException{
        AccountService result = this;
        result = new AccountService(this.subService, 
                                    this.This, 
                                    this.manager, 
                                    this.accMngr, 
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
    protected PersistentAccountManager accMngr;
    
    public AccountService(SubjInterface subService,PersistentService This,PersistentCustomerManager manager,PersistentAccountManager accMngr,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentService)This,(PersistentCustomerManager)manager,id);
        this.accMngr = accMngr;        
    }
    
    static public long getTypeId() {
        return -186;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == -186) ConnectionHandler.getTheConnectionHandler().theAccountServiceFacade
            .newAccountService(this.getId());
        super.store();
        if(this.getAccMngr() != null){
            this.getAccMngr().store();
            ConnectionHandler.getTheConnectionHandler().theAccountServiceFacade.accMngrSet(this.getId(), getAccMngr());
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
            ConnectionHandler.getTheConnectionHandler().theAccountServiceFacade.accMngrSet(this.getId(), newValue);
        }
    }
    public PersistentAccountService getThis() throws PersistenceException {
        if(this.This == null){
            PersistentAccountService result = (PersistentAccountService)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentAccountService)this.This;
    }
    
    public void accept(CustomerServiceVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getManager() != null && this.getManager().getTheObject().getLeafInfo() != 0) return 1;
        if (this.getAccMngr() != null && this.getAccMngr().getTheObject().getLeafInfo() != 0) return 1;
        if (this.getServices().getLength() > 0) return 1;
        return 0;
    }
    
    
    public String accountService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        String result = "+++";
		return result;
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentAccountService)This);
		if(this.isTheSameAs(This)){
			this.setManager((PersistentCustomerManager)final$$Fields.get("manager"));
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    	// do nothing
    }
    public void deposit(final long amount) 
				throws PersistenceException{
        getThis().getManager().deposit(amount, getThis());
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        getThis().setAccMngr(getManager().getAccMngr());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
        getThis().getManager().withdraw(amount, getThis());
    }
    
    
    // Start of section that contains overridden operations only.
    
    public void connected(final String user) 
				throws PersistenceException{
    	// do nothing
    }
    public void disconnected() 
				throws PersistenceException{
    	// do nothing
    }

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
