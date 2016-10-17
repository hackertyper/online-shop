package persistence;

public abstract class ItemListEntryProxi extends ItemProxi implements PersistentItemListEntryProxi {

  long entryId;

  public ItemListEntryProxi(long objectId, long entryId) {
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