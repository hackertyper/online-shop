package persistence;


public interface PersistentRemovedFSale extends Anything, ArticleState, AbstractPersistentProxi, RemovedFSale4Public {
    
    public PersistentRemovedFSale getThis() throws PersistenceException ;
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException;

}

