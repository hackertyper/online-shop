package persistence;

public class CustomerOrderSearchList extends SearchListRoot<PersistentCustomerOrder> implements Iterable<PersistentCustomerOrder> {

	public CustomerOrderSearchList(SearchListRoot<PersistentCustomerOrder> list){
		super(list);
	}
	public CustomerOrderSearchList(){
		super();
	}
	
	public void add (PersistentCustomerOrder entry) {
		this.data.add(entry);
	}
	
	public void add(CustomerOrderSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentCustomerOrder> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentCustomerOrder> iterator() {
		return this.data.iterator();
	}
  	public CustomerOrderSearchList copy() throws PersistenceException {
  		CustomerOrderSearchList result = new CustomerOrderSearchList();
  		result.add(this);
  		return result;
  	}
}


