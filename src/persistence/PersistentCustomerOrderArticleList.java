package persistence;


public interface PersistentCustomerOrderArticleList extends PersistentListProxiInterface<PersistentQuantifiedArticles>, Anything, ObsInterface, AbstractPersistentProxi, CustomerOrderArticleList4Public {
    
    public PersistentCustomerOrder getObserver() throws PersistenceException ;
    public void setObserver(PersistentCustomerOrder newValue) throws PersistenceException ;
    public PersistentCustomerOrderArticleList getThis() throws PersistenceException ;
    
    

}

