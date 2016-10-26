package persistence;

import model.*;

public class AccountServiceFacade{



	public AccountServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAccountService newAccountService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAccountService)PersistentProxi.createProxi(idCreateIfLessZero, -189);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        AccountService result = new AccountService(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAccountService)PersistentProxi.createProxi(id, -189);
    }
    
    public PersistentAccountService newDelayedAccountService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        AccountService result = new AccountService(null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAccountService)PersistentProxi.createProxi(id, -189);
    }
    
    public AccountService getAccountService(long AccountServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void accMngrSet(long AccountServiceId, PersistentAccountManager accMngrVal) throws PersistenceException {
        
    }
    public AccountServiceSearchList inverseGetAccMngr(long objectId, long classId)throws PersistenceException{
        AccountServiceSearchList result = new AccountServiceSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(-189);
        while (candidates.hasNext()){
            PersistentAccountService current = (PersistentAccountService)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getAccMngr() != null){
                if (current.getAccMngr().getClassId() == classId && current.getAccMngr().getId() == objectId) {
                    PersistentAccountService proxi = (PersistentAccountService)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentAccountService)proxi.getThis());
                }
            }
        }
        return result;
    }

}

