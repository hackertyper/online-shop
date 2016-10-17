package persistence;


public interface PersistentDelivery extends Anything, AbstractPersistentProxi, Delivery4Public {
    
    public long getRemainingTimeToDelivery() throws PersistenceException ;
    public void setRemainingTimeToDelivery(long newValue) throws PersistenceException ;
    public abstract PersistentDelivery getThis() throws PersistenceException ;
    
    

}

