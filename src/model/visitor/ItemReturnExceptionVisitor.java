
package model.visitor;

import persistence.*;

public interface ItemReturnExceptionVisitor<R, E extends model.UserException> extends ProductGroupReturnExceptionVisitor<R, E> {
    
    public R handleArticle(PersistentArticle article) throws PersistenceException, E;
    public R handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException, E;
    
}
