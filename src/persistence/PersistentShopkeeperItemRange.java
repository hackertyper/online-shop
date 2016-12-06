package persistence;


public interface PersistentShopkeeperItemRange extends Anything, PersistentListProxiInterface<PersistentItem>, ObsInterface, AbstractPersistentProxi, ShopkeeperItemRange4Public {
    
    public PersistentShopkeeper getObserver() throws PersistenceException ;
    public void setObserver(PersistentShopkeeper newValue) throws PersistenceException ;
    public PersistentShopkeeperItemRange getThis() throws PersistenceException ;
    
    

}

