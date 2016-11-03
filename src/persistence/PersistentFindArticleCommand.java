package persistence;


public interface PersistentFindArticleCommand extends ShopManagerCommand, Anything, PersistentCommonDate, AbstractPersistentProxi, FindArticleCommand4Public {
    
    public PersistentCommonDate getMyCommonDate() throws PersistenceException ;
    public void setMyCommonDate(PersistentCommonDate newValue) throws PersistenceException ;
    
    

}

