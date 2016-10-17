package persistence;

public class RegisterServiceListEntryProxi extends RegisterServiceProxi implements PersistentRegisterServiceListEntryProxi {

  long entryId;

  public RegisterServiceListEntryProxi(long objectId, long entryId) {
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