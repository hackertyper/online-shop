package common;

import persistence.PersistentOfferedFSale;

public class ArticleStockChecker implements Runnable {

	private PersistentOfferedFSale article;

	public ArticleStockChecker(PersistentOfferedFSale a) {
		this.article = a;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(10000);
				article.reorder();
			}
		} catch (Exception e) {
		}
	}
}
