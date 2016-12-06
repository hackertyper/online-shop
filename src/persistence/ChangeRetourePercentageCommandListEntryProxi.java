package persistence;

public class ChangeRetourePercentageCommandListEntryProxi extends ChangeRetourePercentageCommandProxi implements PersistentChangeRetourePercentageCommandListEntryProxi {

  long entryId;

  public ChangeRetourePercentageCommandListEntryProxi(long objectId, long entryId) {
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