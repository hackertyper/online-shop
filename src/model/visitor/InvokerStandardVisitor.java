
package model.visitor;

import persistence.*;

public abstract class InvokerStandardVisitor implements InvokerVisitor {
    
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException{
        this.standardHandling(registerService);
    }
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException{
        this.standardHandling(customerService);
    }
    public void handleServer(PersistentServer server) throws PersistenceException{
        this.standardHandling(server);
    }
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException{
        this.standardHandling(shopkeeperService);
    }
    protected abstract void standardHandling(Invoker invoker) throws PersistenceException;
}
