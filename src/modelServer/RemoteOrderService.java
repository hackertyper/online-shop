
package modelServer;


import persistence.*;

public  class RemoteOrderService extends RemoteCustomerService {

	
	public RemoteOrderService(String connectionName, String userName, PersistentOrderService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> customerService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentOrderService)this.server).customerService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> orderService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentOrderService)this.server).orderService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> acceptDelivery(String customerOrderProxiString){
        try {
            PersistentCustomerOrder customerOrder = (PersistentCustomerOrder)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerOrderProxiString));
            ((PersistentOrderService)this.server).acceptDelivery(customerOrder);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> cancel(String preOrderProxiString){
        try {
            PersistentPreOrder preOrder = (PersistentPreOrder)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(preOrderProxiString));
            ((PersistentOrderService)this.server).cancel(preOrder);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> preorder(String preOrderProxiString, String deliveryMethodProxiString){
        try {
            PersistentPreOrder preOrder = (PersistentPreOrder)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(preOrderProxiString));
            PersistentCustomerDelivery deliveryMethod = (PersistentCustomerDelivery)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(deliveryMethodProxiString));
            ((PersistentOrderService)this.server).preorder(preOrder, deliveryMethod);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> retoureArticle(String articleProxiString, String amountAsString){
        try {
            PersistentQuantifiedArticles article = (PersistentQuantifiedArticles)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long amount = new Long(amountAsString).longValue();
            ((PersistentOrderService)this.server).retoureArticle(article, amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> retoureDelivery(String customerOrderProxiString){
        try {
            PersistentCustomerOrder customerOrder = (PersistentCustomerOrder)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerOrderProxiString));
            ((PersistentOrderService)this.server).retoureDelivery(customerOrder);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    


}