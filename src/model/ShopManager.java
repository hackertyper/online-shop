
package model;

import persistence.*;

import model.visitor.*;


/* Additional import section end */

public class ShopManager extends PersistentObject implements PersistentShopManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentShopManager getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.getClass(objectId);
        return (PersistentShopManager)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentShopManager createShopManager() throws PersistenceException{
        return createShopManager(false);
    }
    
    public static PersistentShopManager createShopManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentShopManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
                .newDelayedShopManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
                .newShopManager(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentShopManager createShopManager(boolean delayed$Persistence,PersistentShopManager This) throws PersistenceException {
        PersistentShopManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
                .newDelayedShopManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
                .newShopManager(-1);
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
            result.put("itemRange", this.getItemRange().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            AbstractPersistentRoot customerManager = (AbstractPersistentRoot)this.getCustomerManager();
            if (customerManager != null) {
                result.put("customerManager", customerManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    customerManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && customerManager.hasEssentialFields())customerManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot myShopServer = (AbstractPersistentRoot)this.getMyShopServer();
            if (myShopServer != null) {
                result.put("myShopServer", myShopServer.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myShopServer.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myShopServer.hasEssentialFields())myShopServer.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ShopManager provideCopy() throws PersistenceException{
        ShopManager result = this;
        result = new ShopManager(this.This, 
                                 this.getId());
        result.itemRange = this.itemRange.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ShopManager_ItemRangeProxi itemRange;
    protected PersistentShopManager This;
    
    public ShopManager(PersistentShopManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.itemRange = new ShopManager_ItemRangeProxi(this);
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 186;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 186) ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
            .newShopManager(this.getId());
        super.store();
        this.getItemRange().store();
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public ShopManager_ItemRangeProxi getItemRange() throws PersistenceException {
        return this.itemRange;
    }
    protected void setThis(PersistentShopManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentShopManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentShopManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopManager result = (PersistentShopManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getItemRange().getLength() > 0) return 1;
        return 0;
    }
    
    
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        CustomerManagerSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
										.inverseGetShopMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public PersistentShopService getMyShopServer() 
				throws PersistenceException{
        ShopServiceSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theShopServiceFacade
										.inverseGetShopMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentShopManager)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void findArticle(final String description) 
				throws PersistenceException{
        //TODO: implement method: findArticle
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        PersistentProductGroup pg = ProductGroup.createProductGroup("Alles");
		PersistentArticle article = Article.createArticle("Herd", Manufacturer.createManufacturer("Bosch"), 112, 10, 1000, 0);
		pg.getItemList().add(article);
		getThis().getItemRange().add(pg);
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
