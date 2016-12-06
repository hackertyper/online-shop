
package model.visitor;

import persistence.*;

public interface CustomerOrderStateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException, E;
    public R handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException, E;
    
}
