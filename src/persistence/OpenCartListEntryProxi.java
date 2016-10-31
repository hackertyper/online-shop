package persistence;

public class OpenCartListEntryProxi extends OpenCartProxi implements PersistentOpenCartListEntryProxi {

  long entryId;

  public OpenCartListEntryProxi(long objectId, long entryId) {
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