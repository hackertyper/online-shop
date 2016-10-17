
package model.visitor;

import persistence.*;

public interface DeliveryReturnVisitor<R> {
    
    public R handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException;
    public R handleRetoure(PersistentRetoure retoure) throws PersistenceException;
    public R handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException;
    
}
