package persistence;


public interface PersistentShopManager extends Anything, SubjInterface, AbstractPersistentProxi, ShopManager4Public {
    
    public void setItemRange(PersistentShopManagerItemRange newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentShopManager getThis() throws PersistenceException ;
    
    
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException;
    public PersistentShopManagerItemRange getItemRange() 
				throws PersistenceException;
    public PersistentShopService getMyShopServer() 
				throws PersistenceException;
    public void itemRange_update(final model.meta.ItemMssgs event) 
				throws PersistenceException;

}

