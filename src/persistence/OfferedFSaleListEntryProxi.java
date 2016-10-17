package persistence;

public class OfferedFSaleListEntryProxi extends OfferedFSaleProxi implements PersistentOfferedFSaleListEntryProxi {

  long entryId;

  public OfferedFSaleListEntryProxi(long objectId, long entryId) {
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