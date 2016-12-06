package persistence;

import model.*;

public class ProductGroupFacade{



	public ProductGroupFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProductGroup newProductGroup(String description,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProductGroup)PersistentProxi.createProxi(idCreateIfLessZero, 102);
        long id = ConnectionHandler.getTheConnectionHandler().theItemFacade.getNextId();
        ProductGroup result = new ProductGroup(description,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 102);
    }
    
    public PersistentProductGroup newDelayedProductGroup(String description) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theItemFacade.getNextId();
        ProductGroup result = new ProductGroup(description,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 102);
    }
    
    public ProductGroup getProductGroup(long ProductGroupId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void itemListSet(long ProductGroupId, PersistentProductGroupItemList itemListVal) throws PersistenceException {
        
    }

}

