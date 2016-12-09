package persistence;


public interface PersistentChangeDescriptionCommand extends Anything, ShopkeeperCommand, PersistentCommonDate, AbstractPersistentProxi, ChangeDescriptionCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

