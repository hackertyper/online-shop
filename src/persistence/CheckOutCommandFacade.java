package persistence;

import model.meta.*;

public class CheckOutCommandFacade{

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

	

	public CheckOutCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCheckOutCommand newCheckOutCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCheckOutCommand)PersistentProxi.createProxi(idCreateIfLessZero, 213);
        long id = ConnectionHandler.getTheConnectionHandler().theCheckOutCommandFacade.getNextId();
        CheckOutCommand result = new CheckOutCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCheckOutCommand)PersistentProxi.createProxi(id, 213);
    }
    
    public PersistentCheckOutCommand newDelayedCheckOutCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCheckOutCommandFacade.getNextId();
        CheckOutCommand result = new CheckOutCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCheckOutCommand)PersistentProxi.createProxi(id, 213);
    }
    
    public CheckOutCommand getCheckOutCommand(long CheckOutCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 213)) return 213;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void invokerSet(long CheckOutCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long CheckOutCommandId, PersistentCartManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long CheckOutCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

