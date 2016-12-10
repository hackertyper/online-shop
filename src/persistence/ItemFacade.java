package persistence;



public class ItemFacade{

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

	

	public ItemFacade() {
	}

    public long getClass(long objectId) throws PersistenceException{
        if(Cache.getTheCache().contains(objectId, 276)) return 276;
        if(Cache.getTheCache().contains(objectId, 149)) return 149;
        if(Cache.getTheCache().contains(objectId, 193)) return 193;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public ItemSearchList getItemByDescription(String description) throws PersistenceException {
        description = description.replaceAll("%", ".*");
        description = description.replaceAll("_", ".");
        ItemSearchList result = new ItemSearchList();
        java.util.Iterator<?> candidates;
        candidates = Cache.getTheCache().iterator(276);
        while (candidates.hasNext()){
            PersistentItem current = (PersistentItem)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getDescription().matches(description))
                result.add((PersistentItem)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        candidates = Cache.getTheCache().iterator(149);
        while (candidates.hasNext()){
            PersistentItem current = (PersistentItem)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getDescription().matches(description))
                result.add((PersistentItem)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        candidates = Cache.getTheCache().iterator(193);
        while (candidates.hasNext()){
            PersistentItem current = (PersistentItem)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getDescription().matches(description))
                result.add((PersistentItem)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        return result;
    }
    public void descriptionSet(long ItemId, String descriptionVal) throws PersistenceException {
        
    }
    public void subServiceSet(long ItemId, SubjInterface subServiceVal) throws PersistenceException {
        
    }
    public void ThisSet(long ItemId, PersistentItem ThisVal) throws PersistenceException {
        
    }

}

