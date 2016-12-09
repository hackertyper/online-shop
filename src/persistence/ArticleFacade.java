package persistence;

import model.*;

public class ArticleFacade{



	public ArticleFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentArticle newArticle(String description,long price,long minStock,long maxStock,long stock,long reserved,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentArticle)PersistentProxi.createProxi(idCreateIfLessZero, 109);
        long id = ConnectionHandler.getTheConnectionHandler().theItemFacade.getNextId();
        Article result = new Article(description,null,null,null,null,null,price,minStock,maxStock,stock,reserved,id);
        Cache.getTheCache().put(result);
        return (PersistentArticle)PersistentProxi.createProxi(id, 109);
    }
    
    public PersistentArticle newDelayedArticle(String description,long price,long minStock,long maxStock,long stock,long reserved) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theItemFacade.getNextId();
        Article result = new Article(description,null,null,null,null,null,price,minStock,maxStock,stock,reserved,id);
        Cache.getTheCache().put(result);
        return (PersistentArticle)PersistentProxi.createProxi(id, 109);
    }
    
    public Article getArticle(long ArticleId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public void manufacturerSet(long ArticleId, PersistentManufacturer manufacturerVal) throws PersistenceException {
        
    }
    public void stateSet(long ArticleId, ArticleState stateVal) throws PersistenceException {
        
    }
    public void myWrapperSet(long ArticleId, PersistentArticleWrapper myWrapperVal) throws PersistenceException {
        
    }
    public void priceSet(long ArticleId, long priceVal) throws PersistenceException {
        
    }
    public void minStockSet(long ArticleId, long minStockVal) throws PersistenceException {
        
    }
    public void maxStockSet(long ArticleId, long maxStockVal) throws PersistenceException {
        
    }
    public void stockSet(long ArticleId, long stockVal) throws PersistenceException {
        
    }
    public void reservedSet(long ArticleId, long reservedVal) throws PersistenceException {
        
    }
    public ArticleSearchList inverseGetState(long objectId, long classId)throws PersistenceException{
        ArticleSearchList result = new ArticleSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(109);
        while (candidates.hasNext()){
            PersistentArticle current = (PersistentArticle)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getState() != null){
                if (current.getState().getClassId() == classId && current.getState().getId() == objectId) {
                    PersistentArticle proxi = (PersistentArticle)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentArticle)proxi.getThis());
                }
            }
        }
        return result;
    }
    public ArticleSearchList inverseGetMyWrapper(long objectId, long classId)throws PersistenceException{
        ArticleSearchList result = new ArticleSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(109);
        while (candidates.hasNext()){
            PersistentArticle current = (PersistentArticle)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getMyWrapper() != null){
                if (current.getMyWrapper().getClassId() == classId && current.getMyWrapper().getId() == objectId) {
                    PersistentArticle proxi = (PersistentArticle)PersistentProxi.createProxi(current.getId(), current.getClassId());
                    result.add((PersistentArticle)proxi.getThis());
                }
            }
        }
        return result;
    }

}

