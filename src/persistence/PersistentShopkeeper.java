package persistence;


public interface PersistentShopkeeper extends Anything, SubjInterface, AbstractPersistentProxi, Shopkeeper4Public {
    
    public Shopkeeper_ItemRangeProxi getItemRange() throws PersistenceException ;
    public SubjInterface getSubService() throws PersistenceException ;
    public void setSubService(SubjInterface newValue) throws PersistenceException ;
    public PersistentShopkeeper getThis() throws PersistenceException ;
    
    
    public PersistentShopkeeperService getMyServer() 
				throws PersistenceException;

}

