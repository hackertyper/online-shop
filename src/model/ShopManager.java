
package model;

import persistence.*;
import model.meta.ArticleChangePriceIntegerMssg;
import model.meta.ArticleDeleteReserveIntegerMssg;
import model.meta.ArticleReceiveDeliveryIntegerMssg;
import model.meta.ArticleReserveIntegerMssg;
import model.meta.ItemMssgsVisitor;
import model.meta.ProductGroupAddItemItemMssg;
import model.visitor.*;


/* Additional import section end */

public class ShopManager extends PersistentObject implements PersistentShopManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentShopManager getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.getClass(objectId);
        return (PersistentShopManager)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentShopManager createShopManager() throws PersistenceException{
        return createShopManager(false);
    }
    
    public static PersistentShopManager createShopManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentShopManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
                .newDelayedShopManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
                .newShopManager(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentShopManager createShopManager(boolean delayed$Persistence,PersistentShopManager This) throws PersistenceException {
        PersistentShopManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
                .newDelayedShopManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
                .newShopManager(-1);
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
            AbstractPersistentRoot basicProductGroup = (AbstractPersistentRoot)this.getBasicProductGroup();
            if (basicProductGroup != null) {
                result.put("basicProductGroup", basicProductGroup.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    basicProductGroup.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && basicProductGroup.hasEssentialFields())basicProductGroup.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot customerManager = (AbstractPersistentRoot)this.getCustomerManager();
            if (customerManager != null) {
                result.put("customerManager", customerManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    customerManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && customerManager.hasEssentialFields())customerManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot myShopServer = (AbstractPersistentRoot)this.getMyShopServer();
            if (myShopServer != null) {
                result.put("myShopServer", myShopServer.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myShopServer.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myShopServer.hasEssentialFields())myShopServer.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public ShopManager provideCopy() throws PersistenceException{
        ShopManager result = this;
        result = new ShopManager(this.basicProductGroup, 
                                 this.subService, 
                                 this.This, 
                                 this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentShopManagerBasicProductGroup basicProductGroup;
    protected SubjInterface subService;
    protected PersistentShopManager This;
    
    public ShopManager(PersistentShopManagerBasicProductGroup basicProductGroup,SubjInterface subService,PersistentShopManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.basicProductGroup = basicProductGroup;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 186;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 186) ConnectionHandler.getTheConnectionHandler().theShopManagerFacade
            .newShopManager(this.getId());
        super.store();
        if(this.basicProductGroup != null){
            this.basicProductGroup.store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.basicProductGroupSet(this.getId(), basicProductGroup);
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public void setBasicProductGroup(PersistentShopManagerBasicProductGroup newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.basicProductGroup)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.basicProductGroup = (PersistentShopManagerBasicProductGroup)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.basicProductGroupSet(this.getId(), newValue);
        }
    }
    public SubjInterface getSubService() throws PersistenceException {
        return this.subService;
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.subService)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.subService = (SubjInterface)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentShopManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentShopManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theShopManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentShopManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopManager result = (PersistentShopManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getBasicProductGroup() != null) return 1;
        return 0;
    }
    
    
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        model.meta.ShopManagerAddToCartArticleIntegerMssg event = new model.meta.ShopManagerAddToCartArticleIntegerMssg(article, amount, getThis());
		event.execute();
		getThis().updateObservers(event);
		event.getResult();
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
    public void findArticle(final String description, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentFindArticleCommand command = model.meta.FindArticleCommand.createFindArticleCommand(description, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public PersistentProductGroup getBasicProductGroup() 
				throws PersistenceException{
        if (this.basicProductGroup== null) return null;
		return this.basicProductGroup.getObservee();
    }
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        CustomerManagerSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
										.inverseGetShopMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public PersistentShopService getMyShopServer() 
				throws PersistenceException{
        ShopServiceSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theShopServiceFacade
										.inverseGetShopMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentShopManager)This);
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
    public void setBasicProductGroup(final PersistentProductGroup basicProductGroup) 
				throws PersistenceException{
        if (this.basicProductGroup == null) {
			this.setBasicProductGroup(model.ShopManagerBasicProductGroup.createShopManagerBasicProductGroup(this.isDelayed$Persistence()));
			this.basicProductGroup.setObserver(getThis());
		}
		this.basicProductGroup.setObservee(basicProductGroup);
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
    
    public void addToCartImplementation(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        getThis().getCustomerManager().addToCart(article, amount);
    }
    public void basicProductGroup_update(final model.meta.ProductGroupMssgs event) 
				throws PersistenceException{
        //TODO: implement method: basicProductGroup_update
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void findArticle(final String description) 
				throws PersistenceException{
		ItemSearchList result = Item.getItemByDescription(description);
	    result.applyToAll(new Procdure<PersistentItem>() {
			@Override
			public void doItTo(PersistentItem argument) throws PersistenceException {
				argument.accept(new ItemVisitor() {
					@Override
					public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException {}
					@Override
					public void handleArticle(PersistentArticle article) throws PersistenceException {
						article.getState().accept(new ArticleStateVisitor() {
							@Override
							public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException {
								getThis().getBasicProductGroup().getItemList().add(article);
							}
							@Override
							public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException {
								getThis().getBasicProductGroup().getItemList().add(article);
							}
							@Override
							public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException {}
						});
					}
				});
			}
		});
	}
    public void initializeOnCreation() 
				throws PersistenceException{
        PersistentProductGroup pg = ProductGroup.createProductGroup("Alles");
		PersistentArticle article2 = Article.createArticle("Herd", Manufacturer.createManufacturer("Bosch", 10000), 50, 10, 1000);
		article2.setState(OfferedFSale.createOfferedFSale());
		article2.setStock(10);
		pg.getItemList().add(article2);
		getThis().getBasicProductGroup().getItemList().add(pg);
    	
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
