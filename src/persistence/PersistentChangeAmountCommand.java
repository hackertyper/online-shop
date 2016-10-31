package persistence;


public interface PersistentChangeAmountCommand extends Anything, CartManagerCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeAmountCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

