package persistence;



public class DeliveryFacade{

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

	

	public DeliveryFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 171)) return 171;
        if(Cache.getTheCache().contains(objectId, 174)) return 174;
        if(Cache.getTheCache().contains(objectId, 175)) return 175;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void remainingTimeToDeliverySet(long DeliveryId, long remainingTimeToDeliveryVal) throws PersistenceException {
        
    }
    public void ThisSet(long DeliveryId, PersistentDelivery ThisVal) throws PersistenceException {
        
    }

}

