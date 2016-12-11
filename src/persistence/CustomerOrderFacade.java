package persistence;

import model.*;

public class CustomerOrderFacade{



	public CustomerOrderFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCustomerOrder newCustomerOrder(long remainingTimeToDelivery,java.sql.Timestamp sentDate,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCustomerOrder)PersistentProxi.createProxi(idCreateIfLessZero, 151);
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        CustomerOrder result = new CustomerOrder(remainingTimeToDelivery,sentDate,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrder)PersistentProxi.createProxi(id, 151);
    }
    
    public PersistentCustomerOrder newDelayedCustomerOrder(long remainingTimeToDelivery,java.sql.Timestamp sentDate) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        CustomerOrder result = new CustomerOrder(remainingTimeToDelivery,sentDate,null,null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCustomerOrder)PersistentProxi.createProxi(id, 151);
    }
    
    public CustomerOrder getCustomerOrder(long CustomerOrderId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void articleListSet(long CustomerOrderId, PersistentCustomerOrderArticleList articleListVal) throws PersistenceException {
        
    }
    public void ordermngrSet(long CustomerOrderId, PersistentOrderManager ordermngrVal) throws PersistenceException {
        
    }
    public void myStateSet(long CustomerOrderId, CustomerOrderState myStateVal) throws PersistenceException {
        
    }

}

