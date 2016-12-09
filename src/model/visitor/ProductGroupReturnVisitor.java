
package model.visitor;

import persistence.*;

public interface ProductGroupReturnVisitor<R> {
    
    public R handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException;
    public R handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    
}
