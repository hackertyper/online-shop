
package model.visitor;

import persistence.*;

public interface ObsInterfaceVisitor {
    
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException;
    public void handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException;
    
}
