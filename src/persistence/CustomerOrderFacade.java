package persistence;

import model.*;

public class CustomerOrderFacade{



	public CustomerOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerOrder newCustomerOrder(long remainingTimeToDelivery,java.sql.Timestamp sendDate,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerOrder)PersistentProxi.createProxi(idCreateIfLessZero, 111);
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        CustomerOrder result = new CustomerOrder(remainingTimeToDelivery,sendDate,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrder)PersistentProxi.createProxi(id, 111);
    }
    
    public PersistentCustomerOrder newDelayedCustomerOrder(long remainingTimeToDelivery,java.sql.Timestamp sendDate) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        CustomerOrder result = new CustomerOrder(remainingTimeToDelivery,sendDate,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrder)PersistentProxi.createProxi(id, 111);
    }
    
    public CustomerOrder getCustomerOrder(long CustomerOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long articleListAdd(long CustomerOrderId, PersistentQuantifiedArticles articleListVal) throws PersistenceException {
        return 0;
    }
    public void articleListRem(long articleListId) throws PersistenceException {
        
    }
    public QuantifiedArticlesList articleListGet(long CustomerOrderId) throws PersistenceException {
        return new QuantifiedArticlesList(); // remote access for initialization only!
    }
    public void ordermngrSet(long CustomerOrderId, PersistentOrderManager ordermngrVal) throws PersistenceException {
        
    }
    public void myStateSet(long CustomerOrderId, CustomerOrderState myStateVal) throws PersistenceException {
        
    }

}

