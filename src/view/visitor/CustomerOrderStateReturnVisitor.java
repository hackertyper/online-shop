
package view.visitor;

import view.*;

public interface CustomerOrderStateReturnVisitor<R> {
    
    public R handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException;
    public R handleSendOrder(SendOrderView sendOrder) throws ModelException;
    
}
