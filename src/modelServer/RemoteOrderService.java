
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
    
    public synchronized java.util.HashMap<?,?> retoureDelivery(String customerOrderProxiString, java.util.Vector<String> listTrnsprt){
        try {
            PersistentCustomerOrder customerOrder = (PersistentCustomerOrder)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(customerOrderProxiString));
            QuantifiedArticlesSearchList list = new QuantifiedArticlesSearchList();
			java.util.Iterator<String> listItrtr = listTrnsprt.iterator();
			while (listItrtr.hasNext()){
				PersistentQuantifiedArticles currentProxi = (PersistentQuantifiedArticles)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(listItrtr.next()));
				list.add(currentProxi);
			}
            ((PersistentOrderService)this.server).retoureDelivery(customerOrder, list);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    


}