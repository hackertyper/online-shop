package persistence;


public interface PersistentFindArticleCommand extends Anything, CustomerCommand, PersistentCommonDate, AbstractPersistentProxi, FindArticleCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

