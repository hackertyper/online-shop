package persistence;

public class CartListEntryProxi extends CartProxi implements PersistentCartListEntryProxi {

  long entryId;

  public CartListEntryProxi(long objectId, long entryId) {
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