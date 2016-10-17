
package model.visitor;

import persistence.*;

public interface ServiceExceptionVisitor<E extends model.UserException> {
    
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException, E;
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException, E;
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException, E;
    
}
