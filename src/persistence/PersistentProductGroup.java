package persistence;


public interface PersistentProductGroup extends PersistentItem, ProductGroup4Public {
    
    public ProductGroup_ItemListProxi getItemList() throws PersistenceException ;
    public PersistentProductGroup getThis() throws PersistenceException ;
    
    

}

