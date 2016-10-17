package persistence;

public class OrderCommandListEntryProxi extends OrderCommandProxi implements PersistentOrderCommandListEntryProxi {

  long entryId;

  public OrderCommandListEntryProxi(long objectId, long entryId) {
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