package persistence;


public interface PersistentArrivedOrder extends CustomerOrderState, Anything, AbstractPersistentProxi, ArrivedOrder4Public {
    
    public long getTimeToAccept() throws PersistenceException ;
    public void setTimeToAccept(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentArrivedOrder getThis() throws PersistenceException ;
    
    

}

