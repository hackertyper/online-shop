package persistence;


public interface PersistentCustomerService extends PersistentService, CustomerService4Public {
    
    public PersistentCustomer getManager() throws PersistenceException ;
    public void setManager(PersistentCustomer newValue) throws PersistenceException ;
    public PersistentCustomerService getThis() throws PersistenceException ;
    
    

}

