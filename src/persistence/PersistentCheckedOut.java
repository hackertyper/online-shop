package persistence;


public interface PersistentCheckedOut extends PersistentCartState, CheckedOut4Public {
    
    public PersistentCheckedOut getThis() throws PersistenceException ;
    
    

}

