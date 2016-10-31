package persistence;


public interface PersistentArrivedOrder extends CustomerOrderState, Anything, AbstractPersistentProxi, ArrivedOrder4Public {
    
    public long getTimtToAccept() throws PersistenceException ;
    public void setTimtToAccept(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentArrivedOrder getThis() throws PersistenceException ;
    
    
    public PersistentCustomerOrder getCustomerOrder() 
				throws PersistenceException;

}

