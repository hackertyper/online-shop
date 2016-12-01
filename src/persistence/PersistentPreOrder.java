package persistence;


public interface PersistentPreOrder extends CustomerOrderState, Anything, AbstractPersistentProxi, PreOrder4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentPreOrder getThis() throws PersistenceException ;
    
    

}

