package persistence;


public interface PersistentCartManager extends Anything, SubjInterface, AbstractPersistentProxi, CartManager4Public {
    
    public PersistentCart getMyCart() throws PersistenceException ;
    public void setMyCart(PersistentCart newValue) throws PersistenceException ;
    public void setArticleList(PersistentCartManagerArticleList newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentCartManager getThis() throws PersistenceException ;
    
    
    public PersistentCartManagerArticleList getArticleList() 
				throws PersistenceException;
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException;
    public PersistentCartService getMyCartServer() 
				throws PersistenceException;
    public void articleList_update(final model.meta.QuantifiedArticlesMssgs event) 
				throws PersistenceException;

}

