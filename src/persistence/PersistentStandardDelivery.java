package persistence;


public interface PersistentStandardDelivery extends PersistentCustomerDelivery, StandardDelivery4Public {
    
    public PersistentStandardDelivery getThis() throws PersistenceException ;
    
    

}

