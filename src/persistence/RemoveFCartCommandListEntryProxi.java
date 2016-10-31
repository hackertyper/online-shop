package persistence;

public class RemoveFCartCommandListEntryProxi extends RemoveFCartCommandProxi implements PersistentRemoveFCartCommandListEntryProxi {

  long entryId;

  public RemoveFCartCommandListEntryProxi(long objectId, long entryId) {
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