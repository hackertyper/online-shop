package persistence;


public interface PersistentQuantifiedArticlesArticle extends Anything, ObsInterface, AbstractPersistentProxi, QuantifiedArticlesArticle4Public {
    
    public PersistentQuantifiedArticles getObserver() throws PersistenceException ;
    public void setObserver(PersistentQuantifiedArticles newValue) throws PersistenceException ;
    public PersistentArticle getObservee() throws PersistenceException ;
    public void setObservee(PersistentArticle newValue) throws PersistenceException ;
    public PersistentQuantifiedArticlesArticle getThis() throws PersistenceException ;
    
    

}

