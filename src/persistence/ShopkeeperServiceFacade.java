package persistence;

import model.*;

public class ShopkeeperServiceFacade{



	public ShopkeeperServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopkeeperService newShopkeeperService(long lowerLimitPreset,long balancePreset,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShopkeeperService)PersistentProxi.createProxi(idCreateIfLessZero, -133);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        ShopkeeperService result = new ShopkeeperService(null,null,null,lowerLimitPreset,balancePreset,id);
        Cache.getTheCache().put(result);
        return (PersistentShopkeeperService)PersistentProxi.createProxi(id, -133);
    }
    
    public PersistentShopkeeperService newDelayedShopkeeperService(long lowerLimitPreset,long balancePreset) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        ShopkeeperService result = new ShopkeeperService(null,null,null,lowerLimitPreset,balancePreset,id);
        Cache.getTheCache().put(result);
        return (PersistentShopkeeperService)PersistentProxi.createProxi(id, -133);
    }
    
    public ShopkeeperService getShopkeeperService(long ShopkeeperServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void managerSet(long ShopkeeperServiceId, PersistentShopkeeper managerVal) throws PersistenceException {
        
    }
    public void lowerLimitPresetSet(long ShopkeeperServiceId, long lowerLimitPresetVal) throws PersistenceException {
        
    }
    public void balancePresetSet(long ShopkeeperServiceId, long balancePresetVal) throws PersistenceException {
        
    }
    public ShopkeeperServiceSearchList inverseGetManager(long objectId, long classId)throws PersistenceException{
        ShopkeeperServiceSearchList result = new ShopkeeperServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-133);
        while (candidates.hasNext()){
            PersistentShopkeeperService current = (PersistentShopkeeperService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getManager() != null){
                if (current.getManager().getClassId() == classId && current.getManager().getId() == objectId) {
                    PersistentShopkeeperService proxi = (PersistentShopkeeperService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentShopkeeperService)proxi.getThis());
                }
            }
        }
        return result;
    }

}

