package persistence;

import java.util.*;

public class CustomerServiceList  extends CustomerServiceSearchList{

	protected CustomerServiceList() {
		super();
	}
	public Iterator<PersistentCustomerService> iterator(PersistentListProxi<PersistentCustomerService> listProxi) {
		return new PersistentListIterator<PersistentCustomerService>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (PersistentCustomerService entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public CustomerServiceList copy() {
		CustomerServiceList result = new CustomerServiceList();
		result.data = (Vector<PersistentCustomerService>)this.data.clone();
		return result;
	}


}


