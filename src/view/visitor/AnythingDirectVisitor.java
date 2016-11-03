
package view.visitor;

import view.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleAccount(AccountView account) throws ModelException;
    
    public abstract void handleServer(ServerView server) throws ModelException;
    
    public abstract void handleShopkeeper(ShopkeeperView shopkeeper) throws ModelException;
    
    public abstract void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    
    public abstract void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException;
    
    public abstract void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException;
    
    public abstract void handleCartState(CartStateView cartState) throws ModelException;
    
    public void handleOpenCart(OpenCartView openCart) throws ModelException{
        this.handleCartState(openCart);
    }
    public void handleCheckedOut(CheckedOutView checkedOut) throws ModelException{
        this.handleCartState(checkedOut);
    }
    public abstract void handleItem(ItemView item) throws ModelException;
    
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.handleItem(productGroup);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.handleItem(article);
    }
    public abstract void handleCustomerManager(CustomerManagerView customerManager) throws ModelException;
    
    public abstract void handleManufacturer(ManufacturerView manufacturer) throws ModelException;
    
    public abstract void handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException;
    
    public abstract void handleShopManager(ShopManagerView shopManager) throws ModelException;
    
    public abstract void handleCart(CartView cart) throws ModelException;
    
    public abstract void handleQuantifiedArticles(QuantifiedArticlesView quantifiedArticles) throws ModelException;
    
    public abstract void handleSendOrder(SendOrderView sendOrder) throws ModelException;
    
    public abstract void handleService(ServiceView service) throws ModelException;
    
    public void handleRegisterService(RegisterServiceView registerService) throws ModelException{
        this.handleService(registerService);
    }
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.handleService(customerService);
    }
    public void handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException{
        this.handleService(shopkeeperService);
    }
    public void handleShopService(ShopServiceView shopService) throws ModelException{
        this.handleService(shopService);
    }
    public void handleCartService(CartServiceView cartService) throws ModelException{
        this.handleService(cartService);
    }
    public void handleOrderService(OrderServiceView orderService) throws ModelException{
        this.handleService(orderService);
    }
    public void handleAccountService(AccountServiceView accountService) throws ModelException{
        this.handleService(accountService);
    }
    public abstract void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException;
    
    public abstract void handleAccountManager(AccountManagerView accountManager) throws ModelException;
    
    public abstract void handleDelivery(DeliveryView delivery) throws ModelException;
    
    public void handleRetoure(RetoureView retoure) throws ModelException{
        this.handleDelivery(retoure);
    }
    public void handleCustomerOrder(CustomerOrderView customerOrder) throws ModelException{
        this.handleDelivery(customerOrder);
    }
    public void handleShopKeeperOrder(ShopKeeperOrderView shopKeeperOrder) throws ModelException{
        this.handleDelivery(shopKeeperOrder);
    }
    public abstract void handleOrderManager(OrderManagerView orderManager) throws ModelException;
    
    public abstract void handleCartManager(CartManagerView cartManager) throws ModelException;
    
    
}
