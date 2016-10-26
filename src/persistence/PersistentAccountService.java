package persistence;


public interface PersistentAccountService extends PersistentCustomerService, AccountService4Public {
    
    public PersistentAccountManager getAccMngr() throws PersistenceException ;
    public void setAccMngr(PersistentAccountManager newValue) throws PersistenceException ;
    public PersistentAccountService getThis() throws PersistenceException ;
    
    

}

