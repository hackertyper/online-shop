
package view.visitor;

import view.*;

public interface CustomerOrderStateExceptionVisitor<E extends view.UserException> {
    
    public void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException, E;
    public void handleSendOrder(SendOrderView sendOrder) throws ModelException, E;
    
}
