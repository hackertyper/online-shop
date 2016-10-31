
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class Account extends PersistentObject implements PersistentAccount{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentAccount getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theAccountFacade.getClass(objectId);
        return (PersistentAccount)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentAccount createAccount() throws PersistenceException{
        return createAccount(false);
    }
    
    public static PersistentAccount createAccount(boolean delayed$Persistence) throws PersistenceException {
        PersistentAccount result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theAccountFacade
                .newDelayedAccount(0,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theAccountFacade
                .newAccount(0,0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentAccount createAccount(boolean delayed$Persistence,PersistentAccount This) throws PersistenceException {
        PersistentAccount result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theAccountFacade
                .newDelayedAccount(0,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theAccountFacade
                .newAccount(0,0,-1);
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
            result.put("lowerLimit", new Long(this.getLowerLimit()).toString());
            result.put("balance", new Long(this.getBalance()).toString());
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
    
    public Account provideCopy() throws PersistenceException{
        Account result = this;
        result = new Account(this.lowerLimit, 
                             this.balance, 
                             this.subService, 
                             this.This, 
                             this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected long lowerLimit;
    protected long balance;
    protected SubjInterface subService;
    protected PersistentAccount This;
    
    public Account(long lowerLimit,long balance,SubjInterface subService,PersistentAccount This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.lowerLimit = lowerLimit;
        this.balance = balance;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 199;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 199) ConnectionHandler.getTheConnectionHandler().theAccountFacade
            .newAccount(lowerLimit,balance,this.getId());
        super.store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theAccountFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theAccountFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public long getLowerLimit() throws PersistenceException {
        return this.lowerLimit;
    }
    public void setLowerLimit(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theAccountFacade.lowerLimitSet(this.getId(), newValue);
        this.lowerLimit = newValue;
    }
    public long getBalance() throws PersistenceException {
        return this.balance;
    }
    public void setBalance(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theAccountFacade.balanceSet(this.getId(), newValue);
        this.balance = newValue;
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
            ConnectionHandler.getTheConnectionHandler().theAccountFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentAccount newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentAccount)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theAccountFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentAccount getThis() throws PersistenceException {
        if(this.This == null){
            PersistentAccount result = (PersistentAccount)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentAccount)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAccount(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccount(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccount(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccount(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleAccount(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccount(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccount(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccount(this);
    }
    public int getLeafInfo() throws PersistenceException{
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
    public PersistentAccountManager getAccMngr() 
				throws PersistenceException{
        AccountManagerSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade
										.inverseGetMyAccount(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentAccount)This);
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
    	getThis().setBalance(getThis().getBalance() + amount);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    	getThis().setBalance(1000);
    	getThis().setLowerLimit(100);
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    public void pay(final long sum) 
				throws PersistenceException{
        //TODO: implement method: pay
        
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
    	if(amount > getBalance() || getThis().getBalance() - amount < getLowerLimit())
    		throw new InsufficientFunds("Not enough money on account!");
        getThis().setBalance(getThis().getBalance() - amount);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
