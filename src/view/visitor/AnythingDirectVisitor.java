
package view.visitor;

import view.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleAccount(AccountView account) throws ModelException;
    
    public abstract void handleSendOrder(SendOrderView sendOrder) throws ModelException;
    
    public abstract void handleServer(ServerView server) throws ModelException;
    
    public abstract void handleCustomer(CustomerView customer) throws ModelException;
    
    public abstract void handleShopkeeper(ShopkeeperView shopkeeper) throws ModelException;
    
    public abstract void handleErrorDisplay(ErrorDisplayView errorDisplay) throws ModelException;
    
    public abstract void handleOfferedFSale(OfferedFSaleView offeredFSale) throws ModelException;
    
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
    public abstract void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException;
    
    public abstract void handleItem(ItemView item) throws ModelException;
    
    public void handleProductGroup(ProductGroupView productGroup) throws ModelException{
        this.handleItem(productGroup);
    }
    public void handleArticle(ArticleView article) throws ModelException{
        this.handleItem(article);
    }
    public abstract void handleRemovedFSale(RemovedFSaleView removedFSale) throws ModelException;
    
    public abstract void handleManufacturer(ManufacturerView manufacturer) throws ModelException;
    
    public abstract void handleNewlyAdded(NewlyAddedView newlyAdded) throws ModelException;
    
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
    public abstract void handleCart(CartView cart) throws ModelException;
    
    public abstract void handleQuantifiedArticles(QuantifiedArticlesView quantifiedArticles) throws ModelException;
    
    
}