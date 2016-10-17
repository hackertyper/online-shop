
package model.visitor;

import persistence.*;

public interface DeliveryVisitor {
    
    public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException;
    public void handleRetoure(PersistentRetoure retoure) throws PersistenceException;
    public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException;
    
}
