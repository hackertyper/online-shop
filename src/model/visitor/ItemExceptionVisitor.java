
package model.visitor;

import persistence.*;

public interface ItemExceptionVisitor<E extends model.UserException> {
    
    public void handleArticle(PersistentArticle article) throws PersistenceException, E;
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException, E;
    
}
