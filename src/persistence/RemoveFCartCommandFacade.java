package persistence;

import model.meta.*;

public class RemoveFCartCommandFacade{

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

	

	public RemoveFCartCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRemoveFCartCommand newRemoveFCartCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentRemoveFCartCommand)PersistentProxi.createProxi(idCreateIfLessZero, 215);
        long id = ConnectionHandler.getTheConnectionHandler().theRemoveFCartCommandFacade.getNextId();
        RemoveFCartCommand result = new RemoveFCartCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRemoveFCartCommand)PersistentProxi.createProxi(id, 215);
    }
    
    public PersistentRemoveFCartCommand newDelayedRemoveFCartCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theRemoveFCartCommandFacade.getNextId();
        RemoveFCartCommand result = new RemoveFCartCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRemoveFCartCommand)PersistentProxi.createProxi(id, 215);
    }
    
    public RemoveFCartCommand getRemoveFCartCommand(long RemoveFCartCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 215)) return 215;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long RemoveFCartCommandId, PersistentQuantifiedArticles articleVal) throws PersistenceException {
        
    }
    public void invokerSet(long RemoveFCartCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long RemoveFCartCommandId, PersistentCartManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long RemoveFCartCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

