package persistence;

import model.*;

public class ShopServiceFacade{



	public ShopServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopService newShopService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShopService)PersistentProxi.createProxi(idCreateIfLessZero, -185);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        ShopService result = new ShopService(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopService)PersistentProxi.createProxi(id, -185);
    }
    
    public PersistentShopService newDelayedShopService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        ShopService result = new ShopService(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopService)PersistentProxi.createProxi(id, -185);
    }
    
    public ShopService getShopService(long ShopServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void shopMngrSet(long ShopServiceId, PersistentShopManager shopMngrVal) throws PersistenceException {
        
    }
    public ShopServiceSearchList inverseGetShopMngr(long objectId, long classId)throws PersistenceException{
        ShopServiceSearchList result = new ShopServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-185);
        while (candidates.hasNext()){
            PersistentShopService current = (PersistentShopService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getShopMngr() != null){
                if (current.getShopMngr().getClassId() == classId && current.getShopMngr().getId() == objectId) {
                    PersistentShopService proxi = (PersistentShopService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentShopService)proxi.getThis());
                }
            }
        }
        return result;
    }

}

