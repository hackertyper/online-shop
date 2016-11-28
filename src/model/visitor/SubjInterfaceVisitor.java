
package model.visitor;

import persistence.*;

public interface SubjInterfaceVisitor extends ArticleStateVisitor,CartStateVisitor,CustomerDeliveryVisitor,CustomerOrderStateVisitor,ItemVisitor,ServiceVisitor{
    
    public void handleAccount(PersistentAccount account) throws PersistenceException;
    public void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException;
    public void handleCart(PersistentCart cart) throws PersistenceException;
    public void handleCartManager(PersistentCartManager cartManager) throws PersistenceException;
    public void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException;
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    public void handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException;
    public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    public void handleServer(PersistentServer server) throws PersistenceException;
    public void handleShopManager(PersistentShopManager shopManager) throws PersistenceException;
    public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    public void handleSubj(PersistentSubj subj) throws PersistenceException;
    
}
