package persistence;

public class CancelCommandListEntryProxi extends CancelCommandProxi implements PersistentCancelCommandListEntryProxi {

  long entryId;

  public CancelCommandListEntryProxi(long objectId, long entryId) {
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