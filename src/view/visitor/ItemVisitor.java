
package view.visitor;

import view.*;

public interface ItemVisitor extends ProductGroupVisitor{
    
    public void handleArticle(ArticleView article) throws ModelException;
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException;
    
}
