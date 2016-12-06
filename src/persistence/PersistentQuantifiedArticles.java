package persistence;


public interface PersistentQuantifiedArticles extends Anything, SubjInterface, AbstractPersistentProxi, QuantifiedArticles4Public {
    
    public void setArticle(PersistentQuantifiedArticlesArticle newValue) throws PersistenceException ;
    public long getAmount() throws PersistenceException ;
    public void setAmount(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentQuantifiedArticles getThis() throws PersistenceException ;
    
    
    public PersistentArticle getArticle() 
				throws PersistenceException;
    public void setArticle(final PersistentArticle article) 
				throws PersistenceException;
    public void article_update(final model.meta.ArticleMssgs event) 
				throws PersistenceException;

}

