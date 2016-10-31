package persistence;


public interface PersistentAccount extends Anything, SubjInterface, AbstractPersistentProxi, Account4Public {
    
    public long getLowerLimit() throws PersistenceException ;
    public void setLowerLimit(long newValue) throws PersistenceException ;
    public long getBalance() throws PersistenceException ;
    public void setBalance(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentAccount getThis() throws PersistenceException ;
    
    
    public PersistentAccountManager getAccMngr() 
				throws PersistenceException;

}

