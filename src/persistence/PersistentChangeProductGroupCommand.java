package persistence;


public interface PersistentChangeProductGroupCommand extends ArticleCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, ChangeProductGroupCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

