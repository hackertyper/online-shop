
package model.visitor;

import persistence.*;

public interface ProductGroupExceptionVisitor<E extends model.UserException> {
    
    public void handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException, E;
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException, E;
    
}
