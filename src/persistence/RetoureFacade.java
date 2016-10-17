package persistence;

import model.*;

public class RetoureFacade{



	public RetoureFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentRetoure newRetoure(long remainingTimeToDelivery,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentRetoure)PersistentProxi.createProxi(idCreateIfLessZero, 134);
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        Retoure result = new Retoure(remainingTimeToDelivery,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRetoure)PersistentProxi.createProxi(id, 134);
    }
    
    public PersistentRetoure newDelayedRetoure(long remainingTimeToDelivery) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theDeliveryFacade.getNextId();
        Retoure result = new Retoure(remainingTimeToDelivery,null,id);
        Cache.getTheCache().put(result);
        return (PersistentRetoure)PersistentProxi.createProxi(id, 134);
    }
    
    public Retoure getRetoure(long RetoureId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long articleListAdd(long RetoureId, PersistentQuantifiedArticles articleListVal) throws PersistenceException {
        return 0;
    }
    public void articleListRem(long articleListId) throws PersistenceException {
        
    }
    public QuantifiedArticlesList articleListGet(long RetoureId) throws PersistenceException {
        return new QuantifiedArticlesList(); // remote access for initialization only!
    }

}

