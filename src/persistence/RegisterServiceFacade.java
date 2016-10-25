package persistence;

import model.*;

public class RegisterServiceFacade{



	public RegisterServiceFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRegisterService newRegisterService(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentRegisterService)PersistentProxi.createProxi(idCreateIfLessZero, -101);
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        RegisterService result = new RegisterService(null,id);
        Cache.getTheCache().put(result);
        return (PersistentRegisterService)PersistentProxi.createProxi(id, -101);
    }
    
    public PersistentRegisterService newDelayedRegisterService() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theServiceFacade.getNextId();
        RegisterService result = new RegisterService(null,id);
        Cache.getTheCache().put(result);
        return (PersistentRegisterService)PersistentProxi.createProxi(id, -101);
    }
    
    public RegisterService getRegisterService(long RegisterServiceId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

