package persistence;

public class CartManagerListEntryProxi extends CartManagerProxi implements PersistentCartManagerListEntryProxi {

  long entryId;

  public CartManagerListEntryProxi(long objectId, long entryId) {
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