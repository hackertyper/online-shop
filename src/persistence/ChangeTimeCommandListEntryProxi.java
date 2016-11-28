package persistence;

public class ChangeTimeCommandListEntryProxi extends ChangeTimeCommandProxi implements PersistentChangeTimeCommandListEntryProxi {

  long entryId;

  public ChangeTimeCommandListEntryProxi(long objectId, long entryId) {
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