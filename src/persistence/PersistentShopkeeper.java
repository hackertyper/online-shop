package persistence;


public interface PersistentShopkeeper extends Anything, SubjInterface, AbstractPersistentProxi, Shopkeeper4Public {
    
    public void setItemRange(PersistentShopkeeperItemRange newValue) throws PersistenceException ;
    public PersistentStandardDelivery getStandardDelivery() throws PersistenceException ;
    public void setStandardDelivery(PersistentStandardDelivery newValue) throws PersistenceException ;
    public PersistentOverNightDelivery getOnDelivery() throws PersistenceException ;
    public void setOnDelivery(PersistentOverNightDelivery newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentShopkeeper getThis() throws PersistenceException ;
    
    
    public PersistentShopkeeperItemRange getItemRange() 
				throws PersistenceException;
    public PersistentShopkeeperService getMyServer() 
				throws PersistenceException;
    public void itemRange_update(final model.meta.ItemMssgs event) 
				throws PersistenceException;

}

