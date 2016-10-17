
package modelServer;


import persistence.*;

public  class RemoteCustomerService extends RemoteService {

	
	public RemoteCustomerService(String connectionName, String userName, PersistentCustomerService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> customerService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentCustomerService)this.server).customerService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> acceptDelivery(String customerOrderProxiString){
        try {
            PersistentCustomerOrder customerOrder = (PersistentCustomerOrder)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerOrderProxiString));
            ((PersistentCustomerService)this.server).acceptDelivery(customerOrder);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> addToCart(String articleProxiString, String amountAsString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long amount = new Long(amountAsString).longValue();
            ((PersistentCustomerService)this.server).addToCart(article, amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> checkOut(){
        try {
            ((PersistentCustomerService)this.server).checkOut();
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> deposit(String amountAsString){
        try {
            long amount = new Long(amountAsString).longValue();
            ((PersistentCustomerService)this.server).deposit(amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> findArticle(String description){
        try {
            ((PersistentCustomerService)this.server).findArticle(description);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> order(){
        try {
            ((PersistentCustomerService)this.server).order();
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> removeFCart(String articleProxiString, String cartProxiString){
        try {
            PersistentQuantifiedArticles article = (PersistentQuantifiedArticles)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            PersistentCart cart = (PersistentCart)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(cartProxiString));
            ((PersistentCustomerService)this.server).removeFCart(article, cart);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> withdraw(String amountAsString){
        try {
            long amount = new Long(amountAsString).longValue();
            ((PersistentCustomerService)this.server).withdraw(amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.InsufficientFunds e0){
            return createExceptionResult(e0, this);
        }
    }
    


}