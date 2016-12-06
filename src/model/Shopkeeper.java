
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
            result.put("itemRange", this.getItemRange().getObservee().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
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
        result = new Shopkeeper(this.itemRange, 
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
    protected PersistentShopkeeperItemRange itemRange;
    protected PersistentStandardDelivery standardDelivery;
    protected PersistentOverNightDelivery onDelivery;
    protected SubjInterface subService;
    protected PersistentShopkeeper This;
    
    public Shopkeeper(PersistentShopkeeperItemRange itemRange,PersistentStandardDelivery standardDelivery,PersistentOverNightDelivery onDelivery,SubjInterface subService,PersistentShopkeeper This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.itemRange = itemRange;
        this.standardDelivery = standardDelivery;
        this.onDelivery = onDelivery;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 107;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 107) ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade
            .newShopkeeper(this.getId());
        super.store();
        if(this.itemRange != null){
            this.itemRange.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.itemRangeSet(this.getId(), itemRange);
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
    
    public void setItemRange(PersistentShopkeeperItemRange newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.itemRange)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.itemRange = (PersistentShopkeeperItemRange)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.itemRangeSet(this.getId(), newValue);
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
        if (this.getItemRange().getObservee().getLength() > 0) return 1;
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
    public void changeDescription(final PersistentItem item, final String newDescription) 
				throws PersistenceException{
        model.meta.ShopkeeperChangeDescriptionItemStringMssg event = new model.meta.ShopkeeperChangeDescriptionItemStringMssg(item, newDescription, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void changeDescription(final PersistentItem item, final String newDescription, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangeDescriptionCommand command = model.meta.ChangeDescriptionCommand.createChangeDescriptionCommand(newDescription, now, now);
		command.setItem(item);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changePrice(final PersistentArticle article, final long newPrice) 
				throws PersistenceException{
        model.meta.ShopkeeperChangePriceArticleIntegerMssg event = new model.meta.ShopkeeperChangePriceArticleIntegerMssg(article, newPrice, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void changePrice(final PersistentArticle article, final long newPrice, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangePriceCommand command = model.meta.ChangePriceCommand.createChangePriceCommand(newPrice, now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException{
        model.meta.ShopkeeperChangeProductGroupArticleProductGroupMssg event = new model.meta.ShopkeeperChangeProductGroupArticleProductGroupMssg(article, newPG, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
    }
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangeProductGroupCommand command = model.meta.ChangeProductGroupCommand.createChangeProductGroupCommand(now, now);
		command.setArticle(article);
		command.setNewPG(newPG);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeRetourePercentage(final long newPercentage, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangeRetourePercentageCommand command = model.meta.ChangeRetourePercentageCommand.createChangeRetourePercentageCommand(newPercentage, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException{
        model.meta.ShopkeeperChangeTimeCustomerDeliveryIntegerMssg event = new model.meta.ShopkeeperChangeTimeCustomerDeliveryIntegerMssg(cd, newTime, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
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
    public PersistentShopkeeperItemRange getItemRange() 
				throws PersistenceException{
        if (this.itemRange == null) {
			this.setItemRange(model.ShopkeeperItemRange.createShopkeeperItemRange(this.isDelayed$Persistence()));
			this.itemRange.setObserver(this);
		}
		return this.itemRange;
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
    public void presetBalance(final long amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentPresetBalanceCommand command = model.meta.PresetBalanceCommand.createPresetBalanceCommand(amount, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void presetLowerLimit(final long amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentPresetLowerLimitCommand command = model.meta.PresetLowerLimitCommand.createPresetLowerLimitCommand(amount, now, now);
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
        cd.changeExtraCharge(newCharge);
    }
    public void changeDescriptionImplementation(final PersistentItem item, final String newDescription) 
				throws PersistenceException{
        item.changeDescription(newDescription);
    }
    public void changePriceImplementation(final PersistentArticle article, final long newPrice) 
				throws PersistenceException{
        article.changePrice(newPrice);
    }
    public void changeProductGroupImplementation(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException{
        article.changeProductGroup(newPG);
    }
    public void changeRetourePercentage(final long newPercentage) 
				throws PersistenceException{
        serverConstants.ConfigConstants.setRetourePercentage(newPercentage);
    }
    public void changeTimeImplementation(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException{
        cd.changeTime(newTime);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        getThis().setStandardDelivery(StandardDelivery.getTheStandardDelivery());
        getThis().setOnDelivery(OverNightDelivery.getTheOverNightDelivery());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{}
    public void itemRange_update(final model.meta.ItemMssgs event) 
				throws PersistenceException{
        getThis().getMyServer().signalChanged(true);
    }
    public void presetBalance(final long amount) 
				throws PersistenceException{
        serverConstants.ConfigConstants.setPresetAccountBalance(amount);
    }
    public void presetLowerLimit(final long amount) 
				throws PersistenceException{
        serverConstants.ConfigConstants.setPresetAccountLowerLimit(amount);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
