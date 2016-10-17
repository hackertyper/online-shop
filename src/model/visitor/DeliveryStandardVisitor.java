
package model.visitor;

import persistence.*;

public abstract class DeliveryStandardVisitor implements DeliveryVisitor {
    
    public void handleRetoure(PersistentRetoure retoure) throws PersistenceException{
        this.standardHandling(retoure);
    }
    public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException{
        this.standardHandling(customerOrder);
    }
    public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException{
        this.standardHandling(shopKeeperOrder);
    }
    protected abstract void standardHandling(PersistentDelivery delivery) throws PersistenceException;
}
