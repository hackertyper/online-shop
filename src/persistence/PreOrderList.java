package persistence;

import java.util.*;

public class PreOrderList {

	protected Vector<PersistentPreOrder> data; //List of proxies
	protected PreOrderList() {
		this.data = new Vector<PersistentPreOrder>();
	}
	public Iterator<PersistentPreOrder> iterator(PersistentListProxi<PersistentPreOrder> listProxi) {
		return new PersistentListIterator<PersistentPreOrder>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (PersistentPreOrder entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public PreOrderList copy() {
		PreOrderList result = new PreOrderList();
		result.data = (Vector<PersistentPreOrder>)this.data.clone();
		return result;
	}


}


