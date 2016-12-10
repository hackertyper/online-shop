package persistence;

import model.*;

public class CheckedOutFacade{



	public CheckedOutFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentCheckedOut newCheckedOut(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentCheckedOut)PersistentProxi.createProxi(idCreateIfLessZero, 215);
        long id = ConnectionHandler.getTheConnectionHandler().theCartStateFacade.getNextId();
        CheckedOut result = new CheckedOut(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCheckedOut)PersistentProxi.createProxi(id, 215);
    }
    
    public PersistentCheckedOut newDelayedCheckedOut() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theCartStateFacade.getNextId();
        CheckedOut result = new CheckedOut(null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentCheckedOut)PersistentProxi.createProxi(id, 215);
    }
    
    public CheckedOut getCheckedOut(long CheckedOutId) throws PersistenceException{
        return null; //All data is in the cache!
    }

}

