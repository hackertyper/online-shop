package persistence;

import model.meta.*;

public class ChangeManuDeliveryCommandFacade{

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

	

	public ChangeManuDeliveryCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeManuDeliveryCommand newChangeManuDeliveryCommand(long newManuDelivery,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeManuDeliveryCommand)PersistentProxi.createProxi(idCreateIfLessZero, 155);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeManuDeliveryCommandFacade.getNextId();
        ChangeManuDeliveryCommand result = new ChangeManuDeliveryCommand(newManuDelivery,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeManuDeliveryCommand)PersistentProxi.createProxi(id, 155);
    }
    
    public PersistentChangeManuDeliveryCommand newDelayedChangeManuDeliveryCommand(long newManuDelivery) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeManuDeliveryCommandFacade.getNextId();
        ChangeManuDeliveryCommand result = new ChangeManuDeliveryCommand(newManuDelivery,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeManuDeliveryCommand)PersistentProxi.createProxi(id, 155);
    }
    
    public ChangeManuDeliveryCommand getChangeManuDeliveryCommand(long ChangeManuDeliveryCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 155)) return 155;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void newManuDeliverySet(long ChangeManuDeliveryCommandId, long newManuDeliveryVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeManuDeliveryCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeManuDeliveryCommandId, PersistentArticle commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeManuDeliveryCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

