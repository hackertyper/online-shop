
package modelServer;


import persistence.*;

public  class RemoteAccountService extends RemoteCustomerService {

	
	public RemoteAccountService(String connectionName, String userName, PersistentAccountService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> accountService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentAccountService)this.server).accountService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> customerService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentAccountService)this.server).customerService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> deposit(String amountAsString){
        try {
            long amount = new Long(amountAsString).longValue();
            ((PersistentAccountService)this.server).deposit(amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> withdraw(String amountAsString){
        try {
            long amount = new Long(amountAsString).longValue();
            ((PersistentAccountService)this.server).withdraw(amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.InsufficientFunds e0){
            return createExceptionResult(e0, this);
        }
    }
    


}