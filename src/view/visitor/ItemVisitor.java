
package view.visitor;

import view.*;

public interface ItemVisitor {
    
    public void handleArticle(ArticleView article) throws ModelException;
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException;
    
}
