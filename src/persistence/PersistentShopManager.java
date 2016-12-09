package persistence;


public interface PersistentShopManager extends Anything, SubjInterface, AbstractPersistentProxi, ShopManager4Public {
    
    public void setBasicProductGroup(PersistentShopManagerBasicProductGroup newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentShopManager getThis() throws PersistenceException ;
    
    
    public PersistentProductGroup getBasicProductGroup() 
				throws PersistenceException;
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException;
    public PersistentShopService getMyShopServer() 
				throws PersistenceException;
    public void setBasicProductGroup(final PersistentProductGroup basicProductGroup) 
				throws PersistenceException;
    public void basicProductGroup_update(final model.meta.ProductGroupMssgs event) 
				throws PersistenceException;

}

