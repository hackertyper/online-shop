package persistence;


public interface PersistentPresetBalanceCommand extends Anything, ShopkeeperCommand, PersistentCommonDate, AbstractPersistentProxi, PresetBalanceCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

