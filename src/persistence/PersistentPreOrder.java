package persistence;


public interface PersistentPreOrder extends Anything, SubjInterface, AbstractPersistentProxi, PreOrder4Public {
    
    public PersistentCartManager getCartManager() throws PersistenceException ;
    public void setCartManager(PersistentCartManager newValue) throws PersistenceException ;
    public long getSum() throws PersistenceException ;
    public void setSum(long newValue) throws PersistenceException ;
    public void setArticleList(PersistentPreOrderArticleList newValue) throws PersistenceException ;
    public PersistentStandardDelivery getStandardDelivery() throws PersistenceException ;
    public void setStandardDelivery(PersistentStandardDelivery newValue) throws PersistenceException ;
    public PersistentOverNightDelivery getOnDelivery() throws PersistenceException ;
    public void setOnDelivery(PersistentOverNightDelivery newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentPreOrder getThis() throws PersistenceException ;
    
    
    public PersistentPreOrderArticleList getArticleList() 
				throws PersistenceException;
    public void articleList_update(final model.meta.QuantifiedArticlesMssgs event) 
				throws PersistenceException;

}

