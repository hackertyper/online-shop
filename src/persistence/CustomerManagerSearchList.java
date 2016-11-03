package persistence;

public class CustomerManagerSearchList extends SearchListRoot<PersistentCustomerManager> implements Iterable<PersistentCustomerManager> {

	public CustomerManagerSearchList(SearchListRoot<PersistentCustomerManager> list){
		super(list);
	}
	public CustomerManagerSearchList(){
		super();
	}
	
	public void add (PersistentCustomerManager entry) {
		this.data.add(entry);
	}
	
	public void add(CustomerManagerSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentCustomerManager> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentCustomerManager> iterator() {
		return this.data.iterator();
	}
  	public CustomerManagerSearchList copy() throws PersistenceException {
  		CustomerManagerSearchList result = new CustomerManagerSearchList();
  		result.add(this);
  		return result;
  	}
}


