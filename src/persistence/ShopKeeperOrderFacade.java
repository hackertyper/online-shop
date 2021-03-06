package persistence;

import model.*;

public class ShopKeeperOrderFacade{



	public ShopKeeperOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentShopKeeperOrder newShopKeeperOrder(long remainingTimeToDelivery,java.sql.Timestamp sentDate,long amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentShopKeeperOrder)PersistentProxi.createProxi(idCreateIfLessZero, 175);
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        ShopKeeperOrder result = new ShopKeeperOrder(remainingTimeToDelivery,sentDate,null,null,null,amount,id);
        Cache.getTheCache().put(result);
        return (PersistentShopKeeperOrder)PersistentProxi.createProxi(id, 175);
    }
    
    public PersistentShopKeeperOrder newDelayedShopKeeperOrder(long remainingTimeToDelivery,java.sql.Timestamp sentDate,long amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        ShopKeeperOrder result = new ShopKeeperOrder(remainingTimeToDelivery,sentDate,null,null,null,amount,id);
        Cache.getTheCache().put(result);
        return (PersistentShopKeeperOrder)PersistentProxi.createProxi(id, 175);
    }
    
    public ShopKeeperOrder getShopKeeperOrder(long ShopKeeperOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void articleSet(long ShopKeeperOrderId, PersistentArticle articleVal) throws PersistenceException {
        
    }
    public void amountSet(long ShopKeeperOrderId, long amountVal) throws PersistenceException {
        
    }

}

