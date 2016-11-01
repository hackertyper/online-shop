package persistence;

import model.*;

import java.util.Iterator;

public class OrderManager_OrdersProxi extends PersistentListProxi<PersistentArrivedOrder> {

  	private ArrivedOrderList list;
  	private OrderManager owner;

  	public OrderManager_OrdersProxi(OrderManager owner) {
    	this.owner = owner;
  	}
  	public ArrivedOrderList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new ArrivedOrderList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theOrderManagerFacade.ordersGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<PersistentArrivedOrder> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(PersistentArrivedOrder entry) throws PersistenceException {
    	if (entry != null) {
      		ArrivedOrderList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
        	               	.ordersAdd(owner.getId(), entry);
      		}
      		list.add((PersistentArrivedOrder)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.ordersRem(entry.getListEntryId());
    	}
    	
  	}
  	public OrderManager_OrdersProxi copy(OrderManager owner) throws PersistenceException {
  		OrderManager_OrdersProxi result = new OrderManager_OrdersProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<PersistentArrivedOrder> entries = (this.list == null ? new java.util.Vector<PersistentArrivedOrder>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			PersistentArrivedOrder current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
            	           .ordersAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
