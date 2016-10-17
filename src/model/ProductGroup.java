
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ProductGroup extends model.Item implements PersistentProductGroup{
    
    
    public static PersistentProductGroup createProductGroup() throws PersistenceException{
        return createProductGroup(false);
    }
    
    public static PersistentProductGroup createProductGroup(boolean delayed$Persistence) throws PersistenceException {
        PersistentProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newDelayedProductGroup("");
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newProductGroup("",-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentProductGroup createProductGroup(boolean delayed$Persistence,PersistentProductGroup This) throws PersistenceException {
        PersistentProductGroup result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newDelayedProductGroup("");
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
                .newProductGroup("",-1);
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
            result.put("itemList", this.getItemList().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ProductGroup provideCopy() throws PersistenceException{
        ProductGroup result = this;
        result = new ProductGroup(this.description, 
                                  this.This, 
                                  this.getId());
        result.itemList = this.itemList.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected ProductGroup_ItemListProxi itemList;
    
    public ProductGroup(String description,PersistentItem This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((String)description,(PersistentItem)This,id);
        this.itemList = new ProductGroup_ItemListProxi(this);        
    }
    
    static public long getTypeId() {
        return 102;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 102) ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
            .newProductGroup(description,this.getId());
        super.store();
        this.getItemList().store();
        
    }
    
    public ProductGroup_ItemListProxi getItemList() throws PersistenceException {
        return this.itemList;
    }
    public PersistentProductGroup getThis() throws PersistenceException {
        if(this.This == null){
            PersistentProductGroup result = (PersistentProductGroup)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentProductGroup)this.This;
    }
    
    public void accept(ItemVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getItemList().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentProductGroup)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void addItem(final PersistentItem item) 
				throws PersistenceException{
        //TODO: implement method: addItem
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
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
    
    
    // Start of section that contains overridden operations only.
    
    public void changeDescription(final String newDescription) 
				throws PersistenceException{
		// TODO Auto-generated method stub
		
	}

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
