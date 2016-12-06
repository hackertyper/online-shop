package persistence;

public class PreOrderArticleListListEntryProxi extends PreOrderArticleListProxi implements PersistentPreOrderArticleListListEntryProxi {

  long entryId;

  public PreOrderArticleListListEntryProxi(long objectId, long entryId) {
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