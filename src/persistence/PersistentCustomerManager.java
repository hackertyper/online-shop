package persistence;


public interface PersistentCustomerManager extends Anything, SubjInterface, AbstractPersistentProxi, CustomerManager4Public {
    
    public PersistentShopManager getShopMngr() throws PersistenceException ;
    public void setShopMngr(PersistentShopManager newValue) throws PersistenceException ;
    public PersistentAccountManager getAccMngr() throws PersistenceException ;
    public void setAccMngr(PersistentAccountManager newValue) throws PersistenceException ;
    public PersistentCartManager getCartMngr() throws PersistenceException ;
    public void setCartMngr(PersistentCartManager newValue) throws PersistenceException ;
    public PersistentOrderManager getOrderMngr() throws PersistenceException ;
    public void setOrderMngr(PersistentOrderManager newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentCustomerManager getThis() throws PersistenceException ;
    
    
    public PersistentCustomerService getMyCustomerServer() 
				throws PersistenceException;

}

