package persistence;

public class AccountManagerSearchList extends SearchListRoot<PersistentAccountManager> implements Iterable<PersistentAccountManager> {

	public AccountManagerSearchList(SearchListRoot<PersistentAccountManager> list){
		super(list);
	}
	public AccountManagerSearchList(){
		super();
	}
	
	public void add (PersistentAccountManager entry) {
		this.data.add(entry);
	}
	
	public void add(AccountManagerSearchList list) throws PersistenceException{
		java.util.Iterator<PersistentAccountManager> entries = list.iterator();
		while (entries.hasNext()){
			this.add(entries.next());
		}
	}
	public java.util.Iterator<PersistentAccountManager> iterator() {
		return this.data.iterator();
	}
  	public AccountManagerSearchList copy() throws PersistenceException {
  		AccountManagerSearchList result = new AccountManagerSearchList();
  		result.add(this);
  		return result;
  	}
}


