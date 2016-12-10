package persistence;

import model.meta.*;

public class DepositCommandFacade{

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

	

	public DepositCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentDepositCommand newDepositCommand(long amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentDepositCommand)PersistentProxi.createProxi(idCreateIfLessZero, 170);
        long id = ConnectionHandler.getTheConnectionHandler().theDepositCommandFacade.getNextId();
        DepositCommand result = new DepositCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentDepositCommand)PersistentProxi.createProxi(id, 170);
    }
    
    public PersistentDepositCommand newDelayedDepositCommand(long amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theDepositCommandFacade.getNextId();
        DepositCommand result = new DepositCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentDepositCommand)PersistentProxi.createProxi(id, 170);
    }
    
    public DepositCommand getDepositCommand(long DepositCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 170)) return 170;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void amountSet(long DepositCommandId, long amountVal) throws PersistenceException {
        
    }
    public void invokerSet(long DepositCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long DepositCommandId, PersistentCustomerManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long DepositCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

