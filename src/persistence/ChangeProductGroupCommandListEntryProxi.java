package persistence;

public class ChangeProductGroupCommandListEntryProxi extends ChangeProductGroupCommandProxi implements PersistentChangeProductGroupCommandListEntryProxi {

  long entryId;

  public ChangeProductGroupCommandListEntryProxi(long objectId, long entryId) {
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