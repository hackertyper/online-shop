package persistence;

import model.*;

public class OrderManagerFacade{

	static private Long sequencer = new Long(0);

	static protected long getTheNextId(){
		long result = -1;
		synchronized (sequencer) { 
			result = sequencer.longValue() + 1;
			sequencer = new Long(result);
		}
		return result;
	}

	protected long getNextId(){
		return getTheNextId();
	}

	

	public OrderManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderManager newOrderManager(long retourePrice,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderManager)PersistentProxi.createProxi(idCreateIfLessZero, 224);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.getNextId();
        OrderManager result = new OrderManager(retourePrice,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderManager)PersistentProxi.createProxi(id, 224);
    }
    
    public PersistentOrderManager newDelayedOrderManager(long retourePrice) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.getNextId();
        OrderManager result = new OrderManager(retourePrice,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderManager)PersistentProxi.createProxi(id, 224);
    }
    
    public OrderManager getOrderManager(long OrderManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 224)) return 224;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public long ordersAdd(long OrderManagerId, PersistentCustomerOrder ordersVal) throws PersistenceException {
        return 0;
    }
    public void ordersRem(long ordersId) throws PersistenceException {
        
    }
    public CustomerOrderList ordersGet(long OrderManagerId) throws PersistenceException {
        return new CustomerOrderList(); // remote access for initialization only!
    }
    public long preOrdersAdd(long OrderManagerId, PersistentPreOrder preOrdersVal) throws PersistenceException {
        return 0;
    }
    public void preOrdersRem(long preOrdersId) throws PersistenceException {
        
    }
    public PreOrderList preOrdersGet(long OrderManagerId) throws PersistenceException {
        return new PreOrderList(); // remote access for initialization only!
    }
    public void retourePriceSet(long OrderManagerId, long retourePriceVal) throws PersistenceException {
        
    }
    public void subServiceSet(long OrderManagerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long OrderManagerId, PersistentOrderManager ThisVal) throws PersistenceException {
        
    }

}

