package persistence;

import model.*;

public class ProductGroupItemListFacade{

	static private Long sequencer = new Long(0);

	static protected long getTheNextId(){
		long result = -1;
		synchronized (sequencer) { 
			result = sequencer.longValue() + 1;
			sequencer = new Long(result);
		}
		return result;
	}

	protected long getNextId(){
		return getTheNextId();
	}

	

	public ProductGroupItemListFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProductGroupItemList newProductGroupItemList(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProductGroupItemList)PersistentProxi.createProxi(idCreateIfLessZero, 245);
        long id = ConnectionHandler.getTheConnectionHandler().theProductGroupItemListFacade.getNextId();
        ProductGroupItemList result = new ProductGroupItemList(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroupItemList)PersistentProxi.createProxi(id, 245);
    }
    
    public PersistentProductGroupItemList newDelayedProductGroupItemList() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theProductGroupItemListFacade.getNextId();
        ProductGroupItemList result = new ProductGroupItemList(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroupItemList)PersistentProxi.createProxi(id, 245);
    }
    
    public ProductGroupItemList getProductGroupItemList(long ProductGroupItemListId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 245)) return 245;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long ProductGroupItemListId, PersistentProductGroup observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long ProductGroupItemListId, PersistentItem observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public ItemList observeeGet(long ProductGroupItemListId) throws PersistenceException {
        return new ItemList(); // remote access for initialization only!
    }
    public void ThisSet(long ProductGroupItemListId, PersistentProductGroupItemList ThisVal) throws PersistenceException {
        
    }

}

