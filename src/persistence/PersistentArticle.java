package persistence;


public interface PersistentArticle extends PersistentItem, Article4Public {
    
    public PersistentManufacturer getManufacturer() throws PersistenceException ;
    public void setManufacturer(PersistentManufacturer newValue) throws PersistenceException ;
    public ArticleState getState() throws PersistenceException ;
    public void setState(ArticleState newValue) throws PersistenceException ;
    public PersistentArticleWrapper getMyWrapper() throws PersistenceException ;
    public void setMyWrapper(PersistentArticleWrapper newValue) throws PersistenceException ;
    public long getPrice() throws PersistenceException ;
    public void setPrice(long newValue) throws PersistenceException ;
    public long getMinStock() throws PersistenceException ;
    public void setMinStock(long newValue) throws PersistenceException ;
    public long getMaxStock() throws PersistenceException ;
    public void setMaxStock(long newValue) throws PersistenceException ;
    public long getManuDelivery() throws PersistenceException ;
    public void setManuDelivery(long newValue) throws PersistenceException ;
    public long getStock() throws PersistenceException ;
    public void setStock(long newValue) throws PersistenceException ;
    public PersistentArticle getThis() throws PersistenceException ;
    
    

}

