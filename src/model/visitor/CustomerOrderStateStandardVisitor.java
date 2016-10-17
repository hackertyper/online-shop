
package model.visitor;

import persistence.*;

public abstract class CustomerOrderStateStandardVisitor implements CustomerOrderStateVisitor {
    
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException{
        this.standardHandling(sendOrder);
    }
    public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException{
        this.standardHandling(arrivedOrder);
    }
    protected abstract void standardHandling(CustomerOrderState customerOrderState) throws PersistenceException;
}
