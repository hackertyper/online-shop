package persistence;


public interface PersistentPreOrderArticleList extends PersistentListProxiInterface<PersistentQuantifiedArticles>, Anything, ObsInterface, AbstractPersistentProxi, PreOrderArticleList4Public {
    
    public PersistentPreOrder getObserver() throws PersistenceException ;
    public void setObserver(PersistentPreOrder newValue) throws PersistenceException ;
    public PersistentPreOrderArticleList getThis() throws PersistenceException ;
    
    

}

