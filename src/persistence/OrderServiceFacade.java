package persistence;

import model.*;

public class OrderServiceFacade{



	public OrderServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderService newOrderService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderService)PersistentProxi.createProxi(idCreateIfLessZero, -223);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OrderService result = new OrderService(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderService)PersistentProxi.createProxi(id, -223);
    }
    
    public PersistentOrderService newDelayedOrderService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        OrderService result = new OrderService(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderService)PersistentProxi.createProxi(id, -223);
    }
    
    public OrderService getOrderService(long OrderServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void orderMngrSet(long OrderServiceId, PersistentOrderManager orderMngrVal) throws PersistenceException {
        
    }
    public OrderServiceSearchList inverseGetOrderMngr(long objectId, long classId)throws PersistenceException{
        OrderServiceSearchList result = new OrderServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-223);
        while (candidates.hasNext()){
            PersistentOrderService current = (PersistentOrderService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getOrderMngr() != null){
                if (current.getOrderMngr().getClassId() == classId && current.getOrderMngr().getId() == objectId) {
                    PersistentOrderService proxi = (PersistentOrderService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentOrderService)proxi.getThis());
                }
            }
        }
        return result;
    }

}

