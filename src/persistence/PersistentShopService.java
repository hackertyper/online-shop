package persistence;


public interface PersistentShopService extends PersistentCustomerService, ShopService4Public {
    
    public PersistentShopService getThis() throws PersistenceException ;
    
    

}

