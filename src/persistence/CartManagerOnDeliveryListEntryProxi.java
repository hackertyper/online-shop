package persistence;

public class CartManagerOnDeliveryListEntryProxi extends CartManagerOnDeliveryProxi implements PersistentCartManagerOnDeliveryListEntryProxi {

  long entryId;

  public CartManagerOnDeliveryListEntryProxi(long objectId, long entryId) {
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