package persistence;

import model.*;

public class ManufacturerFacade{

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

	

	public ManufacturerFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentManufacturer newManufacturer(String name,long manuDelivery,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentManufacturer)PersistentProxi.createProxi(idCreateIfLessZero, 119);
        long id = ConnectionHandler.getTheConnectionHandler().theManufacturerFacade.getNextId();
        Manufacturer result = new Manufacturer(name,manuDelivery,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentManufacturer)PersistentProxi.createProxi(id, 119);
    }
    
    public PersistentManufacturer newDelayedManufacturer(String name,long manuDelivery) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theManufacturerFacade.getNextId();
        Manufacturer result = new Manufacturer(name,manuDelivery,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentManufacturer)PersistentProxi.createProxi(id, 119);
    }
    
    public Manufacturer getManufacturer(long ManufacturerId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 119)) return 119;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void nameSet(long ManufacturerId, String nameVal) throws PersistenceException {
        
    }
    public void manuDeliverySet(long ManufacturerId, long manuDeliveryVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ManufacturerId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ManufacturerId, PersistentManufacturer ThisVal) throws PersistenceException {
        
    }

}

