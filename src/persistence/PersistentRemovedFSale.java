package persistence;


public interface PersistentRemovedFSale extends Anything, ArticleState, AbstractPersistentProxi, RemovedFSale4Public {
    
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentRemovedFSale getThis() throws PersistenceException ;
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException;

}

