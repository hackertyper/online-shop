package persistence;

public class CheckOutCommandListEntryProxi extends CheckOutCommandProxi implements PersistentCheckOutCommandListEntryProxi {

  long entryId;

  public CheckOutCommandListEntryProxi(long objectId, long entryId) {
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