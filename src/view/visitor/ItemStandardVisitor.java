
package view.visitor;

import view.*;

public abstract class ItemStandardVisitor implements ItemVisitor {
    
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.standardHandling(productGroup);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.standardHandling(article);
    }
    protected abstract void standardHandling(ItemView item) throws ModelException;
}
