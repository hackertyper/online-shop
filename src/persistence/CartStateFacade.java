package persistence;



public class CartStateFacade{

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

	

	public CartStateFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 161)) return 161;
        if(Cache.getTheCache().contains(objectId, 215)) return 215;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void subServiceSet(long CartStateId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long CartStateId, PersistentCartState ThisVal) throws PersistenceException {
        
    }

}

