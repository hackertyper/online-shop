
package model.visitor;

import persistence.*;

public abstract class ServiceDirectVisitor implements ServiceVisitor {
    
    public abstract void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException;
    
    public abstract void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    
    public void handleShopService(PersistentShopService shopService) throws PersistenceException{
        this.handleCustomerService(shopService);
    }
    public void handleCartService(PersistentCartService cartService) throws PersistenceException{
        this.handleCustomerService(cartService);
    }
    public void handleAccountService(PersistentAccountService accountService) throws PersistenceException{
        this.handleCustomerService(accountService);
    }
    public abstract void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException;
    
    
}
