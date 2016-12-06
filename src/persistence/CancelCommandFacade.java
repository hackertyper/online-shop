package persistence;

import model.meta.*;

public class CancelCommandFacade{

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

	

	public CancelCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCancelCommand newCancelCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCancelCommand)PersistentProxi.createProxi(idCreateIfLessZero, 266);
        long id = ConnectionHandler.getTheConnectionHandler().theCancelCommandFacade.getNextId();
        CancelCommand result = new CancelCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCancelCommand)PersistentProxi.createProxi(id, 266);
    }
    
    public PersistentCancelCommand newDelayedCancelCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCancelCommandFacade.getNextId();
        CancelCommand result = new CancelCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCancelCommand)PersistentProxi.createProxi(id, 266);
    }
    
    public CancelCommand getCancelCommand(long CancelCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 266)) return 266;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void preOrderSet(long CancelCommandId, PersistentPreOrder preOrderVal) throws PersistenceException {
        
    }
    public void invokerSet(long CancelCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long CancelCommandId, PersistentOrderManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long CancelCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

