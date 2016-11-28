package persistence;

public abstract class CustomerDeliveryListEntryProxi extends CustomerDeliveryProxi implements PersistentCustomerDeliveryListEntryProxi {

  long entryId;

  public CustomerDeliveryListEntryProxi(long objectId, long entryId) {
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