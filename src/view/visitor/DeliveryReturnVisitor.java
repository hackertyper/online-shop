
package view.visitor;

import view.*;

public interface DeliveryReturnVisitor<R> {
    
    public R handleCustomerOrder(CustomerOrderView customerOrder) throws ModelException;
    public R handleRetoure(RetoureView retoure) throws ModelException;
    public R handleShopKeeperOrder(ShopKeeperOrderView shopKeeperOrder) throws ModelException;
    
}
