package persistence;

public class ChangeChargeCommandListEntryProxi extends ChangeChargeCommandProxi implements PersistentChangeChargeCommandListEntryProxi {

  long entryId;

  public ChangeChargeCommandListEntryProxi(long objectId, long entryId) {
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