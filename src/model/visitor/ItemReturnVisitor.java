
package model.visitor;

import persistence.*;

public interface ItemReturnVisitor<R> {
    
    public R handleArticle(PersistentArticle article) throws PersistenceException;
    public R handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    
}
