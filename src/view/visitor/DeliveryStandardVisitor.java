
package view.visitor;

import view.*;

public abstract class DeliveryStandardVisitor implements DeliveryVisitor {
    
    public void handleRetoure(RetoureView retoure) throws ModelException{
        this.standardHandling(retoure);
    }
    public void handleCustomerOrder(CustomerOrderView customerOrder) throws ModelException{
        this.standardHandling(customerOrder);
    }
    public void handleShopKeeperOrder(ShopKeeperOrderView shopKeeperOrder) throws ModelException{
        this.standardHandling(shopKeeperOrder);
    }
    protected abstract void standardHandling(DeliveryView delivery) throws ModelException;
}
