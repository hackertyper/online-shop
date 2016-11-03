package persistence;


public interface PersistentOpenCart extends PersistentCartState, OpenCart4Public {
    
    public PersistentOpenCart getThis() throws PersistenceException ;
    
    

}

