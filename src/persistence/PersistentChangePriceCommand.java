package persistence;


public interface PersistentChangePriceCommand extends Anything, ShopkeeperCommand, PersistentCommonDate, AbstractPersistentProxi, ChangePriceCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

