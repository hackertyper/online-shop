package persistence;


public interface PersistentCancelCommand extends Anything, OrderManagerCommand, PersistentCommonDate, AbstractPersistentProxi, CancelCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

