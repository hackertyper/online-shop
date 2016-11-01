package persistence;

public class RetoureDeliveryCommandListEntryProxi extends RetoureDeliveryCommandProxi implements PersistentRetoureDeliveryCommandListEntryProxi {

  long entryId;

  public RetoureDeliveryCommandListEntryProxi(long objectId, long entryId) {
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