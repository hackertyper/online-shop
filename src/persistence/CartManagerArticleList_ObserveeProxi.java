package persistence;

import model.*;

import java.util.Iterator;

public class CartManagerArticleList_ObserveeProxi extends PersistentListProxi<PersistentQuantifiedArticles> {

  	private QuantifiedArticlesList list;
  	private CartManagerArticleList owner;

  	public CartManagerArticleList_ObserveeProxi(CartManagerArticleList owner) {
    	this.owner = owner;
  	}
  	public QuantifiedArticlesList getList() throws PersistenceException{
    	if (this.list == null) {
      		if (this.owner.isDelayed$Persistence()) {
        		this.list = new QuantifiedArticlesList();
      		} else {
        		this.list = ConnectionHandler
                		    .getTheConnectionHandler()
                      		.theCartManagerArticleListFacade.observeeGet(this.owner.getId());
      		}
      		this.data = this.list.data;
    	}
    	return this.list;
  	}
  	public Iterator<PersistentQuantifiedArticles> iterator() throws PersistenceException{
    	return this.getList().iterator(this);
  	}
  	public long getLength() throws PersistenceException{
	  	return this.getList().getLength();
  	}
  	public void add(PersistentQuantifiedArticles entry) throws PersistenceException {
    	if (entry != null) {
      		QuantifiedArticlesList list = this.getList();
      		long entryId = 0;
      		if (!this.owner.isDelayed$Persistence()) {
        		entry.store();  	
        		entryId = ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade
        	               	.observeeAdd(owner.getId(), entry);
      		}
      		list.add((PersistentQuantifiedArticles)PersistentProxi.createListEntryProxi(entry.getId(),
            		                   entry.getClassId(),
        	    	                   entryId));
      		entry.register(this.owner);
    	}
  	}
  	protected void remove(PersistentListEntryProxi entry) throws PersistenceException {
    	if (!this.owner.isDelayed$Persistence()) {
      		ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade.observeeRem(entry.getListEntryId());
    	}
    	((PersistentQuantifiedArticles)entry).deregister(this.owner);
  	}
  	public CartManagerArticleList_ObserveeProxi copy(CartManagerArticleList owner) throws PersistenceException {
  		CartManagerArticleList_ObserveeProxi result = new CartManagerArticleList_ObserveeProxi(owner);
  		result.list = this.getList().copy();
  		return result;
  	}	 
  	public void store() throws PersistenceException {
  		java.util.Iterator<PersistentQuantifiedArticles> entries = (this.list == null ? new java.util.Vector<PersistentQuantifiedArticles>().iterator() : this.list.iterator(this));
  		while (entries.hasNext()){
  			PersistentQuantifiedArticles current = entries.next();
  			current.store();
      		long entryId = ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade
            	           .observeeAdd(owner.getId(), current);
        	((PersistentListEntryProxi)current).setListEntryId(entryId);
		}
	}
}
