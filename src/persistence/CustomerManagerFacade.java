package persistence;

import model.*;

public class CustomerManagerFacade{

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

	

	public CustomerManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerManager newCustomerManager(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerManager)PersistentProxi.createProxi(idCreateIfLessZero, 184);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.getNextId();
        CustomerManager result = new CustomerManager(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerManager)PersistentProxi.createProxi(id, 184);
    }
    
    public PersistentCustomerManager newDelayedCustomerManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade.getNextId();
        CustomerManager result = new CustomerManager(null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerManager)PersistentProxi.createProxi(id, 184);
    }
    
    public CustomerManager getCustomerManager(long CustomerManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 184)) return 184;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void shopMngrSet(long CustomerManagerId, PersistentShopManager shopMngrVal) throws PersistenceException {
        
    }
    public void accMngrSet(long CustomerManagerId, PersistentAccountManager accMngrVal) throws PersistenceException {
        
    }
    public void cartMngrSet(long CustomerManagerId, PersistentCartManager cartMngrVal) throws PersistenceException {
        
    }
    public void subServiceSet(long CustomerManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerManagerId, PersistentCustomerManager ThisVal) throws PersistenceException {
        
    }
    public CustomerManagerSearchList inverseGetShopMngr(long objectId, long classId)throws PersistenceException{
        CustomerManagerSearchList result = new CustomerManagerSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(184);
        while (candidates.hasNext()){
            PersistentCustomerManager current = (PersistentCustomerManager)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getShopMngr() != null){
                if (current.getShopMngr().getClassId() == classId && current.getShopMngr().getId() == objectId) {
                    PersistentCustomerManager proxi = (PersistentCustomerManager)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentCustomerManager)proxi.getThis());
                }
            }
        }
        return result;
    }
    public CustomerManagerSearchList inverseGetAccMngr(long objectId, long classId)throws PersistenceException{
        CustomerManagerSearchList result = new CustomerManagerSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(184);
        while (candidates.hasNext()){
            PersistentCustomerManager current = (PersistentCustomerManager)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getAccMngr() != null){
                if (current.getAccMngr().getClassId() == classId && current.getAccMngr().getId() == objectId) {
                    PersistentCustomerManager proxi = (PersistentCustomerManager)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentCustomerManager)proxi.getThis());
                }
            }
        }
        return result;
    }
    public CustomerManagerSearchList inverseGetCartMngr(long objectId, long classId)throws PersistenceException{
        CustomerManagerSearchList result = new CustomerManagerSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(184);
        while (candidates.hasNext()){
            PersistentCustomerManager current = (PersistentCustomerManager)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getCartMngr() != null){
                if (current.getCartMngr().getClassId() == classId && current.getCartMngr().getId() == objectId) {
                    PersistentCustomerManager proxi = (PersistentCustomerManager)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentCustomerManager)proxi.getThis());
                }
            }
        }
        return result;
    }

}

