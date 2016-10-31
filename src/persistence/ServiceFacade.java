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
        if(Cache.getTheCache().contains(objectId, -185)) return -185;
        if(Cache.getTheCache().contains(objectId, -187)) return -187;
        if(Cache.getTheCache().contains(objectId, -189)) return -189;
        if(Cache.getTheCache().contains(objectId, -103)) return -103;
        if(Cache.getTheCache().contains(objectId, -115)) return -115;
        if(Cache.getTheCache().contains(objectId, -133)) return -133;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long ServiceId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ServiceId, PersistentService ThisVal) throws PersistenceException {
        
    }

}

