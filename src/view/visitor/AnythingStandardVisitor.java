
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
    public void handleShopkeeper(ShopkeeperView shopkeeper) throws ModelException{
        this.standardHandling(shopkeeper);
    }
    public void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException{
        this.standardHandling(errorDisplay);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.standardHandling(article);
    }
    public void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException{
        this.standardHandling(offeredFSale);
    }
    public void handleCustomerOrder(CustomerOrderView customerOrder) throws ModelException{
        this.standardHandling(customerOrder);
    }
    public void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException{
        this.standardHandling(arrivedOrder);
    }
    public void handleRegisterService(RegisterServiceView registerService) throws ModelException{
        this.standardHandling(registerService);
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
    public void handleCart(CartView cart) throws ModelException{
        this.standardHandling(cart);
    }
    public void handleQuantifiedArticles(QuantifiedArticlesView quantifiedArticles) throws ModelException{
        this.standardHandling(quantifiedArticles);
    }
    public void handleSendOrder(SendOrderView sendOrder) throws ModelException{
        this.standardHandling(sendOrder);
    }
    public void handleShopKeeperOrder(ShopKeeperOrderView shopKeeperOrder) throws ModelException{
        this.standardHandling(shopKeeperOrder);
    }
    public void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException{
        this.standardHandling(removedFSale);
    }
    public void handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException{
        this.standardHandling(shopkeeperService);
    }
    public void handleRetoure(RetoureView retoure) throws ModelException{
        this.standardHandling(retoure);
    }
    public void handleCartService(CartServiceView cartService) throws ModelException{
        this.standardHandling(cartService);
    }
    public void handleAccountManager(AccountManagerView accountManager) throws ModelException{
        this.standardHandling(accountManager);
    }
    public void handleAccountService(AccountServiceView accountService) throws ModelException{
        this.standardHandling(accountService);
    }
    public void handleCartManager(CartManagerView cartManager) throws ModelException{
        this.standardHandling(cartManager);
    }
    protected abstract void standardHandling(Anything anything) throws ModelException;
}
