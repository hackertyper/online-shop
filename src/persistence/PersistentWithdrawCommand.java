package persistence;


public interface PersistentWithdrawCommand extends Anything, CustomerCommand, PersistentCommonDate, AbstractPersistentProxi, WithdrawCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

