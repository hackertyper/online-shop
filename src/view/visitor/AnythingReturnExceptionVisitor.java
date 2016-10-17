
package view.visitor;

import view.*;

public interface AnythingReturnExceptionVisitor<R, E extends view.UserException> extends DeliveryReturnExceptionVisitor<R, E> ,ItemReturnExceptionVisitor<R, E> ,ServiceReturnExceptionVisitor<R, E> {
    
    public R handleAccount(AccountView account) throws ModelException, E;
    public R handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException, E;
    public R handleCart(CartView cart) throws ModelException, E;
    public R handleCustomer(CustomerView customer) throws ModelException, E;
    public R handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException, E;
    public R handleManufacturer(ManufacturerView manufacturer) throws ModelException, E;
    public R handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException, E;
    public R handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException, E;
    public R handleQuantifiedArticles(QuantifiedArticlesView quantifiedArticles) throws ModelException, E;
    public R handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException, E;
    public R handleSendOrder(SendOrderView sendOrder) throws ModelException, E;
    public R handleServer(ServerView server) throws ModelException, E;
    public R handleShopkeeper(ShopkeeperView shopkeeper) throws ModelException, E;
    
}
