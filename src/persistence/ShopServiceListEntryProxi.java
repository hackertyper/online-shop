package persistence;

public class ShopServiceListEntryProxi extends ShopServiceProxi implements PersistentShopServiceListEntryProxi {

  long entryId;

  public ShopServiceListEntryProxi(long objectId, long entryId) {
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