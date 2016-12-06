package persistence;

import model.*;

import java.util.Iterator;

public class ProductGroupItemList_ObserveeProxi extends PersistentListProxi<PersistentItem> {

  	private ItemList list;
  	private ProductGroupItemList owner;

  	public ProductGroupItemList_ObserveeProxi(ProductGroupItemList owner) {
    	this.owner = owner;
  	}
  	public ItemList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ItemList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theProductGroupItemListFacade.observeeGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<PersistentItem> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(PersistentItem entry) throws PersistenceException {
    	if (entry != null) {
      		ItemList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theProductGroupItemListFacade
        	               	.observeeAdd(owner.getId(), entry);
      		}
      		list.add((PersistentItem)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		entry.register(this.owner);
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theProductGroupItemListFacade.observeeRem(entry.getListEntryId());
    	}
    	((PersistentItem)entry).deregister(this.owner);
  	}
  	public ProductGroupItemList_ObserveeProxi copy(ProductGroupItemList owner) throws PersistenceException {
  		ProductGroupItemList_ObserveeProxi result = new ProductGroupItemList_ObserveeProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<PersistentItem> entries = (this.list == null ? new java.util.Vector<PersistentItem>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			PersistentItem current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theProductGroupItemListFacade
            	           .observeeAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
