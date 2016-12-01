
package model.visitor;

import persistence.*;

public interface CustomerOrderStateExceptionVisitor<E extends model.UserException> {
    
    public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException, E;
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException, E;
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException, E;
    
}
