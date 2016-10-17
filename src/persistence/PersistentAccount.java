package persistence;


public interface PersistentAccount extends Anything, AbstractPersistentProxi, Account4Public {
    
    public long getLowerLimit() throws PersistenceException ;
    public void setLowerLimit(long newValue) throws PersistenceException ;
    public long getBalance() throws PersistenceException ;
    public void setBalance(long newValue) throws PersistenceException ;
    public PersistentAccount getThis() throws PersistenceException ;
    
    
    public PersistentCustomer getManager() 
				throws PersistenceException;

}

