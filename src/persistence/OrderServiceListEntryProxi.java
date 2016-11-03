package persistence;

public class OrderServiceListEntryProxi extends OrderServiceProxi implements PersistentOrderServiceListEntryProxi {

  long entryId;

  public OrderServiceListEntryProxi(long objectId, long entryId) {
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