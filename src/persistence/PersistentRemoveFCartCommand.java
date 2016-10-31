package persistence;


public interface PersistentRemoveFCartCommand extends Anything, CartManagerCommand, PersistentCommonDate, AbstractPersistentProxi, RemoveFCartCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

