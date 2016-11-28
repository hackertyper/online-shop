package persistence;

import model.*;

public class OverNightDeliveryFacade{



	public OverNightDeliveryFacade() {
	}

    public PersistentOverNightDelivery getTheOverNightDelivery() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryFacade.getNextId();
        OverNightDelivery result = new OverNightDelivery(0, 0, null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentOverNightDelivery)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 228);
    }
    
    public OverNightDelivery getOverNightDelivery(long OverNightDeliveryId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

