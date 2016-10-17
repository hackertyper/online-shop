
package model.visitor;

import persistence.*;

public interface ItemVisitor {
    
    public void handleArticle(PersistentArticle article) throws PersistenceException;
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    
}
