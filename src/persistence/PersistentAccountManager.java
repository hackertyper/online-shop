package persistence;


public interface PersistentAccountManager extends Anything, SubjInterface, AbstractPersistentProxi, AccountManager4Public {
    
    public PersistentAccount getMyAccount() throws PersistenceException ;
    public void setMyAccount(PersistentAccount newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentAccountManager getThis() throws PersistenceException ;
    
    
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException;
    public PersistentAccountService getMyAccServer() 
				throws PersistenceException;

}

