
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class Shopkeeper extends PersistentObject implements PersistentShopkeeper{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentShopkeeper getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.getClass(objectId);
        return (PersistentShopkeeper)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentShopkeeper createShopkeeper() throws PersistenceException{
        return createShopkeeper(false);
    }
    
    public static PersistentShopkeeper createShopkeeper(boolean delayed$Persistence) throws PersistenceException {
        PersistentShopkeeper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade
                .newDelayedShopkeeper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade
                .newShopkeeper(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentShopkeeper createShopkeeper(boolean delayed$Persistence,PersistentShopkeeper This) throws PersistenceException {
        PersistentShopkeeper result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade
                .newDelayedShopkeeper();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade
                .newShopkeeper(-1);
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
            AbstractPersistentRoot basicProductGroup = (AbstractPersistentRoot)this.getBasicProductGroup();
            if (basicProductGroup != null) {
                result.put("basicProductGroup", basicProductGroup.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    basicProductGroup.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && basicProductGroup.hasEssentialFields())basicProductGroup.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot standardDelivery = (AbstractPersistentRoot)this.getStandardDelivery();
            if (standardDelivery != null) {
                result.put("standardDelivery", standardDelivery.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    standardDelivery.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && standardDelivery.hasEssentialFields())standardDelivery.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot onDelivery = (AbstractPersistentRoot)this.getOnDelivery();
            if (onDelivery != null) {
                result.put("onDelivery", onDelivery.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    onDelivery.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && onDelivery.hasEssentialFields())onDelivery.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Shopkeeper provideCopy() throws PersistenceException{
        Shopkeeper result = this;
        result = new Shopkeeper(this.basicProductGroup, 
                                this.standardDelivery, 
                                this.onDelivery, 
                                this.subService, 
                                this.This, 
                                this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentProductGroup basicProductGroup;
    protected PersistentStandardDelivery standardDelivery;
    protected PersistentOverNightDelivery onDelivery;
    protected SubjInterface subService;
    protected PersistentShopkeeper This;
    
    public Shopkeeper(PersistentProductGroup basicProductGroup,PersistentStandardDelivery standardDelivery,PersistentOverNightDelivery onDelivery,SubjInterface subService,PersistentShopkeeper This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.basicProductGroup = basicProductGroup;
        this.standardDelivery = standardDelivery;
        this.onDelivery = onDelivery;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 133;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 133) ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade
            .newShopkeeper(this.getId());
        super.store();
        if(this.getBasicProductGroup() != null){
            this.getBasicProductGroup().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.basicProductGroupSet(this.getId(), getBasicProductGroup());
        }
        if(this.getStandardDelivery() != null){
            this.getStandardDelivery().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.standardDeliverySet(this.getId(), getStandardDelivery());
        }
        if(this.getOnDelivery() != null){
            this.getOnDelivery().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.onDeliverySet(this.getId(), getOnDelivery());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentProductGroup getBasicProductGroup() throws PersistenceException {
        return this.basicProductGroup;
    }
    public void setBasicProductGroup(PersistentProductGroup newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.basicProductGroup)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.basicProductGroup = (PersistentProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.basicProductGroupSet(this.getId(), newValue);
        }
    }
    public PersistentStandardDelivery getStandardDelivery() throws PersistenceException {
        return this.standardDelivery;
    }
    public void setStandardDelivery(PersistentStandardDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.standardDelivery)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.standardDelivery = (PersistentStandardDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.standardDeliverySet(this.getId(), newValue);
        }
    }
    public PersistentOverNightDelivery getOnDelivery() throws PersistenceException {
        return this.onDelivery;
    }
    public void setOnDelivery(PersistentOverNightDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.onDelivery)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.onDelivery = (PersistentOverNightDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.onDeliverySet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentShopkeeper newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentShopkeeper)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentShopkeeper getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopkeeper result = (PersistentShopkeeper)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopkeeper)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeper(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeper(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getBasicProductGroup() != null) return 1;
        if (this.getStandardDelivery() != null) return 1;
        if (this.getOnDelivery() != null) return 1;
        return 0;
    }
    
    
    public void changeCharge(final PersistentCustomerDelivery cd, final long newCharge, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangeChargeCommand command = model.meta.ChangeChargeCommand.createChangeChargeCommand(newCharge, now, now);
		command.setCd(cd);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangeTimeCommand command = model.meta.ChangeTimeCommand.createChangeTimeCommand(newTime, now, now);
		command.setCd(cd);
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
    public PersistentShopkeeperService getMyServer() 
				throws PersistenceException{
        ShopkeeperServiceSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
										.inverseGetManager(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentShopkeeper)This);
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
    
    public void changeCharge(final PersistentCustomerDelivery cd, final long newCharge) 
				throws PersistenceException{
        //TODO: implement method: changeCharge
        
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException{
        //TODO: implement method: changeTime
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void createArticle(final PersistentProductGroup parent, final String description, final String manufacturer, final long price, final long maxStock, final long minStock, final long manuDelivery) 
				throws model.InvalidStockNumber, PersistenceException{
        parent.addItem(Article.createArticle(description, Manufacturer.createManufacturer(manufacturer), price, minStock, maxStock, manuDelivery));        
    }
    public void createProductGroup(final PersistentProductGroup parent, final String description) 
				throws PersistenceException{
        parent.addItem(ProductGroup.createProductGroup(description));
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        getThis().setBasicProductGroup(ProductGroup.createProductGroup("Produkte"));
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
