package persistence;

import model.*;

public class PreOrderFacade{

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

	

	public PreOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentPreOrder newPreOrder(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentPreOrder)PersistentProxi.createProxi(idCreateIfLessZero, 240);
        long id = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.getNextId();
        PreOrder result = new PreOrder(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrder)PersistentProxi.createProxi(id, 240);
    }
    
    public PersistentPreOrder newDelayedPreOrder() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.getNextId();
        PreOrder result = new PreOrder(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrder)PersistentProxi.createProxi(id, 240);
    }
    
    public PreOrder getPreOrder(long PreOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 240)) return 240;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long PreOrderId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long PreOrderId, PersistentPreOrder ThisVal) throws PersistenceException {
        
    }

}

