package persistence;

import model.*;

public class CartServiceFacade{



	public CartServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCartService newCartService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCartService)PersistentProxi.createProxi(idCreateIfLessZero, -187);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CartService result = new CartService(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartService)PersistentProxi.createProxi(id, -187);
    }
    
    public PersistentCartService newDelayedCartService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        CartService result = new CartService(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCartService)PersistentProxi.createProxi(id, -187);
    }
    
    public CartService getCartService(long CartServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

