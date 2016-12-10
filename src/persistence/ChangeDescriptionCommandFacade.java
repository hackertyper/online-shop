package persistence;

import model.meta.*;

public class ChangeDescriptionCommandFacade{

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

	

	public ChangeDescriptionCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeDescriptionCommand newChangeDescriptionCommand(String newDescription,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeDescriptionCommand)PersistentProxi.createProxi(idCreateIfLessZero, 176);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeDescriptionCommandFacade.getNextId();
        ChangeDescriptionCommand result = new ChangeDescriptionCommand(null,newDescription,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeDescriptionCommand)PersistentProxi.createProxi(id, 176);
    }
    
    public PersistentChangeDescriptionCommand newDelayedChangeDescriptionCommand(String newDescription) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeDescriptionCommandFacade.getNextId();
        ChangeDescriptionCommand result = new ChangeDescriptionCommand(null,newDescription,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeDescriptionCommand)PersistentProxi.createProxi(id, 176);
    }
    
    public ChangeDescriptionCommand getChangeDescriptionCommand(long ChangeDescriptionCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 176)) return 176;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void itemSet(long ChangeDescriptionCommandId, PersistentItem itemVal) throws PersistenceException {
        
    }
    public void newDescriptionSet(long ChangeDescriptionCommandId, String newDescriptionVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeDescriptionCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeDescriptionCommandId, PersistentShopkeeper commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeDescriptionCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

