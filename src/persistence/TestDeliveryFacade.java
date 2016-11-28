package persistence;

import model.*;

public class TestDeliveryFacade{



	public TestDeliveryFacade() {
	}

    public PersistentTestDelivery getTheTestDelivery() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCustomerDeliveryFacade.getNextId();
        TestDelivery result = new TestDelivery(0, 0, null, null, id);
        PersistentInCacheProxi cached = Cache.getTheCache().putSingleton(result);
        return (PersistentTestDelivery)PersistentProxi.createProxi(cached.getId()  * (cached.getTheObject().isTheSameAs(result) ? -1 : 1), 231);
    }
    
    public TestDelivery getTestDelivery(long TestDeliveryId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

