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
        if(idCreateIfLessZero > 0) return (PersistentShopkeeper)PersistentProxi.createProxi(idCreateIfLessZero, 107);
        long id = ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.getNextId();
        Shopkeeper result = new Shopkeeper(null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopkeeper)PersistentProxi.createProxi(id, 107);
    }
    
    public PersistentShopkeeper newDelayedShopkeeper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade.getNextId();
        Shopkeeper result = new Shopkeeper(null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopkeeper)PersistentProxi.createProxi(id, 107);
    }
    
    public Shopkeeper getShopkeeper(long ShopkeeperId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 107)) return 107;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void basicProductGroupSet(long ShopkeeperId, PersistentShopkeeperBasicProductGroup basicProductGroupVal) throws PersistenceException {
        
    }
    public void presetsSet(long ShopkeeperId, PersistentCustomerPresets presetsVal) throws PersistenceException {
        
    }
    public void standardDeliverySet(long ShopkeeperId, PersistentStandardDelivery standardDeliveryVal) throws PersistenceException {
        
    }
    public void onDeliverySet(long ShopkeeperId, PersistentOverNightDelivery onDeliveryVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ShopkeeperId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ShopkeeperId, PersistentShopkeeper ThisVal) throws PersistenceException {
        
    }

}

