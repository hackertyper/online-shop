
package model.visitor;

import persistence.*;

public interface CustomerServiceExceptionVisitor<E extends model.UserException> {
    
    public void handleAccountService(PersistentAccountService accountService) throws PersistenceException, E;
    public void handleCartService(PersistentCartService cartService) throws PersistenceException, E;
    public void handleShopService(PersistentShopService shopService) throws PersistenceException, E;
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException, E;
    
}
