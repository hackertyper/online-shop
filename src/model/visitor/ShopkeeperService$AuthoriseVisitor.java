
package model.visitor;

import persistence.*;

public abstract class ShopkeeperService$AuthoriseVisitor extends AnythingStandardVisitor{
    
    public abstract void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    public abstract void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public abstract void handleArticle(PersistentArticle article) throws PersistenceException;
    public abstract void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    public abstract void handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException;
    public abstract void handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException;
    public abstract void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    public abstract void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException;
    public abstract void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    public abstract void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    public abstract void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException;
    
}
