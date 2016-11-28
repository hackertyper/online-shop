package persistence;

public class TestDeliveryListEntryProxi extends TestDeliveryProxi implements PersistentTestDeliveryListEntryProxi {

  long entryId;

  public TestDeliveryListEntryProxi(long objectId, long entryId) {
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