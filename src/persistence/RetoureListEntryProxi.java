package persistence;

public class RetoureListEntryProxi extends RetoureProxi implements PersistentRetoureListEntryProxi {

  long entryId;

  public RetoureListEntryProxi(long objectId, long entryId) {
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