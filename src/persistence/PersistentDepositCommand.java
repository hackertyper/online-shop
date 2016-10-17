package persistence;


public interface PersistentDepositCommand extends Anything, CustomerCommand, PersistentCommonDate, AbstractPersistentProxi, DepositCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

