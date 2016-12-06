package persistence;

public class CustomerOrderArticleListListEntryProxi extends CustomerOrderArticleListProxi implements PersistentCustomerOrderArticleListListEntryProxi {

  long entryId;

  public CustomerOrderArticleListListEntryProxi(long objectId, long entryId) {
    super(objectId);
    this.entryId = entryId;
  }
	
  public long getListEntryId() {
    return this.entryId;
  }
  public void setListEntryId(long id){
	this.entryId = id;  
  }

}