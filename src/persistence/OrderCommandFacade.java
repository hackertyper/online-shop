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
        if(idCreateIfLessZero > 0) return (PersistentOrderCommand)PersistentProxi.createProxi(idCreateIfLessZero, 104);
        long id = ConnectionHandler.getTheConnectionHandler().theOrderCommandFacade.getNextId();
        OrderCommand result = new OrderCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderCommand)PersistentProxi.createProxi(id, 104);
    }
    
    public PersistentOrderCommand newDelayedOrderCommand() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theOrderCommandFacade.getNextId();
        OrderCommand result = new OrderCommand(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentOrderCommand)PersistentProxi.createProxi(id, 104);
    }
    
    public OrderCommand getOrderCommand(long OrderCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 104)) return 104;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void invokerSet(long OrderCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long OrderCommandId, PersistentCustomerManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long OrderCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

