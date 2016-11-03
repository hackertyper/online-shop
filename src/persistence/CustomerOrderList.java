package persistence;

import java.util.*;

public class CustomerOrderList {

	protected Vector<PersistentCustomerOrder> data; //List of proxies
	protected CustomerOrderList() {
		this.data = new Vector<PersistentCustomerOrder>();
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


