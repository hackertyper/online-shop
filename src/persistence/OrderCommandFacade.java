package persistence;

import model.meta.*;

public class OrderCommandFacade{

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

	

	public OrderCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentOrderCommand newOrderCommand(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentOrderCommand)PersistentProxi.createProxi(idCreateIfLessZero, 191);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderCommandFacade.getNextId();
        OrderCommand result = new OrderCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderCommand)PersistentProxi.createProxi(id, 191);
    }
    
    public PersistentOrderCommand newDelayedOrderCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderCommandFacade.getNextId();
        OrderCommand result = new OrderCommand(null,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderCommand)PersistentProxi.createProxi(id, 191);
    }
    
    public OrderCommand getOrderCommand(long OrderCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 191)) return 191;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void deliveryMethodSet(long OrderCommandId, PersistentCustomerDelivery deliveryMethodVal) throws PersistenceException {
        
    }
    public void invokerSet(long OrderCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long OrderCommandId, PersistentCartManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long OrderCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

