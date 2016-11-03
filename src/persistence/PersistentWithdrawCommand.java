package persistence;


public interface PersistentWithdrawCommand extends CustomerManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, WithdrawCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

