package persistence;


public interface PersistentNewlyAdded extends Anything, ArticleState, AbstractPersistentProxi, NewlyAdded4Public {
    
    public PersistentNewlyAdded getThis() throws PersistenceException ;
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException;

}

