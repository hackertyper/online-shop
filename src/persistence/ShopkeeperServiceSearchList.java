package persistence;

public class ShopkeeperServiceSearchList extends SearchListRoot<PersistentShopkeeperService> implements Iterable<PersistentShopkeeperService> {

	public ShopkeeperServiceSearchList(SearchListRoot<PersistentShopkeeperService> list){
		super(list);
	}
	public ShopkeeperServiceSearchList(){
		super();
	}
	
	public void add (PersistentShopkeeperService entry) {
		this.data.add(entry);
	}
	
	public void add(ShopkeeperServiceSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentShopkeeperService> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentShopkeeperService> iterator() {
		return this.data.iterator();
	}
  	public ShopkeeperServiceSearchList copy() throws PersistenceException {
  		ShopkeeperServiceSearchList result = new ShopkeeperServiceSearchList();
  		result.add(this);
  		return result;
  	}
}


