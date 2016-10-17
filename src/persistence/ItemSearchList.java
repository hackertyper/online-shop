package persistence;

public class ItemSearchList extends SearchListRoot<PersistentItem> implements Iterable<PersistentItem> {

	public ItemSearchList(SearchListRoot<PersistentItem> list){
		super(list);
	}
	public ItemSearchList(){
		super();
	}
	
	public void add (PersistentItem entry) {
		this.data.add(entry);
	}
	
	public void add(ItemSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentItem> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentItem> iterator() {
		return this.data.iterator();
	}
  	public ItemSearchList copy() throws PersistenceException {
  		ItemSearchList result = new ItemSearchList();
  		result.add(this);
  		return result;
  	}
}


