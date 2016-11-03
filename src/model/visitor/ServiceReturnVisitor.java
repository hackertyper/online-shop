
package model.visitor;

import persistence.*;

public interface ServiceReturnVisitor<R> extends CustomerServiceReturnVisitor<R> {
    
    public R handleCustomerService(PersistentCustomerService customerService) throws PersistenceException;
    public R handleRegisterService(PersistentRegisterService registerService) throws PersistenceException;
    public R handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException;
    
}
