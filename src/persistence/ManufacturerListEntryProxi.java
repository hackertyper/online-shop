package persistence;

public class ManufacturerListEntryProxi extends ManufacturerProxi implements PersistentManufacturerListEntryProxi {

  long entryId;

  public ManufacturerListEntryProxi(long objectId, long entryId) {
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