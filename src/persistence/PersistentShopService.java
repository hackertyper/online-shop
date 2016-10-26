package persistence;


public interface PersistentShopService extends PersistentCustomerService, ShopService4Public {
    
    public PersistentShopManager getShopMngr() throws PersistenceException ;
    public void setShopMngr(PersistentShopManager newValue) throws PersistenceException ;
    public PersistentShopService getThis() throws PersistenceException ;
    
    

}

