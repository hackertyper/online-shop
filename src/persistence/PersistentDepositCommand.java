package persistence;


public interface PersistentDepositCommand extends CustomerManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, DepositCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

