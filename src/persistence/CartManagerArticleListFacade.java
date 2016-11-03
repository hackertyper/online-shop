package persistence;

import model.*;

public class CartManagerArticleListFacade{

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

	

	public CartManagerArticleListFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCartManagerArticleList newCartManagerArticleList(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCartManagerArticleList)PersistentProxi.createProxi(idCreateIfLessZero, 213);
        long id = ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade.getNextId();
        CartManagerArticleList result = new CartManagerArticleList(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartManagerArticleList)PersistentProxi.createProxi(id, 213);
    }
    
    public PersistentCartManagerArticleList newDelayedCartManagerArticleList() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade.getNextId();
        CartManagerArticleList result = new CartManagerArticleList(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartManagerArticleList)PersistentProxi.createProxi(id, 213);
    }
    
    public CartManagerArticleList getCartManagerArticleList(long CartManagerArticleListId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 213)) return 213;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long CartManagerArticleListId, PersistentCartManager observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long CartManagerArticleListId, PersistentQuantifiedArticles observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public QuantifiedArticlesList observeeGet(long CartManagerArticleListId) throws PersistenceException {
        return new QuantifiedArticlesList(); // remote access for initialization only!
    }
    public void ThisSet(long CartManagerArticleListId, PersistentCartManagerArticleList ThisVal) throws PersistenceException {
        
    }

}

