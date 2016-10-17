package persistence;


public interface PersistentQuantifiedArticles extends Anything, AbstractPersistentProxi, QuantifiedArticles4Public {
    
    public PersistentArticle getArticle() throws PersistenceException ;
    public void setArticle(PersistentArticle newValue) throws PersistenceException ;
    public long getAmount() throws PersistenceException ;
    public void setAmount(long newValue) throws PersistenceException ;
    public PersistentQuantifiedArticles getThis() throws PersistenceException ;
    
    

}

