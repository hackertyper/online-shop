package persistence;

import model.*;

public class ArticleWrapperFacade{

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

	

	public ArticleWrapperFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArticleWrapper newArticleWrapper(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentArticleWrapper)PersistentProxi.createProxi(idCreateIfLessZero, 238);
        long id = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.getNextId();
        ArticleWrapper result = new ArticleWrapper(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticleWrapper)PersistentProxi.createProxi(id, 238);
    }
    
    public PersistentArticleWrapper newDelayedArticleWrapper() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theArticleWrapperFacade.getNextId();
        ArticleWrapper result = new ArticleWrapper(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentArticleWrapper)PersistentProxi.createProxi(id, 238);
    }
    
    public ArticleWrapper getArticleWrapper(long ArticleWrapperId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 238)) return 238;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long ArticleWrapperId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ArticleWrapperId, PersistentArticleWrapper ThisVal) throws PersistenceException {
        
    }

}

