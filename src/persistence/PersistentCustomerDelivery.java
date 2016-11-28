package persistence;


public interface PersistentCustomerDelivery extends Anything, SubjInterface, AbstractPersistentProxi, CustomerDelivery4Public {
    
    public long getTime() throws PersistenceException ;
    public void setTime(long newValue) throws PersistenceException ;
    public long getExtraCharge() throws PersistenceException ;
    public void setExtraCharge(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentCustomerDelivery getThis() throws PersistenceException ;
    
    

}

