package persistence;

import model.meta.*;

public class PresetLowerLimitCommandFacade{

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

	

	public PresetLowerLimitCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentPresetLowerLimitCommand newPresetLowerLimitCommand(long amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentPresetLowerLimitCommand)PersistentProxi.createProxi(idCreateIfLessZero, 244);
        long id = ConnectionHandler.getTheConnectionHandler().thePresetLowerLimitCommandFacade.getNextId();
        PresetLowerLimitCommand result = new PresetLowerLimitCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPresetLowerLimitCommand)PersistentProxi.createProxi(id, 244);
    }
    
    public PersistentPresetLowerLimitCommand newDelayedPresetLowerLimitCommand(long amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().thePresetLowerLimitCommandFacade.getNextId();
        PresetLowerLimitCommand result = new PresetLowerLimitCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPresetLowerLimitCommand)PersistentProxi.createProxi(id, 244);
    }
    
    public PresetLowerLimitCommand getPresetLowerLimitCommand(long PresetLowerLimitCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 244)) return 244;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void amountSet(long PresetLowerLimitCommandId, long amountVal) throws PersistenceException {
        
    }
    public void invokerSet(long PresetLowerLimitCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long PresetLowerLimitCommandId, PersistentShopkeeper commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long PresetLowerLimitCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

