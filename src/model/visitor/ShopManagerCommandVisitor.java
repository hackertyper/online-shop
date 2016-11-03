
package model.visitor;

import persistence.*;

public interface ShopManagerCommandVisitor {
    
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    
}
