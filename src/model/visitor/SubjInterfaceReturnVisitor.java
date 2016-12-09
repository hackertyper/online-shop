
package model.visitor;

import persistence.*;

public interface SubjInterfaceReturnVisitor<R> extends ArticleStateReturnVisitor<R> ,CartStateReturnVisitor<R> ,CustomerDeliveryReturnVisitor<R> ,CustomerOrderStateReturnVisitor<R> ,DeliveryReturnVisitor<R> ,ItemReturnVisitor<R> ,ServiceReturnVisitor<R> {
    
    public R handleAccount(PersistentAccount account) throws PersistenceException;
    public R handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException;
    public R handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException;
    public R handleCart(PersistentCart cart) throws PersistenceException;
    public R handleCartManager(PersistentCartManager cartManager) throws PersistenceException;
    public R handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException;
    public R handleCustomerPresets(PersistentCustomerPresets customerPresets) throws PersistenceException;
    public R handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public R handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    public R handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException;
    public R handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException;
    public R handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    public R handleServer(PersistentServer server) throws PersistenceException;
    public R handleShopManager(PersistentShopManager shopManager) throws PersistenceException;
    public R handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    public R handleSubj(PersistentSubj subj) throws PersistenceException;
    
}
