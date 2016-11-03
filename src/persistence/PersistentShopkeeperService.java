package persistence;


public interface PersistentShopkeeperService extends PersistentService, ShopkeeperService4Public {
    
    public PersistentShopkeeper getManager() throws PersistenceException ;
    public void setManager(PersistentShopkeeper newValue) throws PersistenceException ;
    public long getLowerLimitPreset() throws PersistenceException ;
    public void setLowerLimitPreset(long newValue) throws PersistenceException ;
    public long getBalancePreset() throws PersistenceException ;
    public void setBalancePreset(long newValue) throws PersistenceException ;
    public PersistentShopkeeperService getThis() throws PersistenceException ;
    
    

}

