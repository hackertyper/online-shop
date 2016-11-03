package persistence;


public interface PersistentShopManagerItemRange extends Anything, PersistentListProxiInterface<PersistentItem>, ObsInterface, AbstractPersistentProxi, ShopManagerItemRange4Public {
    
    public PersistentShopManager getObserver() throws PersistenceException ;
    public void setObserver(PersistentShopManager newValue) throws PersistenceException ;
    public PersistentShopManagerItemRange getThis() throws PersistenceException ;
    
    

}

