package persistence;


public interface PersistentChangeProductGroupCommand extends Anything, ShopkeeperCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeProductGroupCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

