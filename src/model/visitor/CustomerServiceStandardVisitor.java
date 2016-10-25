
package model.visitor;

import persistence.*;

public abstract class CustomerServiceStandardVisitor implements CustomerServiceVisitor {
    
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException{
        this.standardHandling(customerService);
    }
    public void handleShopService(PersistentShopService shopService) throws PersistenceException{
        this.standardHandling(shopService);
    }
    public void handleCartService(PersistentCartService cartService) throws PersistenceException{
        this.standardHandling(cartService);
    }
    public void handleAccountService(PersistentAccountService accountService) throws PersistenceException{
        this.standardHandling(accountService);
    }
    protected abstract void standardHandling(PersistentCustomerService customerService) throws PersistenceException;
}
