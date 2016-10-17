
package model.visitor;

import persistence.*;

public interface ServiceVisitor {
    
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException;
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException;
    
}
