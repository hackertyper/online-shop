
package view.visitor;

import view.*;

public abstract class RemoteDirectVisitor implements RemoteVisitor {
    
    public abstract void handleServer(ServerView server) throws ModelException;
    
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
    public void handleAccountService(AccountServiceView accountService) throws ModelException{
        this.handleService(accountService);
    }
    
}
