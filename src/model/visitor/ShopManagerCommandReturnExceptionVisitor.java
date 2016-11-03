
package model.visitor;

import persistence.*;

public interface ShopManagerCommandReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    
}
