package persistence;

public class PresetBalanceCommandListEntryProxi extends PresetBalanceCommandProxi implements PersistentPresetBalanceCommandListEntryProxi {

  long entryId;

  public PresetBalanceCommandListEntryProxi(long objectId, long entryId) {
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