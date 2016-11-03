package persistence;


public interface PersistentCartState extends Anything, SubjInterface, AbstractPersistentProxi, CartState4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public abstract PersistentCartState getThis() throws PersistenceException ;
    
    

}

