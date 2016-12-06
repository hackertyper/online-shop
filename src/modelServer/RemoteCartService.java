
package modelServer;


import persistence.*;

public  class RemoteCartService extends RemoteCustomerService {

	
	public RemoteCartService(String connectionName, String userName, PersistentCartService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> cartService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentCartService)this.server).cartService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> customerService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentCartService)this.server).customerService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeAmount(String articleProxiString, String newAmountAsString){
        try {
            PersistentQuantifiedArticles article = (PersistentQuantifiedArticles)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long newAmount = new Long(newAmountAsString).longValue();
            ((PersistentCartService)this.server).changeAmount(article, newAmount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> checkOut(){
        try {
            ((PersistentCartService)this.server).checkOut();
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> order(String cartProxiString, String deliveryMethodProxiString){
        try {
            PersistentCart cart = (PersistentCart)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(cartProxiString));
            PersistentCustomerDelivery deliveryMethod = (PersistentCustomerDelivery)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(deliveryMethodProxiString));
            ((PersistentCartService)this.server).order(cart, deliveryMethod);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> removeFCart(String articleProxiString){
        try {
            PersistentQuantifiedArticles article = (PersistentQuantifiedArticles)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentCartService)this.server).removeFCart(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> signalChanged(){
        try {
            ((PersistentCartService)this.server).signalChanged();
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    


}