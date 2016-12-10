package persistence;


public interface PersistentShopManager extends Anything, SubjInterface, AbstractPersistentProxi, ShopManager4Public {
    
    public ShopManager_ArticleRangeProxi getArticleRange() throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentShopManager getThis() throws PersistenceException ;
    
    
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException;
    public PersistentShopService getMyShopServer() 
				throws PersistenceException;

}

