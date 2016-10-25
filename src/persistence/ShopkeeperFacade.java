package persistence;

import model.*;

public class ShopkeeperFacade{

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

	

	public ShopkeeperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopkeeper newShopkeeper(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShopkeeper)PersistentProxi.createProxi(idCreateIfLessZero, 151);
        long id = ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.getNextId();
        Shopkeeper result = new Shopkeeper(null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopkeeper)PersistentProxi.createProxi(id, 151);
    }
    
    public PersistentShopkeeper newDelayedShopkeeper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.getNextId();
        Shopkeeper result = new Shopkeeper(null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopkeeper)PersistentProxi.createProxi(id, 151);
    }
    
    public Shopkeeper getShopkeeper(long ShopkeeperId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 151)) return 151;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long itemRangeAdd(long ShopkeeperId, PersistentItem itemRangeVal) throws PersistenceException {
        return 0;
    }
    public void itemRangeRem(long itemRangeId) throws PersistenceException {
        
    }
    public ItemList itemRangeGet(long ShopkeeperId) throws PersistenceException {
        return new ItemList(); // remote access for initialization only!
    }
    public void ThisSet(long ShopkeeperId, PersistentShopkeeper ThisVal) throws PersistenceException {
        
    }

}

