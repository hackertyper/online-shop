
package model.visitor;

import persistence.*;

public interface DeliveryReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException, E;
    public R handleRetoure(PersistentRetoure retoure) throws PersistenceException, E;
    public R handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException, E;
    
}
