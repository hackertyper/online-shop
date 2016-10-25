package persistence;

import model.*;

public class ShopServiceFacade{



	public ShopServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopService newShopService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShopService)PersistentProxi.createProxi(idCreateIfLessZero, -186);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        ShopService result = new ShopService(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopService)PersistentProxi.createProxi(id, -186);
    }
    
    public PersistentShopService newDelayedShopService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        ShopService result = new ShopService(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentShopService)PersistentProxi.createProxi(id, -186);
    }
    
    public ShopService getShopService(long ShopServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

