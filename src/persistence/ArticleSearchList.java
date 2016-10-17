package persistence;

public class ArticleSearchList extends SearchListRoot<PersistentArticle> implements Iterable<PersistentArticle> {

	public ArticleSearchList(SearchListRoot<PersistentArticle> list){
		super(list);
	}
	public ArticleSearchList(){
		super();
	}
	
	public void add (PersistentArticle entry) {
		this.data.add(entry);
	}
	
	public void add(ArticleSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentArticle> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentArticle> iterator() {
		return this.data.iterator();
	}
  	public ArticleSearchList copy() throws PersistenceException {
  		ArticleSearchList result = new ArticleSearchList();
  		result.add(this);
  		return result;
  	}
}


