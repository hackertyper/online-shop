package persistence;



public class ServiceFacade{

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

	

	public ServiceFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, -186)) return -186;
        if(Cache.getTheCache().contains(objectId, -187)) return -187;
        if(Cache.getTheCache().contains(objectId, -188)) return -188;
        if(Cache.getTheCache().contains(objectId, -103)) return -103;
        if(Cache.getTheCache().contains(objectId, -101)) return -101;
        if(Cache.getTheCache().contains(objectId, -105)) return -105;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void ThisSet(long ServiceId, PersistentService ThisVal) throws PersistenceException {
        
    }

}

