
package view.visitor;

import view.*;

public abstract class AnythingStandardVisitor implements AnythingVisitor {
    
    public void handleAccount(AccountView account) throws ModelException{
        this.standardHandling(account);
    }
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.standardHandling(productGroup);
    }
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.standardHandling(customerService);
    }
    public void handleServer(ServerView server) throws ModelException{
        this.standardHandling(server);
    }
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException{
        this.standardHandling(errorDisplay);
    }
    public void handleCustomerOrder(CustomerOrderView customerOrder) throws ModelException{
        this.standardHandling(customerOrder);
    }
    public void handleOverNightDelivery(OverNightDeliveryView overNightDelivery) throws ModelException{
        this.standardHandling(overNightDelivery);
    }
    public void handleStandardDelivery(StandardDeliveryView standardDelivery) throws ModelException{
        this.standardHandling(standardDelivery);
    }
    public void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException{
        this.standardHandling(arrivedOrder);
    }
    public void handleOpenCart(OpenCartView openCart) throws ModelException{
        this.standardHandling(openCart);
    }
    public void handleCustomerManager(CustomerManagerView customerManager) throws ModelException{
        this.standardHandling(customerManager);
    }
    public void handleShopService(ShopServiceView shopService) throws ModelException{
        this.standardHandling(shopService);
    }
    public void handleManufacturer(ManufacturerView manufacturer) throws ModelException{
        this.standardHandling(manufacturer);
    }
    public void handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException{
        this.standardHandling(newlyAdded);
    }
    public void handleShopManager(ShopManagerView shopManager) throws ModelException{
        this.standardHandling(shopManager);
    }
    public void handleSendOrder(SendOrderView sendOrder) throws ModelException{
        this.standardHandling(sendOrder);
    }
    public void handleShopKeeperOrder(ShopKeeperOrderView shopKeeperOrder) throws ModelException{
        this.standardHandling(shopKeeperOrder);
    }
    public void handleTestDelivery(TestDeliveryView testDelivery) throws ModelException{
        this.standardHandling(testDelivery);
    }
    public void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException{
        this.standardHandling(removedFSale);
    }
    public void handleRetoure(RetoureView retoure) throws ModelException{
        this.standardHandling(retoure);
    }
    public void handleAccountManager(AccountManagerView accountManager) throws ModelException{
        this.standardHandling(accountManager);
    }
    public void handleOrderService(OrderServiceView orderService) throws ModelException{
        this.standardHandling(orderService);
    }
    public void handleAccountService(AccountServiceView accountService) throws ModelException{
        this.standardHandling(accountService);
    }
    public void handleOrderManager(OrderManagerView orderManager) throws ModelException{
        this.standardHandling(orderManager);
    }
    public void handleArticleWrapper(ArticleWrapperView articleWrapper) throws ModelException{
        this.standardHandling(articleWrapper);
    }
    public void handleShopkeeper(ShopkeeperView shopkeeper) throws ModelException{
        this.standardHandling(shopkeeper);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.standardHandling(article);
    }
    public void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException{
        this.standardHandling(offeredFSale);
    }
    public void handlePreOrder(PreOrderView preOrder) throws ModelException{
        this.standardHandling(preOrder);
    }
    public void handleRegisterService(RegisterServiceView registerService) throws ModelException{
        this.standardHandling(registerService);
    }
    public void handleCart(CartView cart) throws ModelException{
        this.standardHandling(cart);
    }
    public void handleQuantifiedArticles(QuantifiedArticlesView quantifiedArticles) throws ModelException{
        this.standardHandling(quantifiedArticles);
    }
    public void handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException{
        this.standardHandling(shopkeeperService);
    }
    public void handleCartService(CartServiceView cartService) throws ModelException{
        this.standardHandling(cartService);
    }
    public void handleCheckedOut(CheckedOutView checkedOut) throws ModelException{
        this.standardHandling(checkedOut);
    }
    public void handleCartManager(CartManagerView cartManager) throws ModelException{
        this.standardHandling(cartManager);
    }
    protected abstract void standardHandling(Anything anything) throws ModelException;
}
