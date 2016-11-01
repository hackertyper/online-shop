
package view.visitor;

import view.*;

public interface CustomerServiceReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleAccountService(AccountServiceView accountService) throws ModelException, E;
    public R handleCartService(CartServiceView cartService) throws ModelException, E;
    public R handleOrderService(OrderServiceView orderService) throws ModelException, E;
    public R handleShopService(ShopServiceView shopService) throws ModelException, E;
    public R handleCustomerService(CustomerServiceView customerService) throws ModelException, E;
    
}
