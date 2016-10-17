package persistence;


public interface PersistentShopKeeperOrder extends PersistentDelivery, ShopKeeperOrder4Public {
    
    public PersistentArticle getArticle() throws PersistenceException ;
    public void setArticle(PersistentArticle newValue) throws PersistenceException ;
    public long getAmount() throws PersistenceException ;
    public void setAmount(long newValue) throws PersistenceException ;
    public PersistentShopKeeperOrder getThis() throws PersistenceException ;
    
    

}

