
package view.visitor;

import view.*;

public interface CustomerServiceVisitor {
    
    public void handleAccountService(AccountServiceView accountService) throws ModelException;
    public void handleCartService(CartServiceView cartService) throws ModelException;
    public void handleOrderService(OrderServiceView orderService) throws ModelException;
    public void handleShopService(ShopServiceView shopService) throws ModelException;
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException;
    
}
