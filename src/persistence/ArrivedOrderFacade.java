package persistence;

import model.*;

public class ArrivedOrderFacade{

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

	

	public ArrivedOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArrivedOrder newArrivedOrder(long timtToAccept,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentArrivedOrder)PersistentProxi.createProxi(idCreateIfLessZero, 112);
        long id = ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade.getNextId();
        ArrivedOrder result = new ArrivedOrder(timtToAccept,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArrivedOrder)PersistentProxi.createProxi(id, 112);
    }
    
    public PersistentArrivedOrder newDelayedArrivedOrder(long timtToAccept) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade.getNextId();
        ArrivedOrder result = new ArrivedOrder(timtToAccept,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArrivedOrder)PersistentProxi.createProxi(id, 112);
    }
    
    public ArrivedOrder getArrivedOrder(long ArrivedOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 112)) return 112;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void timtToAcceptSet(long ArrivedOrderId, long timtToAcceptVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ArrivedOrderId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ArrivedOrderId, PersistentArrivedOrder ThisVal) throws PersistenceException {
        
    }

}

