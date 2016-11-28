package persistence;

public class StandardDeliveryListEntryProxi extends StandardDeliveryProxi implements PersistentStandardDeliveryListEntryProxi {

  long entryId;

  public StandardDeliveryListEntryProxi(long objectId, long entryId) {
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