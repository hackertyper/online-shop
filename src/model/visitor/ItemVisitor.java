
package model.visitor;

import persistence.*;

public interface ItemVisitor extends ProductGroupVisitor{
    
    public void handleArticle(PersistentArticle article) throws PersistenceException;
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    
}
