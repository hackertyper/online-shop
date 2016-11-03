
package view.visitor;

import view.*;

public abstract class CustomerServiceStandardVisitor implements CustomerServiceVisitor {
    
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.standardHandling(customerService);
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
    protected abstract void standardHandling(CustomerServiceView customerService) throws ModelException;
}
