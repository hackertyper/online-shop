package persistence;

public class OrderServiceSearchList extends SearchListRoot<PersistentOrderService> implements Iterable<PersistentOrderService> {

	public OrderServiceSearchList(SearchListRoot<PersistentOrderService> list){
		super(list);
	}
	public OrderServiceSearchList(){
		super();
	}
	
	public void add (PersistentOrderService entry) {
		this.data.add(entry);
	}
	
	public void add(OrderServiceSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentOrderService> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentOrderService> iterator() {
		return this.data.iterator();
	}
  	public OrderServiceSearchList copy() throws PersistenceException {
  		OrderServiceSearchList result = new OrderServiceSearchList();
  		result.add(this);
  		return result;
  	}
}


