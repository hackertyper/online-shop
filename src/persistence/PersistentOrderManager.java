package persistence;


public interface PersistentOrderManager extends Anything, SubjInterface, AbstractPersistentProxi, OrderManager4Public {
    
    public OrderManager_OrdersProxi getOrders() throws PersistenceException ;
    public long getRetourePrice() throws PersistenceException ;
    public void setRetourePrice(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentOrderManager getThis() throws PersistenceException ;
    
    
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException;
    public PersistentOrderService getMyOrderServer() 
				throws PersistenceException;

}

