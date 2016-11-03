package persistence;

import model.*;

public class CartServiceFacade{



	public CartServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCartService newCartService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCartService)PersistentProxi.createProxi(idCreateIfLessZero, -187);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CartService result = new CartService(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartService)PersistentProxi.createProxi(id, -187);
    }
    
    public PersistentCartService newDelayedCartService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CartService result = new CartService(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartService)PersistentProxi.createProxi(id, -187);
    }
    
    public CartService getCartService(long CartServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void cartMngrSet(long CartServiceId, PersistentCartManager cartMngrVal) throws PersistenceException {
        
    }
    public CartServiceSearchList inverseGetCartMngr(long objectId, long classId)throws PersistenceException{
        CartServiceSearchList result = new CartServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-187);
        while (candidates.hasNext()){
            PersistentCartService current = (PersistentCartService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getCartMngr() != null){
                if (current.getCartMngr().getClassId() == classId && current.getCartMngr().getId() == objectId) {
                    PersistentCartService proxi = (PersistentCartService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentCartService)proxi.getThis());
                }
            }
        }
        return result;
    }

}

