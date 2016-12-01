
package view.visitor;

import view.*;

public interface AnythingReturnVisitor<R> extends CartStateReturnVisitor<R> ,CustomerDeliveryReturnVisitor<R> ,DeliveryReturnVisitor<R> ,ItemReturnVisitor<R> ,ServiceReturnVisitor<R> {
    
    public R handleAccount(AccountView account) throws ModelException;
    public R handleAccountManager(AccountManagerView accountManager) throws ModelException;
    public R handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException;
    public R handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException;
    public R handleCart(CartView cart) throws ModelException;
    public R handleCartManager(CartManagerView cartManager) throws ModelException;
    public R handleCustomerManager(CustomerManagerView customerManager) throws ModelException;
    public R handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    public R handleManufacturer(ManufacturerView manufacturer) throws ModelException;
    public R handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException;
    public R handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException;
    public R handleOrderManager(OrderManagerView orderManager) throws ModelException;
    public R handlePreOrder(PreOrderView preOrder) throws ModelException;
    public R handleQuantifiedArticles(QuantifiedArticlesView quantifiedArticles) throws ModelException;
    public R handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException;
    public R handleSendOrder(SendOrderView sendOrder) throws ModelException;
    public R handleServer(ServerView server) throws ModelException;
    public R handleShopManager(ShopManagerView shopManager) throws ModelException;
    public R handleShopkeeper(ShopkeeperView shopkeeper) throws ModelException;
    
}
