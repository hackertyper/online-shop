package persistence;


public interface PersistentFindArticleCommand extends CustomerManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, FindArticleCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

