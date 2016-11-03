package persistence;

import model.*;

public class ShopManagerFacade{

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

	

	public ShopManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopManager newShopManager(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShopManager)PersistentProxi.createProxi(idCreateIfLessZero, 186);
        long id = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.getNextId();
        ShopManager result = new ShopManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopManager)PersistentProxi.createProxi(id, 186);
    }
    
    public PersistentShopManager newDelayedShopManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.getNextId();
        ShopManager result = new ShopManager(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopManager)PersistentProxi.createProxi(id, 186);
    }
    
    public ShopManager getShopManager(long ShopManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 186)) return 186;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void itemRangeSet(long ShopManagerId, PersistentShopManagerItemRange itemRangeVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ShopManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ShopManagerId, PersistentShopManager ThisVal) throws PersistenceException {
        
    }

}
