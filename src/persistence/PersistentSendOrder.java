package persistence;


public interface PersistentSendOrder extends CustomerOrderState, Anything, AbstractPersistentProxi, SendOrder4Public {
    
    public java.sql.Timestamp getArrivalDate() throws PersistenceException ;
    public void setArrivalDate(java.sql.Timestamp newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentSendOrder getThis() throws PersistenceException ;
    
    

}

