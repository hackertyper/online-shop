package persistence;


public interface PersistentCartManagerArticleList extends PersistentListProxiInterface<PersistentQuantifiedArticles>, Anything, ObsInterface, AbstractPersistentProxi, CartManagerArticleList4Public {
    
    public PersistentCartManager getObserver() throws PersistenceException ;
    public void setObserver(PersistentCartManager newValue) throws PersistenceException ;
    public PersistentCartManagerArticleList getThis() throws PersistenceException ;
    
    

}

