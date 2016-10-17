package persistence;

import model.meta.*;

public class ChangeProductGroupCommandFacade{

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

	

	public ChangeProductGroupCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeProductGroupCommand newChangeProductGroupCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeProductGroupCommand)PersistentProxi.createProxi(idCreateIfLessZero, 125);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeProductGroupCommandFacade.getNextId();
        ChangeProductGroupCommand result = new ChangeProductGroupCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeProductGroupCommand)PersistentProxi.createProxi(id, 125);
    }
    
    public PersistentChangeProductGroupCommand newDelayedChangeProductGroupCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeProductGroupCommandFacade.getNextId();
        ChangeProductGroupCommand result = new ChangeProductGroupCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeProductGroupCommand)PersistentProxi.createProxi(id, 125);
    }
    
    public ChangeProductGroupCommand getChangeProductGroupCommand(long ChangeProductGroupCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 125)) return 125;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void newPGSet(long ChangeProductGroupCommandId, PersistentProductGroup newPGVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeProductGroupCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeProductGroupCommandId, PersistentArticle commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeProductGroupCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

