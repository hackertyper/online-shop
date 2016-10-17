package persistence;

public class RemovedFSaleListEntryProxi extends RemovedFSaleProxi implements PersistentRemovedFSaleListEntryProxi {

  long entryId;

  public RemovedFSaleListEntryProxi(long objectId, long entryId) {
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