package persistence;

public class CartServiceSearchList extends SearchListRoot<PersistentCartService> implements Iterable<PersistentCartService> {

	public CartServiceSearchList(SearchListRoot<PersistentCartService> list){
		super(list);
	}
	public CartServiceSearchList(){
		super();
	}
	
	public void add (PersistentCartService entry) {
		this.data.add(entry);
	}
	
	public void add(CartServiceSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentCartService> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentCartService> iterator() {
		return this.data.iterator();
	}
  	public CartServiceSearchList copy() throws PersistenceException {
  		CartServiceSearchList result = new CartServiceSearchList();
  		result.add(this);
  		return result;
  	}
}


