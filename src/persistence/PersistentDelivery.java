package persistence;


public interface PersistentDelivery extends Anything, SubjInterface, AbstractPersistentProxi, Delivery4Public {
    
    public long getRemainingTimeToDelivery() throws PersistenceException ;
    public void setRemainingTimeToDelivery(long newValue) throws PersistenceException ;
    public java.sql.Timestamp getSentDate() throws PersistenceException ;
    public void setSentDate(java.sql.Timestamp newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentDelivery getThis() throws PersistenceException ;
    
    

}

