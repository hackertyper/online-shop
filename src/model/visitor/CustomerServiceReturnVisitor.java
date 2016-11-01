
package model.visitor;

import persistence.*;

public interface CustomerServiceReturnVisitor<R> {
    
    public R handleAccountService(PersistentAccountService accountService) throws PersistenceException;
    public R handleCartService(PersistentCartService cartService) throws PersistenceException;
    public R handleOrderService(PersistentOrderService orderService) throws PersistenceException;
    public R handleShopService(PersistentShopService shopService) throws PersistenceException;
    public R handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    
}
