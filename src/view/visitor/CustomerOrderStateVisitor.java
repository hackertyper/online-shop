
package view.visitor;

import view.*;

public interface CustomerOrderStateVisitor {
    
    public void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException;
    public void handleSendOrder(SendOrderView sendOrder) throws ModelException;
    
}
