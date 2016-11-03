
package view.visitor;

import view.*;

public interface ServiceReturnExceptionVisitor<R, E extends view.UserException> extends CustomerServiceReturnExceptionVisitor<R, E> {
    
    public R handleCustomerService(CustomerServiceView customerService) throws ModelException, E;
    public R handleRegisterService(RegisterServiceView registerService) throws ModelException, E;
    public R handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException, E;
    
}
