
package view.visitor;

import view.*;

public interface ItemExceptionVisitor<E extends view.UserException> extends ProductGroupExceptionVisitor<E>{
    
    public void handleArticle(ArticleView article) throws ModelException, E;
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException, E;
    
}
