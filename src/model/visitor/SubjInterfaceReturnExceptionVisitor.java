
package model.visitor;

import persistence.*;

public interface SubjInterfaceReturnExceptionVisitor<R, E extends model.UserException> extends ArticleStateReturnExceptionVisitor<R, E> ,CartStateReturnExceptionVisitor<R, E> ,CustomerDeliveryReturnExceptionVisitor<R, E> ,CustomerOrderStateReturnExceptionVisitor<R, E> ,ItemReturnExceptionVisitor<R, E> ,ServiceReturnExceptionVisitor<R, E> {
    
    public R handleAccount(PersistentAccount account) throws PersistenceException, E;
    public R handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException, E;
    public R handleCart(PersistentCart cart) throws PersistenceException, E;
    public R handleCartManager(PersistentCartManager cartManager) throws PersistenceException, E;
    public R handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException, E;
    public R handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException, E;
    public R handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException, E;
    public R handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException, E;
    public R handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException, E;
    public R handleServer(PersistentServer server) throws PersistenceException, E;
    public R handleShopManager(PersistentShopManager shopManager) throws PersistenceException, E;
    public R handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException, E;
    public R handleSubj(PersistentSubj subj) throws PersistenceException, E;
    
}
