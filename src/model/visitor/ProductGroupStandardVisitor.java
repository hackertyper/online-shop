
package model.visitor;

import persistence.*;

public abstract class ProductGroupStandardVisitor implements ProductGroupVisitor {
    
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException{
        this.standardHandling(basicProductGroup);
    }
    protected abstract void standardHandling(PersistentProductGroup productGroup) throws PersistenceException;
}
