package persistence;

public class QuantifiedArticlesSearchList extends SearchListRoot<PersistentQuantifiedArticles> implements Iterable<PersistentQuantifiedArticles> {

	public QuantifiedArticlesSearchList(SearchListRoot<PersistentQuantifiedArticles> list){
		super(list);
	}
	public QuantifiedArticlesSearchList(){
		super();
	}
	
	public void add (PersistentQuantifiedArticles entry) {
		this.data.add(entry);
	}
	
	public void add(QuantifiedArticlesSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentQuantifiedArticles> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentQuantifiedArticles> iterator() {
		return this.data.iterator();
	}
  	public QuantifiedArticlesSearchList copy() throws PersistenceException {
  		QuantifiedArticlesSearchList result = new QuantifiedArticlesSearchList();
  		result.add(this);
  		return result;
  	}
}


