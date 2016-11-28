package persistence;

import model.meta.*;

public class ChangeChargeCommandFacade{

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

	

	public ChangeChargeCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeChargeCommand newChangeChargeCommand(long newCharge,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeChargeCommand)PersistentProxi.createProxi(idCreateIfLessZero, 236);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeChargeCommandFacade.getNextId();
        ChangeChargeCommand result = new ChangeChargeCommand(null,newCharge,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeChargeCommand)PersistentProxi.createProxi(id, 236);
    }
    
    public PersistentChangeChargeCommand newDelayedChangeChargeCommand(long newCharge) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeChargeCommandFacade.getNextId();
        ChangeChargeCommand result = new ChangeChargeCommand(null,newCharge,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeChargeCommand)PersistentProxi.createProxi(id, 236);
    }
    
    public ChangeChargeCommand getChangeChargeCommand(long ChangeChargeCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 236)) return 236;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void cdSet(long ChangeChargeCommandId, PersistentCustomerDelivery cdVal) throws PersistenceException {
        
    }
    public void newChargeSet(long ChangeChargeCommandId, long newChargeVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeChargeCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeChargeCommandId, PersistentShopkeeper commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeChargeCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

