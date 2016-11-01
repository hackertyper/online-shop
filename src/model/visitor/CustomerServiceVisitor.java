
package model.visitor;

import persistence.*;

public interface CustomerServiceVisitor {
    
    public void handleAccountService(PersistentAccountService accountService) throws PersistenceException;
    public void handleCartService(PersistentCartService cartService) throws PersistenceException;
    public void handleOrderService(PersistentOrderService orderService) throws PersistenceException;
    public void handleShopService(PersistentShopService shopService) throws PersistenceException;
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    
}
