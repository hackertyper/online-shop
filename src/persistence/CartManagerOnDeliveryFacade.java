package persistence;

import model.*;

public class CartManagerOnDeliveryFacade{

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

	

	public CartManagerOnDeliveryFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCartManagerOnDelivery newCartManagerOnDelivery(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCartManagerOnDelivery)PersistentProxi.createProxi(idCreateIfLessZero, 258);
        long id = ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade.getNextId();
        CartManagerOnDelivery result = new CartManagerOnDelivery(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartManagerOnDelivery)PersistentProxi.createProxi(id, 258);
    }
    
    public PersistentCartManagerOnDelivery newDelayedCartManagerOnDelivery() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCartManagerOnDeliveryFacade.getNextId();
        CartManagerOnDelivery result = new CartManagerOnDelivery(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartManagerOnDelivery)PersistentProxi.createProxi(id, 258);
    }
    
    public CartManagerOnDelivery getCartManagerOnDelivery(long CartManagerOnDeliveryId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 258)) return 258;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long CartManagerOnDeliveryId, PersistentCartManager observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long CartManagerOnDeliveryId, PersistentOverNightDelivery observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long CartManagerOnDeliveryId, PersistentCartManagerOnDelivery ThisVal) throws PersistenceException {
        
    }

}

