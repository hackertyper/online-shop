package persistence;


public interface PersistentRetoureDeliveryCommand extends Anything, OrderManagerCommand, PersistentCommonDate, AbstractPersistentProxi, RetoureDeliveryCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

