package persistence;


public interface PersistentTestDelivery extends PersistentCustomerDelivery, TestDelivery4Public {
    
    public PersistentTestDelivery getThis() throws PersistenceException ;
    
    

}

