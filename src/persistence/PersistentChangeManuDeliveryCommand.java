package persistence;


public interface PersistentChangeManuDeliveryCommand extends ArticleCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, ChangeManuDeliveryCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

