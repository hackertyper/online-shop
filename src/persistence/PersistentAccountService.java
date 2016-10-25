package persistence;


public interface PersistentAccountService extends PersistentCustomerService, AccountService4Public {
    
    public PersistentAccountService getThis() throws PersistenceException ;
    
    

}

