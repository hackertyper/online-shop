package persistence;

public class ChangeAmountCommandListEntryProxi extends ChangeAmountCommandProxi implements PersistentChangeAmountCommandListEntryProxi {

  long entryId;

  public ChangeAmountCommandListEntryProxi(long objectId, long entryId) {
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