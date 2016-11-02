package persistence;


public interface PersistentSendOrder extends CustomerOrderState, Anything, AbstractPersistentProxi, SendOrder4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentSendOrder getThis() throws PersistenceException ;
    
    

}

