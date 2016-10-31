
package model.visitor;

import persistence.*;

public interface ObsInterfaceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException, E;
    public R handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException, E;
    
}
