
package model.visitor;

import persistence.*;

public interface ShopManagerCommandReturnVisitor<R> {
    
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    
}
