
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShopkeeperService extends model.Service implements PersistentShopkeeperService{
    
    
    public static PersistentShopkeeperService createShopkeeperService() throws PersistenceException{
        return createShopkeeperService(false);
    }
    
    public static PersistentShopkeeperService createShopkeeperService(boolean delayed$Persistence) throws PersistenceException {
        PersistentShopkeeperService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
                .newDelayedShopkeeperService(0,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
                .newShopkeeperService(0,0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentShopkeeperService createShopkeeperService(boolean delayed$Persistence,PersistentShopkeeperService This) throws PersistenceException {
        PersistentShopkeeperService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
                .newDelayedShopkeeperService(0,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
                .newShopkeeperService(0,0,-1);
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
    
    public ShopkeeperService provideCopy() throws PersistenceException{
        ShopkeeperService result = this;
        result = new ShopkeeperService(this.lowerLimitPreset, 
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
    protected PersistentShopkeeper manager;
    
    public ShopkeeperService(long lowerLimitPreset,long balancePreset,PersistentService This,PersistentShopkeeper manager,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)lowerLimitPreset,(long)balancePreset,(PersistentService)This,id);
        this.manager = manager;        
    }
    
    static public long getTypeId() {
        return -133;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == -133) ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
            .newShopkeeperService(lowerLimitPreset,balancePreset,this.getId());
        super.store();
        if(this.getManager() != null){
            this.getManager().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade.managerSet(this.getId(), getManager());
        }
        
    }
    
    public PersistentShopkeeper getManager() throws PersistenceException {
        return this.manager;
    }
    public void setManager(PersistentShopkeeper newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.manager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.manager = (PersistentShopkeeper)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade.managerSet(this.getId(), newValue);
        }
    }
    public PersistentShopkeeperService getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopkeeperService result = (PersistentShopkeeperService)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopkeeperService)this.This;
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getManager() != null && this.getManager().getTheObject().getLeafInfo() != 0) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentShopkeeperService)This);
		if(this.isTheSameAs(This)){
		}
    }
    public String shopkeeperService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        String result = "+++";
		return result;
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void changeDescription(final PersistentItem item, final String newDescription) 
				throws PersistenceException{
        //TODO: implement method: changeDescription
        
    }
    public void changeManufacturerDelivery(final long newManuDelivery) 
				throws PersistenceException{
        //TODO: implement method: changeManufacturerDelivery
        
    }
    public void changePrice(final PersistentArticle article, final long newPrice) 
				throws PersistenceException{
        //TODO: implement method: changePrice
        
    }
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException{
        //TODO: implement method: changeProductGroup
        
    }
    public void connected(final String user) 
				throws PersistenceException{
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void disconnected() 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
		//TODO: implement method: initializeOnCreation
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
		//TODO: implement method: initializeOnInstantiation
    }
    public void presetBalance(final long amount) 
				throws PersistenceException{
        //TODO: implement method: presetBalance
    	super.setBalancePreset(1000);
    }
    public void presetLowerLimit(final long amount) 
				throws PersistenceException{
        //TODO: implement method: presetLowerLimit
    	super.setLowerLimitPreset(100);
    }
    public void startSelling(final PersistentNewlyAdded article) 
				throws PersistenceException{
        //TODO: implement method: startSelling
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
