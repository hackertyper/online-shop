
package model.visitor;

import persistence.*;

public interface DeliveryExceptionVisitor<E extends model.UserException> {
    
    public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException, E;
    public void handleRetoure(PersistentRetoure retoure) throws PersistenceException, E;
    public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException, E;
    
}
