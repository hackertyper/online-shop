package common;

import persistence.PersistenceException;
import persistence.PersistentOfferedFSale;

public class ArticleStockChecker implements Runnable {

	private PersistentOfferedFSale article;

	public ArticleStockChecker(PersistentOfferedFSale a) {
		this.article = a;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(10000);
				article.reorder();
			} catch (PersistenceException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
