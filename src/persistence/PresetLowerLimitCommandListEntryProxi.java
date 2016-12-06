package persistence;

public class PresetLowerLimitCommandListEntryProxi extends PresetLowerLimitCommandProxi implements PersistentPresetLowerLimitCommandListEntryProxi {

  long entryId;

  public PresetLowerLimitCommandListEntryProxi(long objectId, long entryId) {
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