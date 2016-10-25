package persistence;

import model.meta.*;

public class AddToCartCommandFacade{

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

	

	public AddToCartCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAddToCartCommand newAddToCartCommand(long amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAddToCartCommand)PersistentProxi.createProxi(idCreateIfLessZero, 146);
        long id = ConnectionHandler.getTheConnectionHandler().theAddToCartCommandFacade.getNextId();
        AddToCartCommand result = new AddToCartCommand(null,amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddToCartCommand)PersistentProxi.createProxi(id, 146);
    }
    
    public PersistentAddToCartCommand newDelayedAddToCartCommand(long amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAddToCartCommandFacade.getNextId();
        AddToCartCommand result = new AddToCartCommand(null,amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAddToCartCommand)PersistentProxi.createProxi(id, 146);
    }
    
    public AddToCartCommand getAddToCartCommand(long AddToCartCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 146)) return 146;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long AddToCartCommandId, PersistentArticle articleVal) throws PersistenceException {
        
    }
    public void amountSet(long AddToCartCommandId, long amountVal) throws PersistenceException {
        
    }
    public void invokerSet(long AddToCartCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long AddToCartCommandId, PersistentCustomer commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long AddToCartCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

