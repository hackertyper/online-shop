package persistence;

public class SendOrderListEntryProxi extends SendOrderProxi implements PersistentSendOrderListEntryProxi {

  long entryId;

  public SendOrderListEntryProxi(long objectId, long entryId) {
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