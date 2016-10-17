package persistence;

public class QuantifiedArticlesListEntryProxi extends QuantifiedArticlesProxi implements PersistentQuantifiedArticlesListEntryProxi {

  long entryId;

  public QuantifiedArticlesListEntryProxi(long objectId, long entryId) {
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