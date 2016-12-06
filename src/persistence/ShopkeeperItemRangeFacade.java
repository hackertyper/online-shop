package persistence;

import model.*;

public class ShopkeeperItemRangeFacade{

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

	

	public ShopkeeperItemRangeFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopkeeperItemRange newShopkeeperItemRange(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShopkeeperItemRange)PersistentProxi.createProxi(idCreateIfLessZero, 246);
        long id = ConnectionHandler.getTheConnectionHandler().theShopkeeperItemRangeFacade.getNextId();
        ShopkeeperItemRange result = new ShopkeeperItemRange(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopkeeperItemRange)PersistentProxi.createProxi(id, 246);
    }
    
    public PersistentShopkeeperItemRange newDelayedShopkeeperItemRange() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theShopkeeperItemRangeFacade.getNextId();
        ShopkeeperItemRange result = new ShopkeeperItemRange(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopkeeperItemRange)PersistentProxi.createProxi(id, 246);
    }
    
    public ShopkeeperItemRange getShopkeeperItemRange(long ShopkeeperItemRangeId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 246)) return 246;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long ShopkeeperItemRangeId, PersistentShopkeeper observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long ShopkeeperItemRangeId, PersistentItem observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public ItemList observeeGet(long ShopkeeperItemRangeId) throws PersistenceException {
        return new ItemList(); // remote access for initialization only!
    }
    public void ThisSet(long ShopkeeperItemRangeId, PersistentShopkeeperItemRange ThisVal) throws PersistenceException {
        
    }

}

