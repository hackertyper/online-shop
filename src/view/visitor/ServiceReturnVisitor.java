
package view.visitor;

import view.*;

public interface ServiceReturnVisitor<R> extends CustomerServiceReturnVisitor<R> {
    
    public R handleCustomerService(CustomerServiceView customerService) throws ModelException;
    public R handleRegisterService(RegisterServiceView registerService) throws ModelException;
    public R handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException;
    
}
