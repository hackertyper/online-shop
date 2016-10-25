package persistence;

import model.*;

public class RemovedFSaleFacade{

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

	

	public RemovedFSaleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRemovedFSale newRemovedFSale(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentRemovedFSale)PersistentProxi.createProxi(idCreateIfLessZero, 161);
        long id = ConnectionHandler.getTheConnectionHandler().theRemovedFSaleFacade.getNextId();
        RemovedFSale result = new RemovedFSale(null,id);
        Cache.getTheCache().put(result);
        return (PersistentRemovedFSale)PersistentProxi.createProxi(id, 161);
    }
    
    public PersistentRemovedFSale newDelayedRemovedFSale() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theRemovedFSaleFacade.getNextId();
        RemovedFSale result = new RemovedFSale(null,id);
        Cache.getTheCache().put(result);
        return (PersistentRemovedFSale)PersistentProxi.createProxi(id, 161);
    }
    
    public RemovedFSale getRemovedFSale(long RemovedFSaleId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 161)) return 161;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void ThisSet(long RemovedFSaleId, PersistentRemovedFSale ThisVal) throws PersistenceException {
        
    }

}

