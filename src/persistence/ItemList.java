package persistence;

import java.util.*;

public class ItemList  extends ItemSearchList{

	protected ItemList() {
		super();
	}
	public Iterator<PersistentItem> iterator(PersistentListProxi<PersistentItem> listProxi) {
		return new PersistentListIterator<PersistentItem>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (PersistentItem entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public ItemList copy() {
		ItemList result = new ItemList();
		result.data = (Vector<PersistentItem>)this.data.clone();
		return result;
	}


}


