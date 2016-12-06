package persistence;

import model.*;

public class CustomerOrderArticleListFacade{

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

	

	public CustomerOrderArticleListFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerOrderArticleList newCustomerOrderArticleList(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerOrderArticleList)PersistentProxi.createProxi(idCreateIfLessZero, 252);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade.getNextId();
        CustomerOrderArticleList result = new CustomerOrderArticleList(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrderArticleList)PersistentProxi.createProxi(id, 252);
    }
    
    public PersistentCustomerOrderArticleList newDelayedCustomerOrderArticleList() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade.getNextId();
        CustomerOrderArticleList result = new CustomerOrderArticleList(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrderArticleList)PersistentProxi.createProxi(id, 252);
    }
    
    public CustomerOrderArticleList getCustomerOrderArticleList(long CustomerOrderArticleListId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 252)) return 252;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void observerSet(long CustomerOrderArticleListId, PersistentCustomerOrder observerVal) throws PersistenceException {
        
    }
    public long observeeAdd(long CustomerOrderArticleListId, PersistentQuantifiedArticles observeeVal) throws PersistenceException {
        return 0;
    }
    public void observeeRem(long observeeId) throws PersistenceException {
        
    }
    public QuantifiedArticlesList observeeGet(long CustomerOrderArticleListId) throws PersistenceException {
        return new QuantifiedArticlesList(); // remote access for initialization only!
    }
    public void ThisSet(long CustomerOrderArticleListId, PersistentCustomerOrderArticleList ThisVal) throws PersistenceException {
        
    }

}

