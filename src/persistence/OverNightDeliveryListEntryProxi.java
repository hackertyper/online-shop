package persistence;

public class OverNightDeliveryListEntryProxi extends OverNightDeliveryProxi implements PersistentOverNightDeliveryListEntryProxi {

  long entryId;

  public OverNightDeliveryListEntryProxi(long objectId, long entryId) {
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