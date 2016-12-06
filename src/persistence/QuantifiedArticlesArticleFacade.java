package persistence;

import model.*;

public class QuantifiedArticlesArticleFacade{

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

	

	public QuantifiedArticlesArticleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentQuantifiedArticlesArticle newQuantifiedArticlesArticle(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentQuantifiedArticlesArticle)PersistentProxi.createProxi(idCreateIfLessZero, 250);
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade.getNextId();
        QuantifiedArticlesArticle result = new QuantifiedArticlesArticle(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentQuantifiedArticlesArticle)PersistentProxi.createProxi(id, 250);
    }
    
    public PersistentQuantifiedArticlesArticle newDelayedQuantifiedArticlesArticle() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade.getNextId();
        QuantifiedArticlesArticle result = new QuantifiedArticlesArticle(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentQuantifiedArticlesArticle)PersistentProxi.createProxi(id, 250);
    }
    
    public QuantifiedArticlesArticle getQuantifiedArticlesArticle(long QuantifiedArticlesArticleId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 250)) return 250;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long QuantifiedArticlesArticleId, PersistentQuantifiedArticles observerVal) throws PersistenceException {
        
    }
    public void observeeSet(long QuantifiedArticlesArticleId, PersistentArticle observeeVal) throws PersistenceException {
        
    }
    public void ThisSet(long QuantifiedArticlesArticleId, PersistentQuantifiedArticlesArticle ThisVal) throws PersistenceException {
        
    }

}

