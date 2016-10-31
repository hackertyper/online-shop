package persistence;

import model.*;

public class OfferedFSaleFacade{

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

	

	public OfferedFSaleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOfferedFSale newOfferedFSale(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOfferedFSale)PersistentProxi.createProxi(idCreateIfLessZero, 110);
        long id = ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade.getNextId();
        OfferedFSale result = new OfferedFSale(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOfferedFSale)PersistentProxi.createProxi(id, 110);
    }
    
    public PersistentOfferedFSale newDelayedOfferedFSale() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade.getNextId();
        OfferedFSale result = new OfferedFSale(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOfferedFSale)PersistentProxi.createProxi(id, 110);
    }
    
    public OfferedFSale getOfferedFSale(long OfferedFSaleId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 110)) return 110;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long OfferedFSaleId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long OfferedFSaleId, PersistentOfferedFSale ThisVal) throws PersistenceException {
        
    }

}

