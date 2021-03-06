
package model.visitor;

import persistence.*;

public abstract class ItemStandardVisitor implements ItemVisitor {
    
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException{
        this.standardHandling(basicProductGroup);
    }
    protected abstract void standardHandling(PersistentItem item) throws PersistenceException;
}
