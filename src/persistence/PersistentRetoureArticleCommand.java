package persistence;


public interface PersistentRetoureArticleCommand extends Anything, OrderManagerCommand, PersistentCommonDate, AbstractPersistentProxi, RetoureArticleCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

