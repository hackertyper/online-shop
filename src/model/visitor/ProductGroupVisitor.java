
package model.visitor;

import persistence.*;

public interface ProductGroupVisitor {
    
    public void handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException;
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    
}
