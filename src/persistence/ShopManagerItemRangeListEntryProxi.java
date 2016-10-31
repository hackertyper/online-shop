package persistence;

public class ShopManagerItemRangeListEntryProxi extends ShopManagerItemRangeProxi implements PersistentShopManagerItemRangeListEntryProxi {

  long entryId;

  public ShopManagerItemRangeListEntryProxi(long objectId, long entryId) {
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