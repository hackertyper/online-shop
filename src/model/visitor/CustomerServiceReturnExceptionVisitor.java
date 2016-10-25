
package model.visitor;

import persistence.*;

public interface CustomerServiceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAccountService(PersistentAccountService accountService) throws PersistenceException, E;
    public R handleCartService(PersistentCartService cartService) throws PersistenceException, E;
    public R handleShopService(PersistentShopService shopService) throws PersistenceException, E;
    public R handleCustomerService(PersistentCustomerService customerService) throws PersistenceException, E;
    
}
