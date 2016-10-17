
package view.visitor;

import view.*;

public interface DeliveryReturnExceptionVisitor<R, E extends view.UserException> {
    
    public R handleCustomerOrder(CustomerOrderView customerOrder) throws ModelException, E;
    public R handleRetoure(RetoureView retoure) throws ModelException, E;
    public R handleShopKeeperOrder(ShopKeeperOrderView shopKeeperOrder) throws ModelException, E;
    
}
