
package modelServer;


import persistence.*;

public  class RemoteRegisterService extends RemoteService {

	
	public RemoteRegisterService(String connectionName, String userName, PersistentRegisterService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> registerService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentRegisterService)this.server).registerService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> register(String accountName, String password){
        try {
            ((PersistentRegisterService)this.server).register(accountName, password);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.DoubleUsername e0){
            return createExceptionResult(e0, this);
        }
    }
    


}