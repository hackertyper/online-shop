package persistence;

public class AddToCartCommandListEntryProxi extends AddToCartCommandProxi implements PersistentAddToCartCommandListEntryProxi {

  long entryId;

  public AddToCartCommandListEntryProxi(long objectId, long entryId) {
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