package persistence;

import model.meta.*;

public class ChangeAmountCommandFacade{

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

	

	public ChangeAmountCommandFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentChangeAmountCommand newChangeAmountCommand(long newAmount,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentChangeAmountCommand)PersistentProxi.createProxi(idCreateIfLessZero, 214);
        long id = ConnectionHandler.getTheConnectionHandler().theChangeAmountCommandFacade.getNextId();
        ChangeAmountCommand result = new ChangeAmountCommand(null,newAmount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeAmountCommand)PersistentProxi.createProxi(id, 214);
    }
    
    public PersistentChangeAmountCommand newDelayedChangeAmountCommand(long newAmount) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theChangeAmountCommandFacade.getNextId();
        ChangeAmountCommand result = new ChangeAmountCommand(null,newAmount,null,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentChangeAmountCommand)PersistentProxi.createProxi(id, 214);
    }
    
    public ChangeAmountCommand getChangeAmountCommand(long ChangeAmountCommandId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 214)) return 214;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public void articleSet(long ChangeAmountCommandId, PersistentQuantifiedArticles articleVal) throws PersistenceException {
        
    }
    public void newAmountSet(long ChangeAmountCommandId, long newAmountVal) throws PersistenceException {
        
    }
    public void invokerSet(long ChangeAmountCommandId, Invoker invokerVal) throws PersistenceException {
        
    }
    public void commandReceiverSet(long ChangeAmountCommandId, PersistentCartManager commandReceiverVal) throws PersistenceException {
        
    }
    public void myCommonDateSet(long ChangeAmountCommandId, PersistentCommonDate myCommonDateVal) throws PersistenceException {
        
    }

}

