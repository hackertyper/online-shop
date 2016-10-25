
package model.visitor;

import persistence.*;

public abstract class InvokerDirectVisitor implements InvokerVisitor {
    
    public abstract void handleServer(PersistentServer server) throws PersistenceException;
    
    public abstract void handleService(PersistentService service) throws PersistenceException;
    
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException{
        this.handleService(registerService);
    }
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException{
        this.handleService(customerService);
    }
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException{
        this.handleService(shopkeeperService);
    }
    public void handleShopService(PersistentShopService shopService) throws PersistenceException{
        this.handleService(shopService);
    }
    public void handleCartService(PersistentCartService cartService) throws PersistenceException{
        this.handleService(cartService);
    }
    public void handleAccountService(PersistentAccountService accountService) throws PersistenceException{
        this.handleService(accountService);
    }
    
}
