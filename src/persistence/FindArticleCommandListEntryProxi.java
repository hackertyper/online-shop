package persistence;

public class FindArticleCommandListEntryProxi extends FindArticleCommandProxi implements PersistentFindArticleCommandListEntryProxi {

  long entryId;

  public FindArticleCommandListEntryProxi(long objectId, long entryId) {
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