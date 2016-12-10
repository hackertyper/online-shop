package persistence;

import model.meta.*;

public class RetoureDeliveryCommandFacade{

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

	

	public RetoureDeliveryCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRetoureDeliveryCommand newRetoureDeliveryCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentRetoureDeliveryCommand)PersistentProxi.createProxi(idCreateIfLessZero, 206);
        long id = ConnectionHandler.getTheConnectionHandler().theRetoureDeliveryCommandFacade.getNextId();
        RetoureDeliveryCommand result = new RetoureDeliveryCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRetoureDeliveryCommand)PersistentProxi.createProxi(id, 206);
    }
    
    public PersistentRetoureDeliveryCommand newDelayedRetoureDeliveryCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theRetoureDeliveryCommandFacade.getNextId();
        RetoureDeliveryCommand result = new RetoureDeliveryCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRetoureDeliveryCommand)PersistentProxi.createProxi(id, 206);
    }
    
    public RetoureDeliveryCommand getRetoureDeliveryCommand(long RetoureDeliveryCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 206)) return 206;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void arrivedOrderSet(long RetoureDeliveryCommandId, PersistentCustomerOrder arrivedOrderVal) throws PersistenceException {
        
    }
    public void invokerSet(long RetoureDeliveryCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long RetoureDeliveryCommandId, PersistentOrderManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long RetoureDeliveryCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

