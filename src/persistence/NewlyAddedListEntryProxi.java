package persistence;

public class NewlyAddedListEntryProxi extends NewlyAddedProxi implements PersistentNewlyAddedListEntryProxi {

  long entryId;

  public NewlyAddedListEntryProxi(long objectId, long entryId) {
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