
package model.visitor;

import persistence.*;

public interface ObsInterfaceExceptionVisitor<E extends model.UserException> {
    
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException, E;
    public void handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException, E;
    
}
