
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnVisitor<R> {
    
    public R handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException;
    public R handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException;
    
}
