package persistence;


public interface PersistentCartManager extends Anything, SubjInterface, AbstractPersistentProxi, CartManager4Public {
    
    public PersistentCart getMyCart() throws PersistenceException ;
    public void setMyCart(PersistentCart newValue) throws PersistenceException ;
    public void setArticleList(PersistentCartManagerArticleList newValue) throws PersistenceException ;
    public void setStandardDelivery(PersistentCartManagerStandardDelivery newValue) throws PersistenceException ;
    public void setOnDelivery(PersistentCartManagerOnDelivery newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentCartManager getThis() throws PersistenceException ;
    
    
    public PersistentCartManagerArticleList getArticleList() 
				throws PersistenceException;
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException;
    public PersistentCartService getMyCartServer() 
				throws PersistenceException;
    public PersistentOverNightDelivery getOnDelivery() 
				throws PersistenceException;
    public PersistentStandardDelivery getStandardDelivery() 
				throws PersistenceException;
    public void setOnDelivery(final PersistentOverNightDelivery onDelivery) 
				throws PersistenceException;
    public void setStandardDelivery(final PersistentStandardDelivery standardDelivery) 
				throws PersistenceException;
    public void articleList_update(final model.meta.QuantifiedArticlesMssgs event) 
				throws PersistenceException;
    public void onDelivery_update(final model.meta.OverNightDeliveryMssgs event) 
				throws PersistenceException;
    public void standardDelivery_update(final model.meta.StandardDeliveryMssgs event) 
				throws PersistenceException;

}

