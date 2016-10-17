
package view.visitor;

import view.*;

public interface AnythingVisitor extends DeliveryVisitor,ItemVisitor,ServiceVisitor{
    
    public void handleAccount(AccountView account) throws ModelException;
    public void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException;
    public void handleCart(CartView cart) throws ModelException;
    public void handleCustomer(CustomerView customer) throws ModelException;
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    public void handleManufacturer(ManufacturerView manufacturer) throws ModelException;
    public void handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException;
    public void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException;
    public void handleQuantifiedArticles(QuantifiedArticlesView quantifiedArticles) throws ModelException;
    public void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException;
    public void handleSendOrder(SendOrderView sendOrder) throws ModelException;
    public void handleServer(ServerView server) throws ModelException;
    public void handleShopkeeper(ShopkeeperView shopkeeper) throws ModelException;
    
}
