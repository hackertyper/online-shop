package persistence;


public interface PersistentSendOrder extends CustomerOrderState, Anything, AbstractPersistentProxi, SendOrder4Public {
    
    public PersistentSendOrder getThis() throws PersistenceException ;
    
    
    public PersistentCustomerOrder getCustomerOrder() 
				throws PersistenceException;

}

