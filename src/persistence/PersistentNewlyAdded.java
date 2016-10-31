package persistence;


public interface PersistentNewlyAdded extends Anything, ArticleState, AbstractPersistentProxi, NewlyAdded4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentNewlyAdded getThis() throws PersistenceException ;
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException;

}

