
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CartManager extends PersistentObject implements PersistentCartManager{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCartManager getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.getClass(objectId);
        return (PersistentCartManager)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCartManager createCartManager() throws PersistenceException{
        return createCartManager(false);
    }
    
    public static PersistentCartManager createCartManager(boolean delayed$Persistence) throws PersistenceException {
        PersistentCartManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerFacade
                .newDelayedCartManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerFacade
                .newCartManager(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCartManager createCartManager(boolean delayed$Persistence,PersistentCartManager This) throws PersistenceException {
        PersistentCartManager result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerFacade
                .newDelayedCartManager();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCartManagerFacade
                .newCartManager(-1);
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
            AbstractPersistentRoot myCart = (AbstractPersistentRoot)this.getMyCart();
            if (myCart != null) {
                result.put("myCart", myCart.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myCart.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myCart.hasEssentialFields())myCart.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("articleList", this.getArticleList().getObservee().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            AbstractPersistentRoot customerManager = (AbstractPersistentRoot)this.getCustomerManager();
            if (customerManager != null) {
                result.put("customerManager", customerManager.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    customerManager.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && customerManager.hasEssentialFields())customerManager.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot myCartServer = (AbstractPersistentRoot)this.getMyCartServer();
            if (myCartServer != null) {
                result.put("myCartServer", myCartServer.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myCartServer.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myCartServer.hasEssentialFields())myCartServer.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CartManager provideCopy() throws PersistenceException{
        CartManager result = this;
        result = new CartManager(this.myCart, 
                                 this.articleList, 
                                 this.subService, 
                                 this.This, 
                                 this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCart myCart;
    protected PersistentCartManagerArticleList articleList;
    protected SubjInterface subService;
    protected PersistentCartManager This;
    
    public CartManager(PersistentCart myCart,PersistentCartManagerArticleList articleList,SubjInterface subService,PersistentCartManager This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.myCart = myCart;
        this.articleList = articleList;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 190;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 190) ConnectionHandler.getTheConnectionHandler().theCartManagerFacade
            .newCartManager(this.getId());
        super.store();
        if(this.getMyCart() != null){
            this.getMyCart().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.myCartSet(this.getId(), getMyCart());
        }
        if(this.articleList != null){
            this.articleList.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.articleListSet(this.getId(), articleList);
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentCart getMyCart() throws PersistenceException {
        return this.myCart;
    }
    public void setMyCart(PersistentCart newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.myCart)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.myCart = (PersistentCart)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.myCartSet(this.getId(), newValue);
        }
    }
    public void setArticleList(PersistentCartManagerArticleList newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.articleList)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.articleList = (PersistentCartManagerArticleList)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.articleListSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentCartManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCartManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartManagerFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCartManager getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCartManager result = (PersistentCartManager)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCartManager)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCartManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManager(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getMyCart() != null) return 1;
        if (this.getArticleList().getObservee().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void addArticle(final PersistentArticle article, final long amount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentAddArticleCommand command = model.meta.AddArticleCommand.createAddArticleCommand(amount, now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangeAmountCommand command = model.meta.ChangeAmountCommand.createChangeAmountCommand(newAmount, now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    public PersistentCartManagerArticleList getArticleList() 
				throws PersistenceException{
        if (this.articleList == null) {
			this.setArticleList(model.CartManagerArticleList.createCartManagerArticleList(this.isDelayed$Persistence()));
			this.articleList.setObserver(this);
		}
		return this.articleList;
    }
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        CustomerManagerSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
										.inverseGetCartMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public PersistentCartService getMyCartServer() 
				throws PersistenceException{
        CartServiceSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCartServiceFacade
										.inverseGetCartMngr(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCartManager)This);
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
    public void removeFCart(final PersistentQuantifiedArticles article, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentRemoveFCartCommand command = model.meta.RemoveFCartCommand.createRemoveFCartCommand(now, now);
		command.setArticle(article);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
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
    
    public void addArticle(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        getThis().getMyCart().addArticle(QuantifiedArticles.createQuantifiedArticles(article, amount));
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        getThis().getMyCartServer().addToCart(article, amount);
    }
    public void articleList_update(final model.meta.QuantifiedArticlesMssgs event) 
				throws PersistenceException{
        getThis().getMyCartServer().signalChanged(true);
    }
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount) 
				throws PersistenceException{
        getThis().getMyCart().changeAmount(article, newAmount);
    }
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException{
        //TODO: implement method: checkOut
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
		getThis().setMyCart(Cart.createCart());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    public void order() 
				throws PersistenceException{
        //TODO: implement method: order
        
    }
    public void removeFCart(final PersistentQuantifiedArticles article) 
				throws PersistenceException{
        getThis().getMyCart().removeArticle(article);
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
