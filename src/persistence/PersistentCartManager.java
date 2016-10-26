package persistence;


public interface PersistentCartManager extends Anything, AbstractPersistentProxi, CartManager4Public {
    
    public PersistentCart getMyCart() throws PersistenceException ;
    public void setMyCart(PersistentCart newValue) throws PersistenceException ;
    public PersistentCartManager getThis() throws PersistenceException ;
    
    
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException;
    public PersistentCartService getMyServer() 
				throws PersistenceException;

}

