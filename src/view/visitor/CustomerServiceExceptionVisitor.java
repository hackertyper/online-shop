
package view.visitor;

import view.*;

public interface CustomerServiceExceptionVisitor<E extends view.UserException> {
    
    public void handleAccountService(AccountServiceView accountService) throws ModelException, E;
    public void handleCartService(CartServiceView cartService) throws ModelException, E;
    public void handleOrderService(OrderServiceView orderService) throws ModelException, E;
    public void handleShopService(ShopServiceView shopService) throws ModelException, E;
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException, E;
    
}
