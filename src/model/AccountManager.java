
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class AccountManager extends PersistentObject implements PersistentAccountManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentAccountManager getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade.getClass(objectId);
        return (PersistentAccountManager)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentAccountManager createAccountManager() throws PersistenceException{
        return createAccountManager(false);
    }
    
    public static PersistentAccountManager createAccountManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentAccountManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade
                .newDelayedAccountManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade
                .newAccountManager(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentAccountManager createAccountManager(boolean delayed$Persistence,PersistentAccountManager This) throws PersistenceException {
        PersistentAccountManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade
                .newDelayedAccountManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade
                .newAccountManager(-1);
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
            AbstractPersistentRoot customerManager = (AbstractPersistentRoot)this.getCustomerManager();
            if (customerManager != null) {
                result.put("customerManager", customerManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    customerManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && customerManager.hasEssentialFields())customerManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot myAccServer = (AbstractPersistentRoot)this.getMyAccServer();
            if (myAccServer != null) {
                result.put("myAccServer", myAccServer.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myAccServer.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myAccServer.hasEssentialFields())myAccServer.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public AccountManager provideCopy() throws PersistenceException{
        AccountManager result = this;
        result = new AccountManager(this.myAccount, 
                                    this.subService, 
                                    this.This, 
                                    this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentAccount myAccount;
    protected SubjInterface subService;
    protected PersistentAccountManager This;
    
    public AccountManager(PersistentAccount myAccount,SubjInterface subService,PersistentAccountManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.myAccount = myAccount;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 188;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 188) ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade
            .newAccountManager(this.getId());
        super.store();
        if(this.getMyAccount() != null){
            this.getMyAccount().store();
            ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade.myAccountSet(this.getId(), getMyAccount());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade.myAccountSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentAccountManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentAccountManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentAccountManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentAccountManager result = (PersistentAccountManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentAccountManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAccountManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleAccountManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getMyAccount() != null) return 1;
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
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        CustomerManagerSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
										.inverseGetAccMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public PersistentAccountService getMyAccServer() 
				throws PersistenceException{
        AccountServiceSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theAccountServiceFacade
										.inverseGetAccMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentAccountManager)This);
		if(this.isTheSameAs(This)){
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
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void deposit(final long amount) 
				throws PersistenceException{
    	getThis().getMyAccount().deposit(amount);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    	getThis().setMyAccount(Account.createAccount());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
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
