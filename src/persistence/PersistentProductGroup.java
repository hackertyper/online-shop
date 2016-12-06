package persistence;


public interface PersistentProductGroup extends PersistentItem, ProductGroup4Public {
    
    public void setItemList(PersistentProductGroupItemList newValue) throws PersistenceException ;
    public PersistentProductGroup getThis() throws PersistenceException ;
    
    
    public PersistentProductGroupItemList getItemList() 
				throws PersistenceException;
    public void itemList_update(final model.meta.ItemMssgs event) 
				throws PersistenceException;

}

