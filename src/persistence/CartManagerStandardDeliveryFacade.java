package persistence;

import model.*;

public class CartManagerStandardDeliveryFacade{

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

	

	public CartManagerStandardDeliveryFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCartManagerStandardDelivery newCartManagerStandardDelivery(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCartManagerStandardDelivery)PersistentProxi.createProxi(idCreateIfLessZero, 259);
        long id = ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade.getNextId();
        CartManagerStandardDelivery result = new CartManagerStandardDelivery(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartManagerStandardDelivery)PersistentProxi.createProxi(id, 259);
    }
    
    public PersistentCartManagerStandardDelivery newDelayedCartManagerStandardDelivery() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade.getNextId();
        CartManagerStandardDelivery result = new CartManagerStandardDelivery(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartManagerStandardDelivery)PersistentProxi.createProxi(id, 259);
    }
    
    public CartManagerStandardDelivery getCartManagerStandardDelivery(long CartManagerStandardDeliveryId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 259)) return 259;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long CartManagerStandardDeliveryId, PersistentCartManager observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long CartManagerStandardDeliveryId, PersistentStandardDelivery observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long CartManagerStandardDeliveryId, PersistentCartManagerStandardDelivery ThisVal) throws PersistenceException {
        
    }

}

