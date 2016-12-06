package persistence;

import model.*;

public class CartManagerFacade{

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

	

	public CartManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCartManager newCartManager(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCartManager)PersistentProxi.createProxi(idCreateIfLessZero, 190);
        long id = ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.getNextId();
        CartManager result = new CartManager(null,null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartManager)PersistentProxi.createProxi(id, 190);
    }
    
    public PersistentCartManager newDelayedCartManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.getNextId();
        CartManager result = new CartManager(null,null,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartManager)PersistentProxi.createProxi(id, 190);
    }
    
    public CartManager getCartManager(long CartManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 190)) return 190;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void myCartSet(long CartManagerId, PersistentCart myCartVal) throws PersistenceException {
        
    }
    public void articleListSet(long CartManagerId, PersistentCartManagerArticleList articleListVal) throws PersistenceException {
        
    }
    public void standardDeliverySet(long CartManagerId, PersistentCartManagerStandardDelivery standardDeliveryVal) throws PersistenceException {
        
    }
    public void onDeliverySet(long CartManagerId, PersistentCartManagerOnDelivery onDeliveryVal) throws PersistenceException {
        
    }
    public void preOrderSet(long CartManagerId, PersistentPreOrder preOrderVal) throws PersistenceException {
        
    }
    public void subServiceSet(long CartManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long CartManagerId, PersistentCartManager ThisVal) throws PersistenceException {
        
    }
    public CartManagerSearchList inverseGetMyCart(long objectId, long classId)throws PersistenceException{
        CartManagerSearchList result = new CartManagerSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(190);
        while (candidates.hasNext()){
            PersistentCartManager current = (PersistentCartManager)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getMyCart() != null){
                if (current.getMyCart().getClassId() == classId && current.getMyCart().getId() == objectId) {
                    PersistentCartManager proxi = (PersistentCartManager)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentCartManager)proxi.getThis());
                }
            }
        }
        return result;
    }

}

