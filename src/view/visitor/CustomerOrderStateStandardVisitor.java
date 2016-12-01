
package view.visitor;

import view.*;

public abstract class CustomerOrderStateStandardVisitor implements CustomerOrderStateVisitor {
    
    public void handleSendOrder(SendOrderView sendOrder) throws ModelException{
        this.standardHandling(sendOrder);
    }
    public void handlePreOrder(PreOrderView preOrder) throws ModelException{
        this.standardHandling(preOrder);
    }
    public void handleArrivedOrder(ArrivedOrderView arrivedOrder) throws ModelException{
        this.standardHandling(arrivedOrder);
    }
    protected abstract void standardHandling(CustomerOrderState customerOrderState) throws ModelException;
}
