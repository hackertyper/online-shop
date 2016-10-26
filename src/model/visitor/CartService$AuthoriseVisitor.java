
package model.visitor;

import persistence.*;

public abstract class CartService$AuthoriseVisitor extends AnythingStandardVisitor{
    
    public abstract void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    public abstract void handleAccount(PersistentAccount account) throws PersistenceException;
    public abstract void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public abstract void handleArticle(PersistentArticle article) throws PersistenceException;
    public abstract void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    public abstract void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    public abstract void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException;
    public abstract void handleShopService(PersistentShopService shopService) throws PersistenceException;
    public abstract void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    public abstract void handleCartService(PersistentCartService cartService) throws PersistenceException;
    public abstract void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    public abstract void handleShopManager(PersistentShopManager shopManager) throws PersistenceException;
    public abstract void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException;
    public abstract void handleAccountService(PersistentAccountService accountService) throws PersistenceException;
    public abstract void handleCartManager(PersistentCartManager cartManager) throws PersistenceException;
    public abstract void handleCart(PersistentCart cart) throws PersistenceException;
    public abstract void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    
}
