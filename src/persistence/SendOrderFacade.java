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
    public PersistentSendOrder newSendOrder(java.sql.Timestamp arrivalDate,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentSendOrder)PersistentProxi.createProxi(idCreateIfLessZero, 172);
        long id = ConnectionHandler.getTheConnectionHandler().theSendOrderFacade.getNextId();
        SendOrder result = new SendOrder(arrivalDate,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentSendOrder)PersistentProxi.createProxi(id, 172);
    }
    
    public PersistentSendOrder newDelayedSendOrder(java.sql.Timestamp arrivalDate) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theSendOrderFacade.getNextId();
        SendOrder result = new SendOrder(arrivalDate,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentSendOrder)PersistentProxi.createProxi(id, 172);
    }
    
    public SendOrder getSendOrder(long SendOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 172)) return 172;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void arrivalDateSet(long SendOrderId, java.sql.Timestamp arrivalDateVal) throws PersistenceException {
        
    }
    public void subServiceSet(long SendOrderId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long SendOrderId, PersistentSendOrder ThisVal) throws PersistenceException {
        
    }

}

