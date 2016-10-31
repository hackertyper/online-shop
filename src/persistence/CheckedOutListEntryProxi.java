package persistence;

public class CheckedOutListEntryProxi extends CheckedOutProxi implements PersistentCheckedOutListEntryProxi {

  long entryId;

  public CheckedOutListEntryProxi(long objectId, long entryId) {
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