
package view.visitor;

import view.*;

public abstract class ServiceStandardVisitor implements ServiceVisitor {
    
    public void handleRegisterService(RegisterServiceView registerService) throws ModelException{
        this.standardHandling(registerService);
    }
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.standardHandling(customerService);
    }
    public void handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException{
        this.standardHandling(shopkeeperService);
    }
    protected abstract void standardHandling(ServiceView service) throws ModelException;
}
