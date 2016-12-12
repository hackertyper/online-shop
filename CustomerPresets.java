
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerPresets extends PersistentObject implements PersistentCustomerPresets{
    
    private static PersistentCustomerPresets theCustomerPresets = null;
    public static boolean reset$For$Test = false;
    private static final Object $$lock = new Object();
    public static PersistentCustomerPresets getTheCustomerPresets() throws PersistenceException{
        if (theCustomerPresets == null || reset$For$Test){
            if (reset$For$Test) theCustomerPresets = null;
            class Initializer implements Runnable {
                PersistenceException exception = null;
                public void /* internal */ run(){
                    this.produceSingleton();
                }
                void produceSingleton() {
                    synchronized ($$lock){
                        try {
                            PersistentCustomerPresets proxi = null;
                            proxi = ConnectionHandler.getTheConnectionHandler().theCustomerPresetsFacade.getTheCustomerPresets();
                            theCustomerPresets = proxi;
                            if(proxi.getId() < 0) {
                                ((AbstractPersistentRoot)proxi).setId(proxi.getId() * -1);
                                proxi.initialize(proxi, new java.util.HashMap<String,Object>());
                                proxi.initializeOnCreation();
                            }
                        } catch (PersistenceException e){
                            exception = e;
                        } finally {
                            $$lock.notify();
                        }
                        
                    }
                }
                PersistentCustomerPresets getResult() throws PersistenceException{
                    synchronized ($$lock) {
                        if (exception == null && theCustomerPresets== null) try {$$lock.wait();} catch (InterruptedException e) {}
                        if(exception != null) throw exception;
                        return theCustomerPresets;
                    }
                }
                
            }
            reset$For$Test = false;
            Initializer initializer = new Initializer();
            new Thread(initializer).start();
            return initializer.getResult();
        }
        return theCustomerPresets;
    }
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("lowerLimit", new Long(this.getLowerLimit()).toString());
            result.put("presetAccountBalance", new Long(this.getPresetAccountBalance()).toString());
            result.put("retourePercentage", new Long(this.getRetourePercentage()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerPresets provideCopy() throws PersistenceException{
        CustomerPresets result = this;
        result = new CustomerPresets(this.lowerLimit, 
                                     this.presetAccountBalance, 
                                     this.retourePercentage, 
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
    protected long presetAccountBalance;
    protected long retourePercentage;
    protected SubjInterface subService;
    protected PersistentCustomerPresets This;
    
    public CustomerPresets(long lowerLimit,long presetAccountBalance,long retourePercentage,SubjInterface subService,PersistentCustomerPresets This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.lowerLimit = lowerLimit;
        this.presetAccountBalance = presetAccountBalance;
        this.retourePercentage = retourePercentage;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 157;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        // Singletons cannot be delayed!
    }
    
    public long getLowerLimit() throws PersistenceException {
        return this.lowerLimit;
    }
    public void setLowerLimit(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerPresetsFacade.lowerLimitSet(this.getId(), newValue);
        this.lowerLimit = newValue;
    }
    public long getPresetAccountBalance() throws PersistenceException {
        return this.presetAccountBalance;
    }
    public void setPresetAccountBalance(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerPresetsFacade.presetAccountBalanceSet(this.getId(), newValue);
        this.presetAccountBalance = newValue;
    }
    public long getRetourePercentage() throws PersistenceException {
        return this.retourePercentage;
    }
    public void setRetourePercentage(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCustomerPresetsFacade.retourePercentageSet(this.getId(), newValue);
        this.retourePercentage = newValue;
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
            ConnectionHandler.getTheConnectionHandler().theCustomerPresetsFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentCustomerPresets newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCustomerPresets)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerPresetsFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerPresets getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerPresets result = (PersistentCustomerPresets)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerPresets)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerPresets(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerPresets(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerPresets(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerPresets(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerPresets(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerPresets(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerPresets(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerPresets(this);
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
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerPresets)This);
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
				throws PersistenceException{}
    public void initializeOnCreation() 
				throws PersistenceException{
    	getThis().updatePresets();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        getThis().updatePresets();
    }
    /**
     * Updates the presets.
     */
    public void updatePresets() 
				throws PersistenceException{
        getThis().setLowerLimit(serverConstants.ConfigConstants.getPresetAccountLowerLimit());
        getThis().setPresetAccountBalance(serverConstants.ConfigConstants.getPresetAccountBalance());
        getThis().setRetourePercentage(serverConstants.ConfigConstants.getRetourePercentage());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
