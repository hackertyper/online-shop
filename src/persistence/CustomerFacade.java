package persistence;

import model.*;

public class CustomerFacade{

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

	

	public CustomerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomer newCustomer(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomer)PersistentProxi.createProxi(idCreateIfLessZero, 131);
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerFacade.getNextId();
        Customer result = new Customer(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomer)PersistentProxi.createProxi(id, 131);
    }
    
    public PersistentCustomer newDelayedCustomer() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerFacade.getNextId();
        Customer result = new Customer(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomer)PersistentProxi.createProxi(id, 131);
    }
    
    public Customer getCustomer(long CustomerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 131)) return 131;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void myAccountSet(long CustomerId, PersistentAccount myAccountVal) throws PersistenceException {
        
    }
    public void myCartSet(long CustomerId, PersistentCart myCartVal) throws PersistenceException {
        
    }
    public long itemRangeAdd(long CustomerId, PersistentItem itemRangeVal) throws PersistenceException {
        return 0;
    }
    public void itemRangeRem(long itemRangeId) throws PersistenceException {
        
    }
    public ItemList itemRangeGet(long CustomerId) throws PersistenceException {
        return new ItemList(); // remote access for initialization only!
    }
    public void ThisSet(long CustomerId, PersistentCustomer ThisVal) throws PersistenceException {
        
    }
    public CustomerSearchList inverseGetMyAccount(long objectId, long classId)throws PersistenceException{
        CustomerSearchList result = new CustomerSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(131);
        while (candidates.hasNext()){
            PersistentCustomer current = (PersistentCustomer)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getMyAccount() != null){
                if (current.getMyAccount().getClassId() == classId && current.getMyAccount().getId() == objectId) {
                    PersistentCustomer proxi = (PersistentCustomer)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentCustomer)proxi.getThis());
                }
            }
        }
        return result;
    }
    public CustomerSearchList inverseGetMyCart(long objectId, long classId)throws PersistenceException{
        CustomerSearchList result = new CustomerSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(131);
        while (candidates.hasNext()){
            PersistentCustomer current = (PersistentCustomer)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getMyCart() != null){
                if (current.getMyCart().getClassId() == classId && current.getMyCart().getId() == objectId) {
                    PersistentCustomer proxi = (PersistentCustomer)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentCustomer)proxi.getThis());
                }
            }
        }
        return result;
    }

}

