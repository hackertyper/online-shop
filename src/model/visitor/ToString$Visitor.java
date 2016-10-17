
package model.visitor;

import persistence.*;

public abstract class ToString$Visitor extends AnythingStandardVisitor{
    
    public abstract void handleAccount(PersistentAccount account) throws PersistenceException;
    public abstract void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException;
    public abstract void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    public abstract void handleServer(PersistentServer server) throws PersistenceException;
    public abstract void handleCustomer(PersistentCustomer customer) throws PersistenceException;
    public abstract void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    public abstract void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    public abstract void handleArticle(PersistentArticle article) throws PersistenceException;
    public abstract void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException;
    public abstract void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException;
    public abstract void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException;
    public abstract void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    public abstract void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    public abstract void handleCart(PersistentCart cart) throws PersistenceException;
    public abstract void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    public abstract void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException;
    public abstract void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException;
    public abstract void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    public abstract void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException;
    public abstract void handleRetoure(PersistentRetoure retoure) throws PersistenceException;
    
}
