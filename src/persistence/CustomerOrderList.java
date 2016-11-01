package persistence;

import java.util.*;

public class CustomerOrderList  extends CustomerOrderSearchList{

	protected CustomerOrderList() {
		super();
	}
	public Iterator<PersistentCustomerOrder> iterator(PersistentListProxi<PersistentCustomerOrder> listProxi) {
		return new PersistentListIterator<PersistentCustomerOrder>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (PersistentCustomerOrder entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public CustomerOrderList copy() {
		CustomerOrderList result = new CustomerOrderList();
		result.data = (Vector<PersistentCustomerOrder>)this.data.clone();
		return result;
	}


}


