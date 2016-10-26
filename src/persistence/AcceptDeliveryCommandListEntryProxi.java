package persistence;

public class AcceptDeliveryCommandListEntryProxi extends AcceptDeliveryCommandProxi implements PersistentAcceptDeliveryCommandListEntryProxi {

  long entryId;

  public AcceptDeliveryCommandListEntryProxi(long objectId, long entryId) {
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