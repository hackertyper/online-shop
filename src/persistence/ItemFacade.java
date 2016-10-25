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
        if(Cache.getTheCache().contains(objectId, 150)) return 150;
        if(Cache.getTheCache().contains(objectId, 144)) return 144;
        
        throw new PersistenceException("No such object: " + new Long(objectId).toString(), 0);
        
    }
    public ItemSearchList getItemByDescription(String description) throws PersistenceException {
        description = description.replaceAll("%", ".*");
        description = description.replaceAll("_", ".");
        ItemSearchList result = new ItemSearchList();
        java.util.Iterator<?> candidates;
        candidates = Cache.getTheCache().iterator(150);
        while (candidates.hasNext()){
            PersistentItem current = (PersistentItem)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getDescription().matches(description))
                result.add((PersistentItem)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        candidates = Cache.getTheCache().iterator(144);
        while (candidates.hasNext()){
            PersistentItem current = (PersistentItem)((PersistentRoot)candidates.next()).getTheObject();
            if (current != null && !current.isDltd() && !current.isDelayed$Persistence() && current.getDescription().matches(description))
                result.add((PersistentItem)PersistentProxi.createProxi(current.getId(), current.getClassId()));
        }
        return result;
    }
    public void descriptionSet(long ItemId, String descriptionVal) throws PersistenceException {
        
    }
    public void ThisSet(long ItemId, PersistentItem ThisVal) throws PersistenceException {
        
    }

}

