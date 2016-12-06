package persistence;


public interface PersistentProductGroupItemList extends Anything, PersistentListProxiInterface<PersistentItem>, ObsInterface, AbstractPersistentProxi, ProductGroupItemList4Public {
    
    public PersistentProductGroup getObserver() throws PersistenceException ;
    public void setObserver(PersistentProductGroup newValue) throws PersistenceException ;
    public PersistentProductGroupItemList getThis() throws PersistenceException ;
    
    

}

