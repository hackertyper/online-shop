package persistence;


public interface PersistentCart extends Anything, SubjInterface, AbstractPersistentProxi, Cart4Public {
    
    public long getCurrentSum() throws PersistenceException ;
    public void setCurrentSum(long newValue) throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentCart getThis() throws PersistenceException ;
    
    
    public PersistentCartManager getCartMngr() 
				throws PersistenceException;

}

