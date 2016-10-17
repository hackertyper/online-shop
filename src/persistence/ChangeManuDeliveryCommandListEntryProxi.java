package persistence;

public class ChangeManuDeliveryCommandListEntryProxi extends ChangeManuDeliveryCommandProxi implements PersistentChangeManuDeliveryCommandListEntryProxi {

  long entryId;

  public ChangeManuDeliveryCommandListEntryProxi(long objectId, long entryId) {
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