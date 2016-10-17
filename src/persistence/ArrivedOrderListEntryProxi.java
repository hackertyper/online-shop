package persistence;

public class ArrivedOrderListEntryProxi extends ArrivedOrderProxi implements PersistentArrivedOrderListEntryProxi {

  long entryId;

  public ArrivedOrderListEntryProxi(long objectId, long entryId) {
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