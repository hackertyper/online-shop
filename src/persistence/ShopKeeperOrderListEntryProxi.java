package persistence;

public class ShopKeeperOrderListEntryProxi extends ShopKeeperOrderProxi implements PersistentShopKeeperOrderListEntryProxi {

  long entryId;

  public ShopKeeperOrderListEntryProxi(long objectId, long entryId) {
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