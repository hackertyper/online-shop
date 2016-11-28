package persistence;


public interface PersistentOverNightDelivery extends PersistentCustomerDelivery, OverNightDelivery4Public {
    
    public PersistentOverNightDelivery getThis() throws PersistenceException ;
    
    

}

