package persistence;

import model.meta.*;

public class PresetBalanceCommandFacade{

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

	

	public PresetBalanceCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentPresetBalanceCommand newPresetBalanceCommand(long amount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentPresetBalanceCommand)PersistentProxi.createProxi(idCreateIfLessZero, 243);
        long id = ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.getNextId();
        PresetBalanceCommand result = new PresetBalanceCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPresetBalanceCommand)PersistentProxi.createProxi(id, 243);
    }
    
    public PersistentPresetBalanceCommand newDelayedPresetBalanceCommand(long amount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().thePresetBalanceCommandFacade.getNextId();
        PresetBalanceCommand result = new PresetBalanceCommand(amount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentPresetBalanceCommand)PersistentProxi.createProxi(id, 243);
    }
    
    public PresetBalanceCommand getPresetBalanceCommand(long PresetBalanceCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 243)) return 243;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void amountSet(long PresetBalanceCommandId, long amountVal) throws PersistenceException {
        
    }
    public void invokerSet(long PresetBalanceCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long PresetBalanceCommandId, PersistentShopkeeper commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long PresetBalanceCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

