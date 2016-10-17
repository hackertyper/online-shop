package persistence;

public class ChangeDescriptionCommandListEntryProxi extends ChangeDescriptionCommandProxi implements PersistentChangeDescriptionCommandListEntryProxi {

  long entryId;

  public ChangeDescriptionCommandListEntryProxi(long objectId, long entryId) {
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