package persistence;

import model.*;

public class NewlyAddedFacade{

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

	

	public NewlyAddedFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentNewlyAdded newNewlyAdded(long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentNewlyAdded)PersistentProxi.createProxi(idCreateIfLessZero, 154);
        long id = ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade.getNextId();
        NewlyAdded result = new NewlyAdded(null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewlyAdded)PersistentProxi.createProxi(id, 154);
    }
    
    public PersistentNewlyAdded newDelayedNewlyAdded() throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade.getNextId();
        NewlyAdded result = new NewlyAdded(null,id);
        Cache.getTheCache().put(result);
        return (PersistentNewlyAdded)PersistentProxi.createProxi(id, 154);
    }
    
    public NewlyAdded getNewlyAdded(long NewlyAddedId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 154)) return 154;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void ThisSet(long NewlyAddedId, PersistentNewlyAdded ThisVal) throws PersistenceException {
        
    }

}

