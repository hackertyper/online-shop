package persistence;

public class ShopServiceSearchList extends SearchListRoot<PersistentShopService> implements Iterable<PersistentShopService> {

	public ShopServiceSearchList(SearchListRoot<PersistentShopService> list){
		super(list);
	}
	public ShopServiceSearchList(){
		super();
	}
	
	public void add (PersistentShopService entry) {
		this.data.add(entry);
	}
	
	public void add(ShopServiceSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentShopService> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentShopService> iterator() {
		return this.data.iterator();
	}
  	public ShopServiceSearchList copy() throws PersistenceException {
  		ShopServiceSearchList result = new ShopServiceSearchList();
  		result.add(this);
  		return result;
  	}
}


