
package model.visitor;

import persistence.*;

public abstract class ServiceStandardVisitor implements ServiceVisitor {
    
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException{
        this.standardHandling(registerService);
    }
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException{
        this.standardHandling(customerService);
    }
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException{
        this.standardHandling(shopkeeperService);
    }
    protected abstract void standardHandling(PersistentService service) throws PersistenceException;
}
