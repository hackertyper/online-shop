package persistence;



public class CustomerDeliveryFacade{

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

	

	public CustomerDeliveryFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 228)) return 228;
        if(Cache.getTheCache().contains(objectId, 229)) return 229;
        if(Cache.getTheCache().contains(objectId, 231)) return 231;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void timeSet(long CustomerDeliveryId, long timeVal) throws PersistenceException {
        
    }
    public void extraChargeSet(long CustomerDeliveryId, long extraChargeVal) throws PersistenceException {
        
    }
    public void subServiceSet(long CustomerDeliveryId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long CustomerDeliveryId, PersistentCustomerDelivery ThisVal) throws PersistenceException {
        
    }

}

