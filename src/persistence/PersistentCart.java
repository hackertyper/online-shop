package persistence;


public interface PersistentCart extends Anything, AbstractPersistentProxi, Cart4Public {
    
    public long getCurrentSum() throws PersistenceException ;
    public void setCurrentSum(long newValue) throws PersistenceException ;
    public Cart_ArticleListProxi getArticleList() throws PersistenceException ;
    public PersistentCart getThis() throws PersistenceException ;
    
    
    public PersistentCustomer getManager() 
				throws PersistenceException;

}

