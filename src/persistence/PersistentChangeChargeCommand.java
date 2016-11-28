package persistence;


public interface PersistentChangeChargeCommand extends Anything, ShopkeeperCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeChargeCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

