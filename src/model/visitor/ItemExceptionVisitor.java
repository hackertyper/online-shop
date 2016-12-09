
package model.visitor;

import persistence.*;

public interface ItemExceptionVisitor<E extends model.UserException> extends ProductGroupExceptionVisitor<E>{
    
    public void handleArticle(PersistentArticle article) throws PersistenceException, E;
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException, E;
    
}
