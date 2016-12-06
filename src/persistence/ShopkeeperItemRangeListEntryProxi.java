package persistence;

public class ShopkeeperItemRangeListEntryProxi extends ShopkeeperItemRangeProxi implements PersistentShopkeeperItemRangeListEntryProxi {

  long entryId;

  public ShopkeeperItemRangeListEntryProxi(long objectId, long entryId) {
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