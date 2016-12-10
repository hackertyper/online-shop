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
        if(Cache.getTheCache().contains(objectId, -163)) return -163;
        if(Cache.getTheCache().contains(objectId, -211)) return -211;
        if(Cache.getTheCache().contains(objectId, -185)) return -185;
        if(Cache.getTheCache().contains(objectId, -186)) return -186;
        if(Cache.getTheCache().contains(objectId, -140)) return -140;
        if(Cache.getTheCache().contains(objectId, -142)) return -142;
        if(Cache.getTheCache().contains(objectId, -143)) return -143;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long ServiceId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ServiceId, PersistentService ThisVal) throws PersistenceException {
        
    }

}

