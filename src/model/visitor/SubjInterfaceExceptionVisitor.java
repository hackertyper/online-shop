
package model.visitor;

import persistence.*;

public interface SubjInterfaceExceptionVisitor<E extends model.UserException> extends ArticleStateExceptionVisitor<E>,CartStateExceptionVisitor<E>,CustomerDeliveryExceptionVisitor<E>,CustomerOrderStateExceptionVisitor<E>,DeliveryExceptionVisitor<E>,ItemExceptionVisitor<E>,ServiceExceptionVisitor<E>{
    
    public void handleAccount(PersistentAccount account) throws PersistenceException, E;
    public void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException, E;
    public void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException, E;
    public void handleCart(PersistentCart cart) throws PersistenceException, E;
    public void handleCartManager(PersistentCartManager cartManager) throws PersistenceException, E;
    public void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException, E;
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException, E;
    public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException, E;
    public void handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException, E;
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException, E;
    public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException, E;
    public void handleServer(PersistentServer server) throws PersistenceException, E;
    public void handleShopManager(PersistentShopManager shopManager) throws PersistenceException, E;
    public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException, E;
    public void handleSubj(PersistentSubj subj) throws PersistenceException, E;
    
}
