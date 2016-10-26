package persistence;

public class ShopManagerListEntryProxi extends ShopManagerProxi implements PersistentShopManagerListEntryProxi {

  long entryId;

  public ShopManagerListEntryProxi(long objectId, long entryId) {
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