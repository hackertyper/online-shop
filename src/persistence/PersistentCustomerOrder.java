package persistence;


public interface PersistentCustomerOrder extends PersistentDelivery, CustomerOrder4Public {
    
    public CustomerOrder_ArticleListProxi getArticleList() throws PersistenceException ;
    public PersistentOrderManager getOrdermngr() throws PersistenceException ;
    public void setOrdermngr(PersistentOrderManager newValue) throws PersistenceException ;
    public CustomerOrderState getMyState() throws PersistenceException ;
    public void setMyState(CustomerOrderState newValue) throws PersistenceException ;
    public PersistentCustomerOrder getThis() throws PersistenceException ;
    
    

}

