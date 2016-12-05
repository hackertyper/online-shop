package persistence;

import model.meta.*;

public class RetoureArticleCommandFacade{

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

	

	public RetoureArticleCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRetoureArticleCommand newRetoureArticleCommand(long amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentRetoureArticleCommand)PersistentProxi.createProxi(idCreateIfLessZero, 242);
        long id = ConnectionHandler.getTheConnectionHandler().theRetoureArticleCommandFacade.getNextId();
        RetoureArticleCommand result = new RetoureArticleCommand(null,amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRetoureArticleCommand)PersistentProxi.createProxi(id, 242);
    }
    
    public PersistentRetoureArticleCommand newDelayedRetoureArticleCommand(long amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theRetoureArticleCommandFacade.getNextId();
        RetoureArticleCommand result = new RetoureArticleCommand(null,amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRetoureArticleCommand)PersistentProxi.createProxi(id, 242);
    }
    
    public RetoureArticleCommand getRetoureArticleCommand(long RetoureArticleCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 242)) return 242;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long RetoureArticleCommandId, PersistentQuantifiedArticles articleVal) throws PersistenceException {
        
    }
    public void amountSet(long RetoureArticleCommandId, long amountVal) throws PersistenceException {
        
    }
    public void invokerSet(long RetoureArticleCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long RetoureArticleCommandId, PersistentOrderManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long RetoureArticleCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

