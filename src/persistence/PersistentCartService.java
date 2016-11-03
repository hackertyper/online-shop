package persistence;


public interface PersistentCartService extends PersistentCustomerService, CartService4Public {
    
    public PersistentCartManager getCartMngr() throws PersistenceException ;
    public void setCartMngr(PersistentCartManager newValue) throws PersistenceException ;
    public PersistentCartService getThis() throws PersistenceException ;
    
    

}

