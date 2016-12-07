
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class OfferedFSale extends PersistentObject implements PersistentOfferedFSale{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentOfferedFSale getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade.getClass(objectId);
        return (PersistentOfferedFSale)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentOfferedFSale createOfferedFSale() throws PersistenceException{
        return createOfferedFSale(false);
    }
    
    public static PersistentOfferedFSale createOfferedFSale(boolean delayed$Persistence) throws PersistenceException {
        PersistentOfferedFSale result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade
                .newDelayedOfferedFSale();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade
                .newOfferedFSale(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentOfferedFSale createOfferedFSale(boolean delayed$Persistence,PersistentOfferedFSale This) throws PersistenceException {
        PersistentOfferedFSale result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade
                .newDelayedOfferedFSale();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade
                .newOfferedFSale(-1);
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
    
    public OfferedFSale provideCopy() throws PersistenceException{
        OfferedFSale result = this;
        result = new OfferedFSale(this.subService, 
                                  this.This, 
                                  this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected SubjInterface subService;
    protected PersistentOfferedFSale This;
    
    public OfferedFSale(SubjInterface subService,PersistentOfferedFSale This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 135;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 135) ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade
            .newOfferedFSale(this.getId());
        super.store();
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade.ThisSet(this.getId(), getThis());
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
            ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentOfferedFSale newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentOfferedFSale)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentOfferedFSale getThis() throws PersistenceException {
        if(this.This == null){
            PersistentOfferedFSale result = (PersistentOfferedFSale)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentOfferedFSale)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOfferedFSale(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOfferedFSale(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOfferedFSale(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOfferedFSale(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOfferedFSale(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOfferedFSale(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOfferedFSale(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOfferedFSale(this);
    }
    public void accept(ArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleOfferedFSale(this);
    }
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOfferedFSale(this);
    }
    public <E extends model.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOfferedFSale(this);
    }
    public <R, E extends model.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOfferedFSale(this);
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
        this.setThis((PersistentOfferedFSale)This);
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
    
    public void addToCart(final long amount, final PersistentCart cart) 
				throws PersistenceException{
        //TODO: implement method: addToCart
        
    }
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
    public void refillStock() 
				throws PersistenceException{
    	//TODO: implement
    }
    public void reorder(final long amount, final long manuDelivery) 
				throws PersistenceException{
        //TODO: implement method: reorder
        
    }
    public void stopSelling() 
				throws PersistenceException{
        getThis().getMyArticle().setState(RemovedFSale.createRemovedFSale());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
