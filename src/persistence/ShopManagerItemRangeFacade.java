package persistence;

import model.*;

public class ShopManagerItemRangeFacade{

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

	

	public ShopManagerItemRangeFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopManagerItemRange newShopManagerItemRange(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShopManagerItemRange)PersistentProxi.createProxi(idCreateIfLessZero, 204);
        long id = ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade.getNextId();
        ShopManagerItemRange result = new ShopManagerItemRange(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopManagerItemRange)PersistentProxi.createProxi(id, 204);
    }
    
    public PersistentShopManagerItemRange newDelayedShopManagerItemRange() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade.getNextId();
        ShopManagerItemRange result = new ShopManagerItemRange(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopManagerItemRange)PersistentProxi.createProxi(id, 204);
    }
    
    public ShopManagerItemRange getShopManagerItemRange(long ShopManagerItemRangeId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 204)) return 204;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long ShopManagerItemRangeId, PersistentShopManager observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long ShopManagerItemRangeId, PersistentItem observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public ItemList observeeGet(long ShopManagerItemRangeId) throws PersistenceException {
        return new ItemList(); // remote access for initialization only!
    }
    public void ThisSet(long ShopManagerItemRangeId, PersistentShopManagerItemRange ThisVal) throws PersistenceException {
        
    }

}

