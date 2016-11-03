
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
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Shopkeeper provideCopy() throws PersistenceException{
        Shopkeeper result = this;
        result = new Shopkeeper(this.basicProductGroup, 
                                this.This, 
                                this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentProductGroup basicProductGroup;
    protected PersistentShopkeeper This;
    
    public Shopkeeper(PersistentProductGroup basicProductGroup,PersistentShopkeeper This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.basicProductGroup = basicProductGroup;
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
    public int getLeafInfo() throws PersistenceException{
        if (this.getBasicProductGroup() != null) return 1;
        return 0;
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
    
    
    // Start of section that contains operations that must be implemented.
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
    }
    public void createArticle(final PersistentProductGroup parent, final String description, final String manufacturer, final long price, final long maxStock, final long minStock, final long manuDelivery) 
				throws PersistenceException{
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
