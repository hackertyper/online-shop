package persistence;

import model.*;

public class PreOrderArticleListFacade{

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

	

	public PreOrderArticleListFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentPreOrderArticleList newPreOrderArticleList(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentPreOrderArticleList)PersistentProxi.createProxi(idCreateIfLessZero, 264);
        long id = ConnectionHandler.getTheConnectionHandler().thePreOrderArticleListFacade.getNextId();
        PreOrderArticleList result = new PreOrderArticleList(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrderArticleList)PersistentProxi.createProxi(id, 264);
    }
    
    public PersistentPreOrderArticleList newDelayedPreOrderArticleList() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().thePreOrderArticleListFacade.getNextId();
        PreOrderArticleList result = new PreOrderArticleList(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPreOrderArticleList)PersistentProxi.createProxi(id, 264);
    }
    
    public PreOrderArticleList getPreOrderArticleList(long PreOrderArticleListId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 264)) return 264;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long PreOrderArticleListId, PersistentPreOrder observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long PreOrderArticleListId, PersistentQuantifiedArticles observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public QuantifiedArticlesList observeeGet(long PreOrderArticleListId) throws PersistenceException {
        return new QuantifiedArticlesList(); // remote access for initialization only!
    }
    public void ThisSet(long PreOrderArticleListId, PersistentPreOrderArticleList ThisVal) throws PersistenceException {
        
    }

}

