package persistence;


public interface PersistentShopkeeper extends Anything, SubjInterface, AbstractPersistentProxi, Shopkeeper4Public {
    
    public void setBasicProductGroup(PersistentShopkeeperBasicProductGroup newValue) throws PersistenceException ;
    public void setPresets(PersistentCustomerPresets newValue) throws PersistenceException ;
    public PersistentStandardDelivery getStandardDelivery() throws PersistenceException ;
    public void setStandardDelivery(PersistentStandardDelivery newValue) throws PersistenceException ;
    public PersistentOverNightDelivery getOnDelivery() throws PersistenceException ;
    public void setOnDelivery(PersistentOverNightDelivery newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentShopkeeper getThis() throws PersistenceException ;
    
    
    public PersistentProductGroup getBasicProductGroup() 
				throws PersistenceException;
    public PersistentShopkeeperService getMyServer() 
				throws PersistenceException;
    public void setBasicProductGroup(final PersistentProductGroup basicProductGroup) 
				throws PersistenceException;
    public void basicProductGroup_update(final model.meta.ProductGroupMssgs event) 
				throws PersistenceException;

}

