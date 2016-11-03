package persistence;


public interface PersistentCustomerService extends PersistentService, CustomerService4Public {
    
    public CustomerService_ServicesProxi getServices() throws PersistenceException ;
    public PersistentCustomerManager getManager() throws PersistenceException ;
    public void setManager(PersistentCustomerManager newValue) throws PersistenceException ;
    public PersistentCustomerService getThis() throws PersistenceException ;
    
    

}

