
package model.visitor;

import persistence.*;

public abstract class ShopManagerCommandStandardVisitor implements ShopManagerCommandVisitor {
    
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException{
        this.standardHandling(findArticleCommand);
    }
    protected abstract void standardHandling(ShopManagerCommand shopManagerCommand) throws PersistenceException;
}
