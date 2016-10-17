
package view.visitor;

import view.*;

public interface DeliveryExceptionVisitor<E extends view.UserException> {
    
    public void handleCustomerOrder(CustomerOrderView customerOrder) throws ModelException, E;
    public void handleRetoure(RetoureView retoure) throws ModelException, E;
    public void handleShopKeeperOrder(ShopKeeperOrderView shopKeeperOrder) throws ModelException, E;
    
}
