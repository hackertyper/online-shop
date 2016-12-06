package persistence;

public class PreorderCommandListEntryProxi extends PreorderCommandProxi implements PersistentPreorderCommandListEntryProxi {

  long entryId;

  public PreorderCommandListEntryProxi(long objectId, long entryId) {
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