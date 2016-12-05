package persistence;

public class RetoureArticleCommandListEntryProxi extends RetoureArticleCommandProxi implements PersistentRetoureArticleCommandListEntryProxi {

  long entryId;

  public RetoureArticleCommandListEntryProxi(long objectId, long entryId) {
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