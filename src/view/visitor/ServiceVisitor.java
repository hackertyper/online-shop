
package view.visitor;

import view.*;

public interface ServiceVisitor extends CustomerServiceVisitor{
    
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException;
    public void handleRegisterService(RegisterServiceView registerService) throws ModelException;
    public void handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException;
    
}
