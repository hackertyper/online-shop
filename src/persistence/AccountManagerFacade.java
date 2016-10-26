package persistence;

import model.*;

public class AccountManagerFacade{

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

	

	public AccountManagerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAccountManager newAccountManager(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAccountManager)PersistentProxi.createProxi(idCreateIfLessZero, 188);
        long id = ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade.getNextId();
        AccountManager result = new AccountManager(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAccountManager)PersistentProxi.createProxi(id, 188);
    }
    
    public PersistentAccountManager newDelayedAccountManager() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theAccountManagerFacade.getNextId();
        AccountManager result = new AccountManager(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAccountManager)PersistentProxi.createProxi(id, 188);
    }
    
    public AccountManager getAccountManager(long AccountManagerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 188)) return 188;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void myAccountSet(long AccountManagerId, PersistentAccount myAccountVal) throws PersistenceException {
        
    }
    public void ThisSet(long AccountManagerId, PersistentAccountManager ThisVal) throws PersistenceException {
        
    }
    public AccountManagerSearchList inverseGetMyAccount(long objectId, long classId)throws PersistenceException{
        AccountManagerSearchList result = new AccountManagerSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(188);
        while (candidates.hasNext()){
            PersistentAccountManager current = (PersistentAccountManager)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getMyAccount() != null){
                if (current.getMyAccount().getClassId() == classId && current.getMyAccount().getId() == objectId) {
                    PersistentAccountManager proxi = (PersistentAccountManager)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentAccountManager)proxi.getThis());
                }
            }
        }
        return result;
    }

}

