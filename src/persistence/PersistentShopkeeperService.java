package persistence;


public interface PersistentShopkeeperService extends PersistentService, ShopkeeperService4Public {
    
    public PersistentShopkeeper getManager() throws PersistenceException ;
    public void setManager(PersistentShopkeeper newValue) throws PersistenceException ;
    public PersistentShopkeeperService getThis() throws PersistenceException ;
    
    

}

