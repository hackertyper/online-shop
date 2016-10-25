package persistence;

import model.*;

import java.util.Iterator;

public class CustomerService_ServicesProxi extends PersistentListProxi<PersistentCustomerService> {

  	private CustomerServiceList list;
  	private CustomerService owner;

  	public CustomerService_ServicesProxi(CustomerService owner) {
    	this.owner = owner;
  	}
  	public CustomerServiceList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new CustomerServiceList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theCustomerServiceFacade.servicesGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<PersistentCustomerService> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(PersistentCustomerService entry) throws PersistenceException {
    	if (entry != null) {
      		CustomerServiceList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
        	               	.servicesAdd(owner.getId(), entry);
      		}
      		list.add((PersistentCustomerService)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade.servicesRem(entry.getListEntryId());
    	}
    	
  	}
  	public CustomerService_ServicesProxi copy(CustomerService owner) throws PersistenceException {
  		CustomerService_ServicesProxi result = new CustomerService_ServicesProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<PersistentCustomerService> entries = (this.list == null ? new java.util.Vector<PersistentCustomerService>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			PersistentCustomerService current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theCustomerServiceFacade
            	           .servicesAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
