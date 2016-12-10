package persistence;

import model.*;

public class AccountFacade{

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

	

	public AccountFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAccount newAccount(long lowerLimit,long balance,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAccount)PersistentProxi.createProxi(idCreateIfLessZero, 148);
        long id = ConnectionHandler.getTheConnectionHandler().theAccountFacade.getNextId();
        Account result = new Account(lowerLimit,balance,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAccount)PersistentProxi.createProxi(id, 148);
    }
    
    public PersistentAccount newDelayedAccount(long lowerLimit,long balance) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAccountFacade.getNextId();
        Account result = new Account(lowerLimit,balance,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAccount)PersistentProxi.createProxi(id, 148);
    }
    
    public Account getAccount(long AccountId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 148)) return 148;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void lowerLimitSet(long AccountId, long lowerLimitVal) throws PersistenceException {
        
    }
    public void balanceSet(long AccountId, long balanceVal) throws PersistenceException {
        
    }
    public void subServiceSet(long AccountId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long AccountId, PersistentAccount ThisVal) throws PersistenceException {
        
    }

}

