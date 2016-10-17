
package view.visitor;

import view.*;

public abstract class RemoteStandardVisitor implements RemoteVisitor {
    
    public void handleRegisterService(RegisterServiceView registerService) throws ModelException{
        this.standardHandling(registerService);
    }
    public void handleCustomerService(CustomerServiceView customerService) throws ModelException{
        this.standardHandling(customerService);
    }
    public void handleServer(ServerView server) throws ModelException{
        this.standardHandling(server);
    }
    public void handleShopkeeperService(ShopkeeperServiceView shopkeeperService) throws ModelException{
        this.standardHandling(shopkeeperService);
    }
    protected abstract void standardHandling(Remote remote) throws ModelException;
}
