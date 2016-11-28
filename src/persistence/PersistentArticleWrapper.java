package persistence;


public interface PersistentArticleWrapper extends Anything, SubjInterface, AbstractPersistentProxi, ArticleWrapper4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentArticleWrapper getThis() throws PersistenceException ;
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException;

}

