package persistence;

public abstract class DeliveryListEntryProxi extends DeliveryProxi implements PersistentDeliveryListEntryProxi {

  long entryId;

  public DeliveryListEntryProxi(long objectId, long entryId) {
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