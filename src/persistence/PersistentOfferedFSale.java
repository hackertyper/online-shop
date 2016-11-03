package persistence;


public interface PersistentOfferedFSale extends Anything, ArticleState, AbstractPersistentProxi, OfferedFSale4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentOfferedFSale getThis() throws PersistenceException ;
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException;

}

