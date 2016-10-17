package persistence;


public interface PersistentStartSellingCommand extends Anything, NewlyAddedCommand, PersistentCommonDate, AbstractPersistentProxi, StartSellingCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

