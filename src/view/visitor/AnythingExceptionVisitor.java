
package view.visitor;

import view.*;

public interface AnythingExceptionVisitor<E extends view.UserException> extends CartStateExceptionVisitor<E>,CustomerDeliveryExceptionVisitor<E>,DeliveryExceptionVisitor<E>,ItemExceptionVisitor<E>,ServiceExceptionVisitor<E>{
    
    public void handleAccount(AccountView account) throws ModelException, E;
    public void handleAccountManager(AccountManagerView accountManager) throws ModelException, E;
    public void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException, E;
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException, E;
    public void handleCart(CartView cart) throws ModelException, E;
    public void handleCartManager(CartManagerView cartManager) throws ModelException, E;
    public void handleCustomerManager(CustomerManagerView customerManager) throws ModelException, E;
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException, E;
    public void handleManufacturer(ManufacturerView manufacturer) throws ModelException, E;
    public void handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException, E;
    public void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException, E;
    public void handleOrderManager(OrderManagerView orderManager) throws ModelException, E;
    public void handlePreOrder(PreOrderView preOrder) throws ModelException, E;
    public void handleQuantifiedArticles(QuantifiedArticlesView quantifiedArticles) throws ModelException, E;
    public void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException, E;
    public void handleSendOrder(SendOrderView sendOrder) throws ModelException, E;
    public void handleServer(ServerView server) throws ModelException, E;
    public void handleShopManager(ShopManagerView shopManager) throws ModelException, E;
    public void handleShopkeeper(ShopkeeperView shopkeeper) throws ModelException, E;
    
}
