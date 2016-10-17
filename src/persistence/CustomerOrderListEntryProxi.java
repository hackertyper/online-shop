package persistence;

public class CustomerOrderListEntryProxi extends CustomerOrderProxi implements PersistentCustomerOrderListEntryProxi {

  long entryId;

  public CustomerOrderListEntryProxi(long objectId, long entryId) {
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