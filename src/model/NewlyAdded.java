
package model;

import persistence.*;

import java.sql.Timestamp;
import java.util.Date;

import model.visitor.*;


/* Additional import section end */

public class NewlyAdded extends PersistentObject implements PersistentNewlyAdded{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentNewlyAdded getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade.getClass(objectId);
        return (PersistentNewlyAdded)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentNewlyAdded createNewlyAdded() throws PersistenceException{
        return createNewlyAdded(false);
    }
    
    public static PersistentNewlyAdded createNewlyAdded(boolean delayed$Persistence) throws PersistenceException {
        PersistentNewlyAdded result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade
                .newDelayedNewlyAdded();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade
                .newNewlyAdded(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentNewlyAdded createNewlyAdded(boolean delayed$Persistence,PersistentNewlyAdded This) throws PersistenceException {
        PersistentNewlyAdded result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade
                .newDelayedNewlyAdded();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade
                .newNewlyAdded(-1);
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
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public NewlyAdded provideCopy() throws PersistenceException{
        NewlyAdded result = this;
        result = new NewlyAdded(this.subService, 
                                this.This, 
                                this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected SubjInterface subService;
    protected PersistentNewlyAdded This;
    
    public NewlyAdded(SubjInterface subService,PersistentNewlyAdded This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 143;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 143) ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade
            .newNewlyAdded(this.getId());
        super.store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentNewlyAdded newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentNewlyAdded)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentNewlyAdded getThis() throws PersistenceException {
        if(this.This == null){
            PersistentNewlyAdded result = (PersistentNewlyAdded)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentNewlyAdded)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleNewlyAdded(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewlyAdded(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewlyAdded(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewlyAdded(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleNewlyAdded(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewlyAdded(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewlyAdded(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewlyAdded(this);
    }
    public void accept(ArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleNewlyAdded(this);
    }
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewlyAdded(this);
    }
    public <E extends model.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewlyAdded(this);
    }
    public <R, E extends model.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewlyAdded(this);
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
    public PersistentArticle getMyArticle() 
				throws PersistenceException{
        ArticleSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theArticleFacade
										.inverseGetState(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentNewlyAdded)This);
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
    public void startSelling(final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentStartSellingCommand command = model.meta.StartSellingCommand.createStartSellingCommand(now, now);
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
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnCreation
        
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    public void order(final long amount) 
				throws PersistenceException{
        PersistentShopKeeperOrder sko = ShopKeeperOrder.createShopKeeperOrder(getThis().getMyArticle().getManuDelivery(), new Timestamp(new Date().getTime()), getThis().getMyArticle(), amount);
        sko.deliver();
    }
    public void startSelling() 
				throws PersistenceException{
        getThis().getMyArticle().setState(OfferedFSale.createOfferedFSale());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
