package persistence;

import model.*;

public class CartFacade{

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

	

	public CartFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCart newCart(long currentSum,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCart)PersistentProxi.createProxi(idCreateIfLessZero, 123);
        long id = ConnectionHandler.getTheConnectionHandler().theCartFacade.getNextId();
        Cart result = new Cart(currentSum,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCart)PersistentProxi.createProxi(id, 123);
    }
    
    public PersistentCart newDelayedCart(long currentSum) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCartFacade.getNextId();
        Cart result = new Cart(currentSum,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCart)PersistentProxi.createProxi(id, 123);
    }
    
    public Cart getCart(long CartId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 123)) return 123;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void currentSumSet(long CartId, long currentSumVal) throws PersistenceException {
        
    }
    public void subServiceSet(long CartId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long CartId, PersistentCart ThisVal) throws PersistenceException {
        
    }

}

