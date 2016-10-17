
package model.visitor;

import persistence.*;

public interface ServiceReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCustomerService(PersistentCustomerService customerService) throws PersistenceException, E;
    public R handleRegisterService(PersistentRegisterService registerService) throws PersistenceException, E;
    public R handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException, E;
    
}
