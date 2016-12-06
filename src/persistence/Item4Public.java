package persistence;


import model.visitor.*;

public interface Item4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(ItemVisitor visitor) throws PersistenceException;
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void changeDescription(final String newDescription) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

