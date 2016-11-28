package persistence;


public interface PersistentChangeTimeCommand extends Anything, ShopkeeperCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeTimeCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

