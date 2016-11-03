
package model.visitor;

import persistence.*;

public abstract class ObsInterfaceStandardVisitor implements ObsInterfaceVisitor {
    
    public void handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException{
        this.standardHandling(shopManagerItemRange);
    }
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException{
        this.standardHandling(cartManagerArticleList);
    }
    protected abstract void standardHandling(ObsInterface obsInterface) throws PersistenceException;
}
