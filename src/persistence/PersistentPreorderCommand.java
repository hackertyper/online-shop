package persistence;


public interface PersistentPreorderCommand extends Anything, OrderManagerCommand, PersistentCommonDate, AbstractPersistentProxi, PreorderCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

