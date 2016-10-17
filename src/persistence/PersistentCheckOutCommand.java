package persistence;


public interface PersistentCheckOutCommand extends Anything, CustomerCommand, PersistentCommonDate, AbstractPersistentProxi, CheckOutCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

