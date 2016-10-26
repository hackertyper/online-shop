package persistence;


public interface PersistentAddToCartCommand extends CustomerManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, AddToCartCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

