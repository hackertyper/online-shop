package persistence;

import model.*;

public class QuantifiedArticlesFacade{

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

	

	public QuantifiedArticlesFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentQuantifiedArticles newQuantifiedArticles(long amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentQuantifiedArticles)PersistentProxi.createProxi(idCreateIfLessZero, 156);
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.getNextId();
        QuantifiedArticles result = new QuantifiedArticles(null,amount,null,id);
        Cache.getTheCache().put(result);
        return (PersistentQuantifiedArticles)PersistentProxi.createProxi(id, 156);
    }
    
    public PersistentQuantifiedArticles newDelayedQuantifiedArticles(long amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.getNextId();
        QuantifiedArticles result = new QuantifiedArticles(null,amount,null,id);
        Cache.getTheCache().put(result);
        return (PersistentQuantifiedArticles)PersistentProxi.createProxi(id, 156);
    }
    
    public QuantifiedArticles getQuantifiedArticles(long QuantifiedArticlesId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 156)) return 156;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long QuantifiedArticlesId, PersistentArticle articleVal) throws PersistenceException {
        
    }
    public void amountSet(long QuantifiedArticlesId, long amountVal) throws PersistenceException {
        
    }
    public void ThisSet(long QuantifiedArticlesId, PersistentQuantifiedArticles ThisVal) throws PersistenceException {
        
    }

}

