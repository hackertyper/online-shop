package persistence;

public class CustomerServiceSearchList extends SearchListRoot<PersistentCustomerService> implements Iterable<PersistentCustomerService> {

	public CustomerServiceSearchList(SearchListRoot<PersistentCustomerService> list){
		super(list);
	}
	public CustomerServiceSearchList(){
		super();
	}
	
	public void add (PersistentCustomerService entry) {
		this.data.add(entry);
	}
	
	public void add(CustomerServiceSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentCustomerService> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentCustomerService> iterator() {
		return this.data.iterator();
	}
  	public CustomerServiceSearchList copy() throws PersistenceException {
  		CustomerServiceSearchList result = new CustomerServiceSearchList();
  		result.add(this);
  		return result;
  	}
}


