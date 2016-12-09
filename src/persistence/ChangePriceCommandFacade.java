package persistence;

import model.meta.*;

public class ChangePriceCommandFacade{

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

	

	public ChangePriceCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangePriceCommand newChangePriceCommand(long newPrice,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangePriceCommand)PersistentProxi.createProxi(idCreateIfLessZero, 127);
        long id = ConnectionHandler.getTheConnectionHandler().theChangePriceCommandFacade.getNextId();
        ChangePriceCommand result = new ChangePriceCommand(null,newPrice,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangePriceCommand)PersistentProxi.createProxi(id, 127);
    }
    
    public PersistentChangePriceCommand newDelayedChangePriceCommand(long newPrice) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangePriceCommandFacade.getNextId();
        ChangePriceCommand result = new ChangePriceCommand(null,newPrice,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangePriceCommand)PersistentProxi.createProxi(id, 127);
    }
    
    public ChangePriceCommand getChangePriceCommand(long ChangePriceCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 127)) return 127;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long ChangePriceCommandId, PersistentArticle articleVal) throws PersistenceException {
        
    }
    public void newPriceSet(long ChangePriceCommandId, long newPriceVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangePriceCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangePriceCommandId, PersistentShopkeeper commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangePriceCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

