package persistence;

import model.meta.*;

public class ChangeTimeCommandFacade{

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

	

	public ChangeTimeCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeTimeCommand newChangeTimeCommand(long newTime,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeTimeCommand)PersistentProxi.createProxi(idCreateIfLessZero, 237);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeTimeCommandFacade.getNextId();
        ChangeTimeCommand result = new ChangeTimeCommand(null,newTime,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeTimeCommand)PersistentProxi.createProxi(id, 237);
    }
    
    public PersistentChangeTimeCommand newDelayedChangeTimeCommand(long newTime) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeTimeCommandFacade.getNextId();
        ChangeTimeCommand result = new ChangeTimeCommand(null,newTime,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeTimeCommand)PersistentProxi.createProxi(id, 237);
    }
    
    public ChangeTimeCommand getChangeTimeCommand(long ChangeTimeCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 237)) return 237;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void cdSet(long ChangeTimeCommandId, PersistentCustomerDelivery cdVal) throws PersistenceException {
        
    }
    public void newTimeSet(long ChangeTimeCommandId, long newTimeVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeTimeCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeTimeCommandId, PersistentShopkeeper commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeTimeCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

