
package model.visitor;

import persistence.*;

public interface CustomerOrderStateReturnVisitor<R> {
    
    public R handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException;
    public R handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException;
    
}
