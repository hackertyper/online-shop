
package view.visitor;

import view.*;

public abstract class RemoteStandardVisitor implements RemoteVisitor {
    
    public void handleRegisterService(RegisterServiceView registerService) throws ModelException{
        this.standardHandling(registerService);
    }
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.standardHandling(customerService);
    }
    public void handleServer(ServerView server) throws ModelException{
        this.standardHandling(server);
    }
    public void handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException{
        this.standardHandling(shopkeeperService);
    }
    public void handleShopService(ShopServiceView shopService) throws ModelException{
        this.standardHandling(shopService);
    }
    public void handleCartService(CartServiceView cartService) throws ModelException{
        this.standardHandling(cartService);
    }
    public void handleOrderService(OrderServiceView orderService) throws ModelException{
        this.standardHandling(orderService);
    }
    public void handleAccountService(AccountServiceView accountService) throws ModelException{
        this.standardHandling(accountService);
    }
    protected abstract void standardHandling(Remote remote) throws ModelException;
}
