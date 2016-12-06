package persistence;

public class ProductGroupItemListListEntryProxi extends ProductGroupItemListProxi implements PersistentProductGroupItemListListEntryProxi {

  long entryId;

  public ProductGroupItemListListEntryProxi(long objectId, long entryId) {
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