package persistence;

import model.*;

public class StandardDeliveryFacade{



	public StandardDeliveryFacade() {
	}

    public PersistentStandardDelivery getTheStandardDelivery() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryFacade.getNextId();
        StandardDelivery result = new StandardDelivery(0, 0, null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentStandardDelivery)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 229);
    }
    
    public StandardDelivery getStandardDelivery(long StandardDeliveryId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

