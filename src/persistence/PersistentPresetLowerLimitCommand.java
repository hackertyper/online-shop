package persistence;


public interface PersistentPresetLowerLimitCommand extends Anything, ShopkeeperCommand, PersistentCommonDate, AbstractPersistentProxi, PresetLowerLimitCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

