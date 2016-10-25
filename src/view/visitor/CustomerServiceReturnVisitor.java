
package view.visitor;

import view.*;

public interface CustomerServiceReturnVisitor<R> {
    
    public R handleAccountService(AccountServiceView accountService) throws ModelException;
    public R handleCartService(CartServiceView cartService) throws ModelException;
    public R handleShopService(ShopServiceView shopService) throws ModelException;
    public R handleCustomerService(CustomerServiceView customerService) throws ModelException;
    
}
