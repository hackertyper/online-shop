
package model.visitor;

import persistence.*;

public interface ServiceVisitor extends CustomerServiceVisitor{
    
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException;
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException;
    
}
