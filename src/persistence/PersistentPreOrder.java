package persistence;


public interface PersistentPreOrder extends Anything, SubjInterface, AbstractPersistentProxi, PreOrder4Public {
    
    public PersistentCustomerOrder getOrder() throws PersistenceException ;
    public void setOrder(PersistentCustomerOrder newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentPreOrder getThis() throws PersistenceException ;
    
    

}

