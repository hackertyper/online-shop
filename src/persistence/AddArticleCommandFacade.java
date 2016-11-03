package persistence;

import model.meta.*;

public class AddArticleCommandFacade{

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

	

	public AddArticleCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAddArticleCommand newAddArticleCommand(long amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAddArticleCommand)PersistentProxi.createProxi(idCreateIfLessZero, 202);
        long id = ConnectionHandler.getTheConnectionHandler().theAddArticleCommandFacade.getNextId();
        AddArticleCommand result = new AddArticleCommand(null,amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddArticleCommand)PersistentProxi.createProxi(id, 202);
    }
    
    public PersistentAddArticleCommand newDelayedAddArticleCommand(long amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAddArticleCommandFacade.getNextId();
        AddArticleCommand result = new AddArticleCommand(null,amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddArticleCommand)PersistentProxi.createProxi(id, 202);
    }
    
    public AddArticleCommand getAddArticleCommand(long AddArticleCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 202)) return 202;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long AddArticleCommandId, PersistentArticle articleVal) throws PersistenceException {
        
    }
    public void amountSet(long AddArticleCommandId, long amountVal) throws PersistenceException {
        
    }
    public void invokerSet(long AddArticleCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long AddArticleCommandId, PersistentCartManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long AddArticleCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

