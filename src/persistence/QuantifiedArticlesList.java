package persistence;

import java.util.*;

public class QuantifiedArticlesList  extends QuantifiedArticlesSearchList{

	protected QuantifiedArticlesList() {
		super();
	}
	public Iterator<PersistentQuantifiedArticles> iterator(PersistentListProxi<PersistentQuantifiedArticles> listProxi) {
		return new PersistentListIterator<PersistentQuantifiedArticles>(listProxi, this.data);
	}
	public long getLength(){
		return this.data.size();
	}
	public void add (PersistentQuantifiedArticles entry) {
		this.data.add(entry);
	}
	@SuppressWarnings("unchecked")
	public QuantifiedArticlesList copy() {
		QuantifiedArticlesList result = new QuantifiedArticlesList();
		result.data = (Vector<PersistentQuantifiedArticles>)this.data.clone();
		return result;
	}


}


