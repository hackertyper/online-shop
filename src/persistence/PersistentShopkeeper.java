package persistence;


public interface PersistentShopkeeper extends Anything, AbstractPersistentProxi, Shopkeeper4Public {
    
    public Shopkeeper_ItemRangeProxi getItemRange() throws PersistenceException ;
    public PersistentShopkeeper getThis() throws PersistenceException ;
    
    
    public PersistentShopkeeperService getMyServer() 
				throws PersistenceException;

}

