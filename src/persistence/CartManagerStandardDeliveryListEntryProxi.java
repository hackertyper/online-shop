package persistence;

public class CartManagerStandardDeliveryListEntryProxi extends CartManagerStandardDeliveryProxi implements PersistentCartManagerStandardDeliveryListEntryProxi {

  long entryId;

  public CartManagerStandardDeliveryListEntryProxi(long objectId, long entryId) {
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