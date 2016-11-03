package persistence;


public interface PersistentOrderService extends PersistentCustomerService, OrderService4Public {
    
    public PersistentOrderManager getOrderMngr() throws PersistenceException ;
    public void setOrderMngr(PersistentOrderManager newValue) throws PersistenceException ;
    public PersistentOrderService getThis() throws PersistenceException ;
    
    

}

