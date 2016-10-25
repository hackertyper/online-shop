
package view.visitor;

import view.*;

public abstract class ServiceDirectVisitor implements ServiceVisitor {
    
    public abstract void handleRegisterService(RegisterServiceView registerService) throws ModelException;
    
    public abstract void handleCustomerService(CustomerServiceView customerService) throws ModelException;
    
    public void handleShopService(ShopServiceView shopService) throws ModelException{
        this.handleCustomerService(shopService);
    }
    public void handleCartService(CartServiceView cartService) throws ModelException{
        this.handleCustomerService(cartService);
    }
    public void handleAccountService(AccountServiceView accountService) throws ModelException{
        this.handleCustomerService(accountService);
    }
    public abstract void handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException;
    
    
}
