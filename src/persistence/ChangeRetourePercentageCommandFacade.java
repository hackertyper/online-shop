package persistence;

import model.meta.*;

public class ChangeRetourePercentageCommandFacade{

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

	

	public ChangeRetourePercentageCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeRetourePercentageCommand newChangeRetourePercentageCommand(long newPercentage,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeRetourePercentageCommand)PersistentProxi.createProxi(idCreateIfLessZero, 262);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeRetourePercentageCommandFacade.getNextId();
        ChangeRetourePercentageCommand result = new ChangeRetourePercentageCommand(newPercentage,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeRetourePercentageCommand)PersistentProxi.createProxi(id, 262);
    }
    
    public PersistentChangeRetourePercentageCommand newDelayedChangeRetourePercentageCommand(long newPercentage) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeRetourePercentageCommandFacade.getNextId();
        ChangeRetourePercentageCommand result = new ChangeRetourePercentageCommand(newPercentage,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeRetourePercentageCommand)PersistentProxi.createProxi(id, 262);
    }
    
    public ChangeRetourePercentageCommand getChangeRetourePercentageCommand(long ChangeRetourePercentageCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 262)) return 262;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void newPercentageSet(long ChangeRetourePercentageCommandId, long newPercentageVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeRetourePercentageCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeRetourePercentageCommandId, PersistentShopkeeper commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeRetourePercentageCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

