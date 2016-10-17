package persistence;

public class ShopkeeperListEntryProxi extends ShopkeeperProxi implements PersistentShopkeeperListEntryProxi {

  long entryId;

  public ShopkeeperListEntryProxi(long objectId, long entryId) {
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