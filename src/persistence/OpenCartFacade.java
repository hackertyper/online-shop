package persistence;

import model.*;

public class OpenCartFacade{



	public OpenCartFacade() {
	}

    public PersistentOpenCart getTheOpenCart() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCartStateFacade.getNextId();
        OpenCart result = new OpenCart(null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentOpenCart)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 216);
    }
    
    public OpenCart getOpenCart(long OpenCartId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

