package persistence;

import model.meta.*;

public class PayCommandFacade{

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

	

	public PayCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentPayCommand newPayCommand(long sum,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentPayCommand)PersistentProxi.createProxi(idCreateIfLessZero, 140);
        long id = ConnectionHandler.getTheConnectionHandler().thePayCommandFacade.getNextId();
        PayCommand result = new PayCommand(sum,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPayCommand)PersistentProxi.createProxi(id, 140);
    }
    
    public PersistentPayCommand newDelayedPayCommand(long sum) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().thePayCommandFacade.getNextId();
        PayCommand result = new PayCommand(sum,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPayCommand)PersistentProxi.createProxi(id, 140);
    }
    
    public PayCommand getPayCommand(long PayCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 140)) return 140;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void sumSet(long PayCommandId, long sumVal) throws PersistenceException {
        
    }
    public void invokerSet(long PayCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long PayCommandId, PersistentCustomer commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long PayCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

