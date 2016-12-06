package persistence;

import model.*;

import java.util.Iterator;

public class OrderManager_PreOrdersProxi extends PersistentListProxi<PersistentPreOrder> {

  	private PreOrderList list;
  	private OrderManager owner;

  	public OrderManager_PreOrdersProxi(OrderManager owner) {
    	this.owner = owner;
  	}
  	public PreOrderList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new PreOrderList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theOrderManagerFacade.preOrdersGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<PersistentPreOrder> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(PersistentPreOrder entry) throws PersistenceException {
    	if (entry != null) {
      		PreOrderList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
        	               	.preOrdersAdd(owner.getId(), entry);
      		}
      		list.add((PersistentPreOrder)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.preOrdersRem(entry.getListEntryId());
    	}
    	
  	}
  	public OrderManager_PreOrdersProxi copy(OrderManager owner) throws PersistenceException {
  		OrderManager_PreOrdersProxi result = new OrderManager_PreOrdersProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<PersistentPreOrder> entries = (this.list == null ? new java.util.Vector<PersistentPreOrder>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			PersistentPreOrder current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
            	           .preOrdersAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
