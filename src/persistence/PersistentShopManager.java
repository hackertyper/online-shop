package persistence;


public interface PersistentShopManager extends Anything, AbstractPersistentProxi, ShopManager4Public {
    
    public ShopManager_ItemRangeProxi getItemRange() throws PersistenceException ;
    public PersistentShopManager getThis() throws PersistenceException ;
    
    
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException;
    public PersistentShopService getMyShopServer() 
				throws PersistenceException;

}

