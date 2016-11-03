
package view.visitor;

import view.*;

public interface ServiceExceptionVisitor<E extends view.UserException> extends CustomerServiceExceptionVisitor<E>{
    
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException, E;
    public void handleRegisterService(RegisterServiceView registerService) throws ModelException, E;
    public void handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException, E;
    
}
