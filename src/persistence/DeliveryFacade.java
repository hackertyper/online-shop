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
        if(Cache.getTheCache().contains(objectId, 111)) return 111;
        if(Cache.getTheCache().contains(objectId, 130)) return 130;
        if(Cache.getTheCache().contains(objectId, 134)) return 134;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void remainingTimeToDeliverySet(long DeliveryId, long remainingTimeToDeliveryVal) throws PersistenceException {
        
    }
    public void subServiceSet(long DeliveryId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long DeliveryId, PersistentDelivery ThisVal) throws PersistenceException {
        
    }

}

