
package model;

import persistence.*;
import model.meta.ArticleChangePriceIntegerMssg;
import model.meta.ArticleDeleteReserveIntegerMssg;
import model.meta.ArticleMssgsVisitor;
import model.meta.ArticleReceiveDeliveryIntegerMssg;
import model.meta.ArticleReserveIntegerMssg;
import model.meta.QuantifiedArticlesFireArticleChangedArticleMssgsMssg;
import model.meta.QuantifiedArticlesMssgsVisitor;
import model.visitor.*;


/* Additional import section end */

public class PreOrder extends PersistentObject implements PersistentPreOrder{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentPreOrder getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.getClass(objectId);
        return (PersistentPreOrder)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentPreOrder createPreOrder(PersistentCartManager cartManager,long sum) throws PersistenceException{
        return createPreOrder(cartManager,sum,false);
    }
    
    public static PersistentPreOrder createPreOrder(PersistentCartManager cartManager,long sum,boolean delayed$Persistence) throws PersistenceException {
        PersistentPreOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
                .newDelayedPreOrder(sum);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
                .newPreOrder(sum,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("cartManager", cartManager);
        final$$Fields.put("sum", sum);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentPreOrder createPreOrder(PersistentCartManager cartManager,long sum,boolean delayed$Persistence,PersistentPreOrder This) throws PersistenceException {
        PersistentPreOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
                .newDelayedPreOrder(sum);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
                .newPreOrder(sum,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("cartManager", cartManager);
        final$$Fields.put("sum", sum);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot cartManager = (AbstractPersistentRoot)this.getCartManager();
            if (cartManager != null) {
                result.put("cartManager", cartManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    cartManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && cartManager.hasEssentialFields())cartManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("sum", new Long(this.getSum()).toString());
            result.put("articleList", this.getArticleList().getObservee().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            AbstractPersistentRoot standardDelivery = (AbstractPersistentRoot)this.getStandardDelivery();
            if (standardDelivery != null) {
                result.put("standardDelivery", standardDelivery.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    standardDelivery.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && standardDelivery.hasEssentialFields())standardDelivery.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot onDelivery = (AbstractPersistentRoot)this.getOnDelivery();
            if (onDelivery != null) {
                result.put("onDelivery", onDelivery.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    onDelivery.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && onDelivery.hasEssentialFields())onDelivery.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public PreOrder provideCopy() throws PersistenceException{
        PreOrder result = this;
        result = new PreOrder(this.cartManager, 
                              this.sum, 
                              this.articleList, 
                              this.standardDelivery, 
                              this.onDelivery, 
                              this.subService, 
                              this.This, 
                              this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCartManager cartManager;
    protected long sum;
    protected PersistentPreOrderArticleList articleList;
    protected PersistentStandardDelivery standardDelivery;
    protected PersistentOverNightDelivery onDelivery;
    protected SubjInterface subService;
    protected PersistentPreOrder This;
    
    public PreOrder(PersistentCartManager cartManager,long sum,PersistentPreOrderArticleList articleList,PersistentStandardDelivery standardDelivery,PersistentOverNightDelivery onDelivery,SubjInterface subService,PersistentPreOrder This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.cartManager = cartManager;
        this.sum = sum;
        this.articleList = articleList;
        this.standardDelivery = standardDelivery;
        this.onDelivery = onDelivery;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 195;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 195) ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
            .newPreOrder(sum,this.getId());
        super.store();
        if(this.getCartManager() != null){
            this.getCartManager().store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.cartManagerSet(this.getId(), getCartManager());
        }
        if(this.articleList != null){
            this.articleList.store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.articleListSet(this.getId(), articleList);
        }
        if(this.getStandardDelivery() != null){
            this.getStandardDelivery().store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.standardDeliverySet(this.getId(), getStandardDelivery());
        }
        if(this.getOnDelivery() != null){
            this.getOnDelivery().store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.onDeliverySet(this.getId(), getOnDelivery());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentCartManager getCartManager() throws PersistenceException {
        return this.cartManager;
    }
    public void setCartManager(PersistentCartManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.cartManager)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.cartManager = (PersistentCartManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.cartManagerSet(this.getId(), newValue);
        }
    }
    public long getSum() throws PersistenceException {
        return this.sum;
    }
    public void setSum(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.sumSet(this.getId(), newValue);
        this.sum = newValue;
    }
    public void setArticleList(PersistentPreOrderArticleList newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.articleList)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.articleList = (PersistentPreOrderArticleList)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.articleListSet(this.getId(), newValue);
        }
    }
    public PersistentStandardDelivery getStandardDelivery() throws PersistenceException {
        return this.standardDelivery;
    }
    public void setStandardDelivery(PersistentStandardDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.standardDelivery)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.standardDelivery = (PersistentStandardDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.standardDeliverySet(this.getId(), newValue);
        }
    }
    public PersistentOverNightDelivery getOnDelivery() throws PersistenceException {
        return this.onDelivery;
    }
    public void setOnDelivery(PersistentOverNightDelivery newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.onDelivery)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.onDelivery = (PersistentOverNightDelivery)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.onDeliverySet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentPreOrder newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentPreOrder)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().thePreOrderFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentPreOrder getThis() throws PersistenceException {
        if(this.This == null){
            PersistentPreOrder result = (PersistentPreOrder)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentPreOrder)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrder(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrder(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticleList().getObservee().getLength() > 0) return 1;
        if (this.getStandardDelivery() != null) return 1;
        if (this.getOnDelivery() != null) return 1;
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
    public PersistentPreOrderArticleList getArticleList() 
				throws PersistenceException{
        if (this.articleList == null) {
			this.setArticleList(model.PreOrderArticleList.createPreOrderArticleList(this.isDelayed$Persistence()));
			this.articleList.setObserver(this);
		}
		return this.articleList;
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentPreOrder)This);
		if(this.isTheSameAs(This)){
			this.setCartManager((PersistentCartManager)final$$Fields.get("cartManager"));
			this.setSum((Long)final$$Fields.get("sum"));
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
    
    /**
     * Called if articleList changed.
     */
    public void articleList_update(final model.meta.QuantifiedArticlesMssgs event) 
				throws PersistenceException{
    event.accept(new QuantifiedArticlesMssgsVisitor() {
		@Override
		public void handleQuantifiedArticlesFireArticleChangedArticleMssgsMssg(
				QuantifiedArticlesFireArticleChangedArticleMssgsMssg event) throws PersistenceException {
			event.evnt.accept(new ArticleMssgsVisitor() {
				@Override
				public void handleArticleReserveIntegerMssg(ArticleReserveIntegerMssg event) throws PersistenceException {}
				@Override
				public void handleArticleReceiveDeliveryIntegerMssg(ArticleReceiveDeliveryIntegerMssg event)
						throws PersistenceException {
					getThis().getArticleList().applyToAll(new Procdure<PersistentQuantifiedArticles>() {
						@Override
						public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException {
							try {
								argument.reserve();
							} catch (InsufficientStock e) {}
						}
					});
				}
				@Override
				public void handleArticleDeleteReserveIntegerMssg(ArticleDeleteReserveIntegerMssg event)
						throws PersistenceException {
					getThis().getArticleList().applyToAll(new Procdure<PersistentQuantifiedArticles>() {
						@Override
						public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException {
							try {
								argument.reserve();
							} catch (InsufficientStock e) {}
						}
					});
				}
				@Override
				public void handleArticleChangePriceIntegerMssg(ArticleChangePriceIntegerMssg event) throws PersistenceException {}
			});
		}
	});
}
    public void cancel() 
				throws PersistenceException{
	// Nothing to do
}
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{}
    public void initializeOnCreation() 
				throws PersistenceException{
    getThis().setStandardDelivery(StandardDelivery.getTheStandardDelivery());
    getThis().setOnDelivery(OverNightDelivery.getTheOverNightDelivery());
}
    public void initializeOnInstantiation() 
				throws PersistenceException{}
    /**
     * Tries to reserve all articles. If successful creates a customerOrder and returns it.
     * @param deliveryMethod - the chosen delivery method
     * @return customerOrder if enough stock is accessible
     * @throws InsufficientFunds if not enough money on account to pay 
     */
    public PersistentCustomerOrder preorder(final PersistentCustomerDelivery deliveryMethod) 
				throws model.InsufficientFunds, PersistenceException{
	    // reserve articles
		try {
			getThis().getArticleList().applyToAllException(new ProcdureException<PersistentQuantifiedArticles, InsufficientStock>() {
				@Override
				public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException, InsufficientStock {
					argument.reserve();
				}
			});
		} catch (InsufficientStock e) {
			// if not enough stock, do nothing
			return null;
		}
		// pay the sum of the articles from the account
		getThis().getCartManager().pay(getThis().getSum() + deliveryMethod.getExtraCharge());
		// create order to deliver with this article list
		PersistentCustomerOrder co = CustomerOrder.createCustomerOrder(deliveryMethod.getTime(), serverConstants.OrderConstants.current);
		getThis().getArticleList().applyToAll(new Procdure<PersistentQuantifiedArticles>() {
			@Override
			public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException {
				co.getArticleList().add(argument);
			}
		});
		// cause reorder if necessary
	    getThis().getArticleList().applyToAll(new Procdure<PersistentQuantifiedArticles>() {
			@Override
			public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException {
				argument.pack();
			}
		});
	    return co;
	}
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */

/* End of protected part that is not overridden by persistence generator */
    
}
