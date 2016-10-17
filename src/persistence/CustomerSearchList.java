package persistence;

public class CustomerSearchList extends SearchListRoot<PersistentCustomer> implements Iterable<PersistentCustomer> {

	public CustomerSearchList(SearchListRoot<PersistentCustomer> list){
		super(list);
	}
	public CustomerSearchList(){
		super();
	}
	
	public void add (PersistentCustomer entry) {
		this.data.add(entry);
	}
	
	public void add(CustomerSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentCustomer> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentCustomer> iterator() {
		return this.data.iterator();
	}
  	public CustomerSearchList copy() throws PersistenceException {
  		CustomerSearchList result = new CustomerSearchList();
  		result.add(this);
  		return result;
  	}
}


