
package view.visitor;

import view.*;

public interface AnythingExceptionVisitor<E extends view.UserException> extends DeliveryExceptionVisitor<E>,ItemExceptionVisitor<E>,ServiceExceptionVisitor<E>{
    
    public void handleAccount(AccountView account) throws ModelException, E;
    public void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException, E;
    public void handleCart(CartView cart) throws ModelException, E;
    public void handleCustomer(CustomerView customer) throws ModelException, E;
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException, E;
    public void handleManufacturer(ManufacturerView manufacturer) throws ModelException, E;
    public void handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException, E;
    public void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException, E;
    public void handleQuantifiedArticles(QuantifiedArticlesView quantifiedArticles) throws ModelException, E;
    public void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException, E;
    public void handleSendOrder(SendOrderView sendOrder) throws ModelException, E;
    public void handleServer(ServerView server) throws ModelException, E;
    public void handleShopkeeper(ShopkeeperView shopkeeper) throws ModelException, E;
    
}