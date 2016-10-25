package persistence;

public class CartServiceListEntryProxi extends CartServiceProxi implements PersistentCartServiceListEntryProxi {

  long entryId;

  public CartServiceListEntryProxi(long objectId, long entryId) {
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