
package model.visitor;

import persistence.*;

public abstract class ItemStandardVisitor implements ItemVisitor {
    
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.standardHandling(article);
    }
    protected abstract void standardHandling(PersistentItem item) throws PersistenceException;
}
