package persistence;


public interface PersistentOrderCommand extends Anything, CartManagerCommand, PersistentCommonDate, AbstractPersistentProxi, OrderCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

