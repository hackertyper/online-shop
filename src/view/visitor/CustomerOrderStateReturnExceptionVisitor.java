
package view.visitor;

import view.*;

public interface CustomerOrderStateReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException, E;
    public R handlePreOrder(PreOrderView preOrder) throws ModelException, E;
    public R handleSendOrder(SendOrderView sendOrder) throws ModelException, E;
    
}
