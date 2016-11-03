package persistence;


public interface PersistentAcceptDeliveryCommand extends Anything, OrderManagerCommand, PersistentCommonDate, AbstractPersistentProxi, AcceptDeliveryCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

