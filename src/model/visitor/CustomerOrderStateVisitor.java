
package model.visitor;

import persistence.*;

public interface CustomerOrderStateVisitor {
    
    public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException;
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException;
    
}
