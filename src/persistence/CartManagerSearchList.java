package persistence;

public class CartManagerSearchList extends SearchListRoot<PersistentCartManager> implements Iterable<PersistentCartManager> {

	public CartManagerSearchList(SearchListRoot<PersistentCartManager> list){
		super(list);
	}
	public CartManagerSearchList(){
		super();
	}
	
	public void add (PersistentCartManager entry) {
		this.data.add(entry);
	}
	
	public void add(CartManagerSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentCartManager> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentCartManager> iterator() {
		return this.data.iterator();
	}
  	public CartManagerSearchList copy() throws PersistenceException {
  		CartManagerSearchList result = new CartManagerSearchList();
  		result.add(this);
  		return result;
  	}
}


