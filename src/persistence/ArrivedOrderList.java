package persistence;

import java.util.*;

public class ArrivedOrderList {

	protected Vector<PersistentArrivedOrder> data; //List of proxies
	protected ArrivedOrderList() {
		this.data = new Vector<PersistentArrivedOrder>();
	}
	public Iterator<PersistentArrivedOrder> iterator(PersistentListProxi<PersistentArrivedOrder> listProxi) {
		return new PersistentListIterator<PersistentArrivedOrder>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (PersistentArrivedOrder entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ArrivedOrderList copy() {
		ArrivedOrderList result = new ArrivedOrderList();
		result.data = (Vector<PersistentArrivedOrder>)this.data.clone();
		return result;
	}


}


