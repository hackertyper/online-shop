package persistence;

public class CartManagerArticleListListEntryProxi extends CartManagerArticleListProxi implements PersistentCartManagerArticleListListEntryProxi {

  long entryId;

  public CartManagerArticleListListEntryProxi(long objectId, long entryId) {
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