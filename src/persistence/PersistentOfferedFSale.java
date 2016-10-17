package persistence;


public interface PersistentOfferedFSale extends Anything, ArticleState, AbstractPersistentProxi, OfferedFSale4Public {
    
    public PersistentOfferedFSale getThis() throws PersistenceException ;
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException;

}

