package persistence;


public interface PersistentCartService extends PersistentCustomerService, CartService4Public {
    
    public PersistentCartService getThis() throws PersistenceException ;
    
    

}

