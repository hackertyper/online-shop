package persistence;

import model.meta.*;

public class FindArticleCommandFacade{

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

	

	public FindArticleCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentFindArticleCommand newFindArticleCommand(String description,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentFindArticleCommand)PersistentProxi.createProxi(idCreateIfLessZero, 199);
        long id = ConnectionHandler.getTheConnectionHandler().theFindArticleCommandFacade.getNextId();
        FindArticleCommand result = new FindArticleCommand(description,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentFindArticleCommand)PersistentProxi.createProxi(id, 199);
    }
    
    public PersistentFindArticleCommand newDelayedFindArticleCommand(String description) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theFindArticleCommandFacade.getNextId();
        FindArticleCommand result = new FindArticleCommand(description,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentFindArticleCommand)PersistentProxi.createProxi(id, 199);
    }
    
    public FindArticleCommand getFindArticleCommand(long FindArticleCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 199)) return 199;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void descriptionSet(long FindArticleCommandId, String descriptionVal) throws PersistenceException {
        
    }
    public void invokerSet(long FindArticleCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long FindArticleCommandId, PersistentShopManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long FindArticleCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

