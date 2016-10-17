package persistence;


public interface PersistentCustomer extends Anything, AbstractPersistentProxi, Customer4Public {
    
    public PersistentAccount getMyAccount() throws PersistenceException ;
    public void setMyAccount(PersistentAccount newValue) throws PersistenceException ;
    public PersistentCart getMyCart() throws PersistenceException ;
    public void setMyCart(PersistentCart newValue) throws PersistenceException ;
    public Customer_ItemRangeProxi getItemRange() throws PersistenceException ;
    public PersistentCustomer getThis() throws PersistenceException ;
    
    
    public PersistentCustomerService getMyServer() 
				throws PersistenceException;

}

