package persistence;

public class CustomerManagerListEntryProxi extends CustomerManagerProxi implements PersistentCustomerManagerListEntryProxi {

  long entryId;

  public CustomerManagerListEntryProxi(long objectId, long entryId) {
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