package persistence;


public interface PersistentAcceptDeliveryCommand extends CustomerManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, AcceptDeliveryCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

