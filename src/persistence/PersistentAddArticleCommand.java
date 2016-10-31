package persistence;


public interface PersistentAddArticleCommand extends Anything, CartManagerCommand, PersistentCommonDate, AbstractPersistentProxi, AddArticleCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

