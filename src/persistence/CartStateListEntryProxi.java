package persistence;

public abstract class CartStateListEntryProxi extends CartStateProxi implements PersistentCartStateListEntryProxi {

  long entryId;

  public CartStateListEntryProxi(long objectId, long entryId) {
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