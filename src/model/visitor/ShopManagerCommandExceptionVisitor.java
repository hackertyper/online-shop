
package model.visitor;

import persistence.*;

public interface ShopManagerCommandExceptionVisitor<E extends model.UserException> {
    
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    
}
