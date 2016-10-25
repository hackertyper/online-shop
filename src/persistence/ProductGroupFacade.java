package persistence;

import model.*;

public class ProductGroupFacade{



	public ProductGroupFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProductGroup newProductGroup(String description,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProductGroup)PersistentProxi.createProxi(idCreateIfLessZero, 150);
        long id = ConnectionHandler.getTheConnectionHandler().theItemFacade.getNextId();
        ProductGroup result = new ProductGroup(description,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 150);
    }
    
    public PersistentProductGroup newDelayedProductGroup(String description) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theItemFacade.getNextId();
        ProductGroup result = new ProductGroup(description,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 150);
    }
    
    public ProductGroup getProductGroup(long ProductGroupId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long itemListAdd(long ProductGroupId, PersistentItem itemListVal) throws PersistenceException {
        return 0;
    }
    public void itemListRem(long itemListId) throws PersistenceException {
        
    }
    public ItemList itemListGet(long ProductGroupId) throws PersistenceException {
        return new ItemList(); // remote access for initialization only!
    }

}

