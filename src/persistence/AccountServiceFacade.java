package persistence;

import model.*;

public class AccountServiceFacade{



	public AccountServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentAccountService newAccountService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentAccountService)PersistentProxi.createProxi(idCreateIfLessZero, -188);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        AccountService result = new AccountService(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAccountService)PersistentProxi.createProxi(id, -188);
    }
    
    public PersistentAccountService newDelayedAccountService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        AccountService result = new AccountService(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentAccountService)PersistentProxi.createProxi(id, -188);
    }
    
    public AccountService getAccountService(long AccountServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

