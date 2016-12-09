package persistence;

import model.*;

public class ProductGroupFacade{



	public ProductGroupFacade() {
	}

    /* If idCreateIfLessZero is negative, a new id is generated. */
    public PersistentProductGroup newProductGroup(String description,long idCreateIfLessZero) throws PersistenceException {
        if(idCreateIfLessZero > 0) return (PersistentProductGroup)PersistentProxi.createProxi(idCreateIfLessZero, 102);
        long id = ConnectionHandler.getTheConnectionHandler().theItemFacade.getNextId();
        ProductGroup result = new ProductGroup(description,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 102);
    }
    
    public PersistentProductGroup newDelayedProductGroup(String description) throws PersistenceException {
        long id = ConnectionHandler.getTheConnectionHandler().theItemFacade.getNextId();
        ProductGroup result = new ProductGroup(description,null,null,id);
        Cache.getTheCache().put(result);
        return (PersistentProductGroup)PersistentProxi.createProxi(id, 102);
    }
    
    public ProductGroup getProductGroup(long ProductGroupId) throws PersistenceException{
        return null; //All data is in the cache!
    }
    public long itemListAdd(long ProductGroupId, PersistentItem itemListVal) throws PersistenceException {
        return 0;
    }
    public void itemListRem(long itemListId) throws PersistenceException {
        
    }
    public ItemList itemListGet(long ProductGroupId) throws PersistenceException {
        return new ItemList(); // remote access for initialization only!
    }
    public ProductGroupSearchList inverseGetItemList(long objectId, long classId)throws PersistenceException{
        ProductGroupSearchList result = new ProductGroupSearchList();
        java.util.Iterator<PersistentInCacheProxi> candidates;
        candidates = Cache.getTheCache().iterator(102);
        while (candidates.hasNext()){
            PersistentProductGroup current = (PersistentProductGroup)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null){
                java.util.Iterator<PersistentItem> iterator = ((ProductGroup_ItemListProxi)current.getItemList()).iterator();
                while(iterator.hasNext()){
                    PersistentProxi item = (PersistentProxi)iterator.next();
                    if (!item.isDltd() && !current.isDelayed$Persistence() && item.getClassId() == classId && item.getId() == objectId) {
                        PersistentProductGroup proxi = (PersistentProductGroup)PersistentProxi.createProxi(current.getId(), current.getClassId());
                        result.add((PersistentProductGroup)proxi.getThis());
                    }
                }
            }
        }
        return result;
    }

}

