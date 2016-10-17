
package view.visitor;

import view.*;

public interface DeliveryVisitor {
    
    public void handleCustomerOrder(CustomerOrderView customerOrder) throws ModelException;
    public void handleRetoure(RetoureView retoure) throws ModelException;
    public void handleShopKeeperOrder(ShopKeeperOrderView shopKeeperOrder) throws ModelException;
    
}
