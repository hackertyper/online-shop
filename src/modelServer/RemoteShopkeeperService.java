
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
    
    public synchronized java.util.HashMap<?,?> changeManufacturerDelivery(String articleProxiString, String newManuDeliveryAsString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long newManuDelivery = new Long(newManuDeliveryAsString).longValue();
            ((PersistentShopkeeperService)this.server).changeManufacturerDelivery(article, newManuDelivery);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeMaxStock(String articleProxiString, String maxStockAsString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long maxStock = new Long(maxStockAsString).longValue();
            ((PersistentShopkeeperService)this.server).changeMaxStock(article, maxStock);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.InvalidStockNumber e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> changeMinStock(String articleProxiString, String minStockAsString){
        try {
            PersistentArticle article = (PersistentArticle)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long minStock = new Long(minStockAsString).longValue();
            ((PersistentShopkeeperService)this.server).changeMinStock(article, minStock);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.InvalidStockNumber e0){
            return createExceptionResult(e0, this);
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
    
    public synchronized java.util.HashMap<?,?> changeRetourePercentage(String newPercentageAsString){
        try {
            long newPercentage = new Long(newPercentageAsString).longValue();
            ((PersistentShopkeeperService)this.server).changeRetourePercentage(newPercentage);
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
    
    public synchronized java.util.HashMap<?,?> countArticles(String pgProxiString){
        try {
            PersistentProductGroup pg = (PersistentProductGroup)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(pgProxiString));
            long result = ((PersistentShopkeeperService)this.server).countArticles(pg);
            return createOKResult(result);
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> createArticle(String parentProxiString, String description, String manufacturer, String priceAsString, String maxStockAsString, String minStockAsString, String manuDeliveryAsString){
        try {
            PersistentProductGroup parent = (PersistentProductGroup)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(parentProxiString));
            long price = new Long(priceAsString).longValue();
            long maxStock = new Long(maxStockAsString).longValue();
            long minStock = new Long(minStockAsString).longValue();
            long manuDelivery = new Long(manuDeliveryAsString).longValue();
            ((PersistentShopkeeperService)this.server).createArticle(parent, description, manufacturer, price, maxStock, minStock, manuDelivery);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }catch(model.InvalidStockNumber e0){
            return createExceptionResult(e0, this);
        }
    }
    
    public synchronized java.util.HashMap<?,?> createProductGroup(String parentProxiString, String description){
        try {
            PersistentProductGroup parent = (PersistentProductGroup)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(parentProxiString));
            ((PersistentShopkeeperService)this.server).createProductGroup(parent, description);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    
    public synchronized java.util.HashMap<?,?> orderNew(String articleProxiString, String amountAsString){
        try {
            PersistentNewlyAdded article = (PersistentNewlyAdded)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            long amount = new Long(amountAsString).longValue();
            ((PersistentShopkeeperService)this.server).orderNew(article, amount);
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
    
    public synchronized java.util.HashMap<?,?> startSellingAgain(String articleProxiString){
        try {
            PersistentRemovedFSale article = (PersistentRemovedFSale)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentShopkeeperService)this.server).startSellingAgain(article);
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
    
    public synchronized java.util.HashMap<?,?> stopSelling(String articleProxiString){
        try {
            PersistentOfferedFSale article = (PersistentOfferedFSale)PersistentProxi.createProxi(common.RPCConstantsAndServices.createProxiInformation(articleProxiString));
            ((PersistentShopkeeperService)this.server).stopSelling(article);
            return createOKResult();
        }catch(PersistenceException pe){
            return createExceptionResult(pe);
        }
    }
    


}