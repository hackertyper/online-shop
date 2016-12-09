
package model.visitor;

import persistence.*;

public interface ProductGroupReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException, E;
    public R handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException, E;
    
}
