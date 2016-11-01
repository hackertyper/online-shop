package persistence;

import model.*;

import java.util.Iterator;

public class OrderManager_AllOrdersProxi extends PersistentListProxi<PersistentCustomerOrder> {

  	private CustomerOrderList list;
  	private OrderManager owner;

  	public OrderManager_AllOrdersProxi(OrderManager owner) {
    	this.owner = owner;
  	}
  	public CustomerOrderList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new CustomerOrderList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theOrderManagerFacade.allOrdersGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<PersistentCustomerOrder> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(PersistentCustomerOrder entry) throws PersistenceException {
    	if (entry != null) {
      		CustomerOrderList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
        	               	.allOrdersAdd(owner.getId(), entry);
      		}
      		list.add((PersistentCustomerOrder)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade.allOrdersRem(entry.getListEntryId());
    	}
    	
  	}
  	public OrderManager_AllOrdersProxi copy(OrderManager owner) throws PersistenceException {
  		OrderManager_AllOrdersProxi result = new OrderManager_AllOrdersProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<PersistentCustomerOrder> entries = (this.list == null ? new java.util.Vector<PersistentCustomerOrder>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			PersistentCustomerOrder current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
            	           .allOrdersAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
