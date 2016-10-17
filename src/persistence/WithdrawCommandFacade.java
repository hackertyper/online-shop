package persistence;

import model.meta.*;

public class WithdrawCommandFacade{

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

	

	public WithdrawCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentWithdrawCommand newWithdrawCommand(long amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentWithdrawCommand)PersistentProxi.createProxi(idCreateIfLessZero, 118);
        long id = ConnectionHandler.getTheConnectionHandler().theWithdrawCommandFacade.getNextId();
        WithdrawCommand result = new WithdrawCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentWithdrawCommand)PersistentProxi.createProxi(id, 118);
    }
    
    public PersistentWithdrawCommand newDelayedWithdrawCommand(long amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theWithdrawCommandFacade.getNextId();
        WithdrawCommand result = new WithdrawCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentWithdrawCommand)PersistentProxi.createProxi(id, 118);
    }
    
    public WithdrawCommand getWithdrawCommand(long WithdrawCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 118)) return 118;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void amountSet(long WithdrawCommandId, long amountVal) throws PersistenceException {
        
    }
    public void invokerSet(long WithdrawCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long WithdrawCommandId, PersistentCustomer commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long WithdrawCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

