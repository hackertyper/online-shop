package persistence;

import model.*;

public class CustomerOrderFacade{



	public CustomerOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerOrder newCustomerOrder(long remainingTimeToDelivery,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerOrder)PersistentProxi.createProxi(idCreateIfLessZero, 111);
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        CustomerOrder result = new CustomerOrder(remainingTimeToDelivery,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrder)PersistentProxi.createProxi(id, 111);
    }
    
    public PersistentCustomerOrder newDelayedCustomerOrder(long remainingTimeToDelivery) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        CustomerOrder result = new CustomerOrder(remainingTimeToDelivery,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrder)PersistentProxi.createProxi(id, 111);
    }
    
    public CustomerOrder getCustomerOrder(long CustomerOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long articleListAdd(long CustomerOrderId, PersistentQuantifiedArticles articleListVal) throws PersistenceException {
        return 0;
    }
    public void articleListRem(long articleListId) throws PersistenceException {
        
    }
    public QuantifiedArticlesList articleListGet(long CustomerOrderId) throws PersistenceException {
        return new QuantifiedArticlesList(); // remote access for initialization only!
    }
    public void myStateSet(long CustomerOrderId, CustomerOrderState myStateVal) throws PersistenceException {
        
    }
    public CustomerOrderSearchList inverseGetMyState(long objectId, long classId)throws PersistenceException{
        CustomerOrderSearchList result = new CustomerOrderSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(111);
        while (candidates.hasNext()){
            PersistentCustomerOrder current = (PersistentCustomerOrder)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getMyState() != null){
                if (current.getMyState().getClassId() == classId && current.getMyState().getId() == objectId) {
                    PersistentCustomerOrder proxi = (PersistentCustomerOrder)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentCustomerOrder)proxi.getThis());
                }
            }
        }
        return result;
    }

}

