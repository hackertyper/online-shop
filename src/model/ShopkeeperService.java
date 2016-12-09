
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShopkeeperService extends model.Service implements PersistentShopkeeperService{
    
    
    public static PersistentShopkeeperService createShopkeeperService() throws PersistenceException{
        return createShopkeeperService(false);
    }
    
    public static PersistentShopkeeperService createShopkeeperService(boolean delayed$Persistence) throws PersistenceException {
        PersistentShopkeeperService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
                .newDelayedShopkeeperService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
                .newShopkeeperService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentShopkeeperService createShopkeeperService(boolean delayed$Persistence,PersistentShopkeeperService This) throws PersistenceException {
        PersistentShopkeeperService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
                .newDelayedShopkeeperService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
                .newShopkeeperService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot manager = (AbstractPersistentRoot)this.getManager();
            if (manager != null) {
                result.put("manager", manager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    manager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && manager.hasEssentialFields())manager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ShopkeeperService provideCopy() throws PersistenceException{
        ShopkeeperService result = this;
        result = new ShopkeeperService(this.subService, 
                                       this.This, 
                                       this.manager, 
                                       this.getId());
        result.errors = this.errors.copy(result);
        result.errors = this.errors.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentShopkeeper manager;
    
    public ShopkeeperService(SubjInterface subService,PersistentService This,PersistentShopkeeper manager,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentService)This,id);
        this.manager = manager;        
    }
    
    static public long getTypeId() {
        return -105;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == -105) ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
            .newShopkeeperService(this.getId());
        super.store();
        if(this.getManager() != null){
            this.getManager().store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade.managerSet(this.getId(), getManager());
        }
        
    }
    
    public PersistentShopkeeper getManager() throws PersistenceException {
        return this.manager;
    }
    public void setManager(PersistentShopkeeper newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.manager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.manager = (PersistentShopkeeper)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade.managerSet(this.getId(), newValue);
        }
    }
    public PersistentShopkeeperService getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopkeeperService result = (PersistentShopkeeperService)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopkeeperService)this.This;
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getManager() != null && this.getManager().getTheObject().getLeafInfo() != 0) return 1;
        return 0;
    }
    
    
    public synchronized void deregister(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentShopkeeperService)This);
		if(this.isTheSameAs(This)){
		}
    }
    public synchronized void register(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.register(observee);
    }
    public String shopkeeperService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        String result = "+++";
		return result;
    }
    public synchronized void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.updateObservers(event);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void changeDescription(final PersistentItem item, final String newDescription) 
				throws PersistenceException{
        item.changeDescription(newDescription);
        getThis().signalChanged(true);
    }
    public void changeExtraCharge(final PersistentCustomerDelivery cd, final long newCharge) 
				throws PersistenceException{
        getThis().getManager().changeCharge(cd, newCharge, getThis());
        getThis().signalChanged(true);
    }
    public void changeManufacturerDelivery(final PersistentArticle article, final long newManuDelivery) 
				throws PersistenceException{
       article.changeManuDelivery(newManuDelivery);
       getThis().signalChanged(true);
    }
    public void changeMaxStock(final PersistentArticle article, final long maxStock) 
				throws model.InvalidStockNumber, PersistenceException{
        article.changeMaxStock(maxStock);
        getThis().signalChanged(true);
    }
    public void changeMinStock(final PersistentArticle article, final long minStock) 
				throws model.InvalidStockNumber, PersistenceException{
        article.changeMinStock(minStock);
        getThis().signalChanged(true);
    }
    public void changePrice(final PersistentArticle article, final long newPrice) 
				throws PersistenceException{
        article.changePrice(newPrice);
        getThis().signalChanged(true);
    }
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException{
        article.changeProductGroup(newPG);
        getThis().signalChanged(true);
    }
    public void changeRetourePercentage(final long newPercentage) 
				throws PersistenceException{
        getThis().getManager().changeRetourePercentage(newPercentage, getThis());
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException{
    	getThis().getManager().changeTime(cd, newTime, getThis());
    }
    public void connected(final String user) 
				throws PersistenceException{
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public long countArticles(final PersistentProductGroup pg) 
				throws PersistenceException{
        return pg.cumulateArticleCount();
    }
    public void createArticle(final PersistentProductGroup parent, final String description, final String manufacturer, final long price, final long maxStock, final long minStock, final long manuDelivery) 
				throws model.InvalidStockNumber, PersistenceException{
        getThis().getManager().createArticle(parent, description, manufacturer, price, maxStock, minStock, manuDelivery);
        getThis().signalChanged(true);
    }
    public void createProductGroup(final PersistentProductGroup parent, final String description) 
				throws PersistenceException{
        getThis().getManager().createProductGroup(parent, description);
        getThis().signalChanged(true);
    }
    public void disconnected() 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
		getThis().setManager(Shopkeeper.createShopkeeper());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void orderNew(final PersistentNewlyAdded article, final long amount) 
				throws PersistenceException{
        article.order(amount);
        getThis().signalChanged(true);
    }
    public void presetBalance(final long amount) 
				throws PersistenceException{
    	getThis().getManager().presetBalance(amount, getThis());
    }
    public void presetLowerLimit(final long amount) 
				throws PersistenceException{
        getThis().getManager().presetLowerLimit(amount, getThis());
    }
    public void startSellingAgain(final PersistentRemovedFSale article) 
				throws PersistenceException{
        article.startSellingAgain();
        getThis().signalChanged(true);
    }
    public void startSelling(final PersistentNewlyAdded article) 
				throws PersistenceException{
        article.startSelling();
        getThis().signalChanged(true);
    }
    public void stopSelling(final PersistentOfferedFSale article) 
				throws PersistenceException{
        article.stopSelling();
        getThis().signalChanged(true);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
