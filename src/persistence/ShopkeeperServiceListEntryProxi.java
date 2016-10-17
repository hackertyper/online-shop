package persistence;

public class ShopkeeperServiceListEntryProxi extends ShopkeeperServiceProxi implements PersistentShopkeeperServiceListEntryProxi {

  long entryId;

  public ShopkeeperServiceListEntryProxi(long objectId, long entryId) {
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