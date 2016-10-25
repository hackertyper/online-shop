package persistence;

import model.*;

public class SendOrderFacade{

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

	

	public SendOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentSendOrder newSendOrder(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentSendOrder)PersistentProxi.createProxi(idCreateIfLessZero, 173);
        long id = ConnectionHandler.getTheConnectionHandler().theSendOrderFacade.getNextId();
        SendOrder result = new SendOrder(null,id);
        Cache.getTheCache().put(result);
        return (PersistentSendOrder)PersistentProxi.createProxi(id, 173);
    }
    
    public PersistentSendOrder newDelayedSendOrder() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theSendOrderFacade.getNextId();
        SendOrder result = new SendOrder(null,id);
        Cache.getTheCache().put(result);
        return (PersistentSendOrder)PersistentProxi.createProxi(id, 173);
    }
    
    public SendOrder getSendOrder(long SendOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 173)) return 173;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void ThisSet(long SendOrderId, PersistentSendOrder ThisVal) throws PersistenceException {
        
    }

}

