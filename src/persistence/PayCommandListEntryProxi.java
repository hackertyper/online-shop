package persistence;

public class PayCommandListEntryProxi extends PayCommandProxi implements PersistentPayCommandListEntryProxi {

  long entryId;

  public PayCommandListEntryProxi(long objectId, long entryId) {
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