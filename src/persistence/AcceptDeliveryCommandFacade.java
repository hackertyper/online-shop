package persistence;

import model.meta.*;

public class AcceptDeliveryCommandFacade{

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

	

	public AcceptDeliveryCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAcceptDeliveryCommand newAcceptDeliveryCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAcceptDeliveryCommand)PersistentProxi.createProxi(idCreateIfLessZero, 198);
        long id = ConnectionHandler.getTheConnectionHandler().theAcceptDeliveryCommandFacade.getNextId();
        AcceptDeliveryCommand result = new AcceptDeliveryCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAcceptDeliveryCommand)PersistentProxi.createProxi(id, 198);
    }
    
    public PersistentAcceptDeliveryCommand newDelayedAcceptDeliveryCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAcceptDeliveryCommandFacade.getNextId();
        AcceptDeliveryCommand result = new AcceptDeliveryCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAcceptDeliveryCommand)PersistentProxi.createProxi(id, 198);
    }
    
    public AcceptDeliveryCommand getAcceptDeliveryCommand(long AcceptDeliveryCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 198)) return 198;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void arrivedOrderSet(long AcceptDeliveryCommandId, PersistentCustomerOrder arrivedOrderVal) throws PersistenceException {
        
    }
    public void invokerSet(long AcceptDeliveryCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long AcceptDeliveryCommandId, PersistentOrderManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long AcceptDeliveryCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

