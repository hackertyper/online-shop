
package modelServer;


import persistence.*;

public  class RemoteShopkeeperService extends RemoteService {

	
	public RemoteShopkeeperService(String connectionName, String userName, PersistentShopkeeperService server){
		super (connectionName, userName , server);
	}

	
 

    public synchronized java.util.HashMap<?,?> shopkeeperService_Menu_Filter(String anythingProxiString){
        try {
            Anything anything = (Anything)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(anythingProxiString));
            String result = ((PersistentShopkeeperService)this.server).shopkeeperService_Menu_Filter(anything);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeDescription(String itemProxiString, String newDescription){
        try {
            PersistentItem item = (PersistentItem)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(itemProxiString));
            ((PersistentShopkeeperService)this.server).changeDescription(item, newDescription);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeExtraCharge(String cdProxiString, String newChargeAsString){
        try {
            PersistentCustomerDelivery cd = (PersistentCustomerDelivery)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(cdProxiString));
            long newCharge = new Long(newChargeAsString).longValue();
            ((PersistentShopkeeperService)this.server).changeExtraCharge(cd, newCharge);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeManufacturerDelivery(String newManuDeliveryAsString){
        try {
            long newManuDelivery = new Long(newManuDeliveryAsString).longValue();
            ((PersistentShopkeeperService)this.server).changeManufacturerDelivery(newManuDelivery);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changePrice(String articleProxiString, String newPriceAsString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long newPrice = new Long(newPriceAsString).longValue();
            ((PersistentShopkeeperService)this.server).changePrice(article, newPrice);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeProductGroup(String articleProxiString, String newPGProxiString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            PersistentProductGroup newPG = (PersistentProductGroup)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(newPGProxiString));
            ((PersistentShopkeeperService)this.server).changeProductGroup(article, newPG);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeTime(String cdProxiString, String newTimeAsString){
        try {
            PersistentCustomerDelivery cd = (PersistentCustomerDelivery)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(cdProxiString));
            long newTime = new Long(newTimeAsString).longValue();
            ((PersistentShopkeeperService)this.server).changeTime(cd, newTime);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> presetBalance(String amountAsString){
        try {
            long amount = new Long(amountAsString).longValue();
            ((PersistentShopkeeperService)this.server).presetBalance(amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> presetLowerLimit(String amountAsString){
        try {
            long amount = new Long(amountAsString).longValue();
            ((PersistentShopkeeperService)this.server).presetLowerLimit(amount);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> startSelling(String articleProxiString){
        try {
            PersistentNewlyAdded article = (PersistentNewlyAdded)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentShopkeeperService)this.server).startSelling(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    


}