
package model.visitor;

import persistence.*;

public abstract class ItemDirectVisitor implements ItemVisitor {
    
    public abstract void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    
    public void handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException{
        this.handleProductGroup(basicProductGroup);
    }
    public abstract void handleArticle(PersistentArticle article) throws PersistenceException;
    
    
}
