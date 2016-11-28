
package model;

import persistence.*;

import model.visitor.*;


/* Additional import section end */

public class Cart extends PersistentObject implements PersistentCart{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentCart getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theCartFacade.getClass(objectId);
        return (PersistentCart)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentCart createCart(PersistentCartState state) throws PersistenceException{
        return createCart(state,false);
    }
    
    public static PersistentCart createCart(PersistentCartState state,boolean delayed$Persistence) throws PersistenceException {
        PersistentCart result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCartFacade
                .newDelayedCart(0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCartFacade
                .newCart(0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("state", state);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCart createCart(PersistentCartState state,boolean delayed$Persistence,PersistentCart This) throws PersistenceException {
        PersistentCart result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCartFacade
                .newDelayedCart(0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCartFacade
                .newCart(0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("state", state);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("currentSum", new Long(this.getCurrentSum()).toString());
            AbstractPersistentRoot state = (AbstractPersistentRoot)this.getState();
            if (state != null) {
                result.put("state", state.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    state.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && state.hasEssentialFields())state.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot cartMngr = (AbstractPersistentRoot)this.getCartMngr();
            if (cartMngr != null) {
                result.put("cartMngr", cartMngr.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    cartMngr.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && cartMngr.hasEssentialFields())cartMngr.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Cart provideCopy() throws PersistenceException{
        Cart result = this;
        result = new Cart(this.currentSum, 
                          this.state, 
                          this.subService, 
                          this.This, 
                          this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected long currentSum;
    protected PersistentCartState state;
    protected SubjInterface subService;
    protected PersistentCart This;
    
    public Cart(long currentSum,PersistentCartState state,SubjInterface subService,PersistentCart This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.currentSum = currentSum;
        this.state = state;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 123;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 123) ConnectionHandler.getTheConnectionHandler().theCartFacade
            .newCart(currentSum,this.getId());
        super.store();
        if(this.getState() != null){
            this.getState().store();
            ConnectionHandler.getTheConnectionHandler().theCartFacade.stateSet(this.getId(), getState());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theCartFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theCartFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public long getCurrentSum() throws PersistenceException {
        return this.currentSum;
    }
    public void setCurrentSum(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theCartFacade.currentSumSet(this.getId(), newValue);
        this.currentSum = newValue;
    }
    public PersistentCartState getState() throws PersistenceException {
        return this.state;
    }
    public void setState(PersistentCartState newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.state)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.state = (PersistentCartState)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartFacade.stateSet(this.getId(), newValue);
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
            ConnectionHandler.getTheConnectionHandler().theCartFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentCart newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentCart)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentCart getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCart result = (PersistentCart)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCart)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCart(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCart(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCart(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCart(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCart(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCart(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCart(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getState() != null && this.getState().getTheObject().getLeafInfo() != 0) return 1;
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
    public PersistentCartManager getCartMngr() 
				throws PersistenceException{
        CartManagerSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCartManagerFacade
										.inverseGetMyCart(getThis().getId(), getThis().getClassId());
		try {
			return result.iterator().next();
		} catch (java.util.NoSuchElementException nsee){
			return null;
		}
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCart)This);
		if(this.isTheSameAs(This)){
			this.setState((PersistentCartState)final$$Fields.get("state"));
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
     * Changes the amount of article to new value. Deletes articles if amount is == 0.
     * Recalculates the current sum of the cart.
     * 
     * @param article - the article for which the amount is changed
     * @param newAmount - the new value for amount
     */
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount) 
				throws PersistenceException{
    	getThis().checkOutReverse();
    	// Find article to change amount
        getThis().getCartMngr().getArticleList().findFirst(new Predcate<PersistentQuantifiedArticles>() {
			@Override
			public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
				return argument.equals(article);
			}
		}).changeAmount(newAmount);
        // Delete article from list if amount = 0
        getThis().getCartMngr().getArticleList().filter((PersistentQuantifiedArticles x) -> x.getAmount() != 0);
        // Calculation of new sum
        getThis().setCurrentSum(getThis().fetchCurrentSum());
    }
    public void changeState(final PersistentCartState newState) 
				throws PersistenceException{
        getThis().setState(newState);
    }
    /**
     * Rolls back the reservations produced by check out.
     */
    public void checkOutReverse() 
				throws PersistenceException{
    	getThis().getState().accept(new CartStateVisitor() {
			@Override
			public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException {}
			@Override
			public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException {
				getThis().getCartMngr().getArticleList().applyToAll(new Procdure<PersistentQuantifiedArticles>() {
					@Override
					public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException {
						argument.deleteReserve();
					}
				});
		    	getThis().changeState(OpenCart.getTheOpenCart());
			}
		});
    }
    /**
     * Checks out the current cart through reservation of the chosen articles amount.
     * 
     * @throws InsufficientStock if article can not be reserved
     */
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException{
        getThis().getState().accept(new CartStateExceptionVisitor<InsufficientStock>() {
			@Override
			public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException, InsufficientStock {
				// Reserve all articles in the cart
				getThis().getCartMngr().getArticleList().applyToAllException(new ProcdureException<PersistentQuantifiedArticles, InsufficientStock>() {
					@Override
					public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException, InsufficientStock {
						argument.reserve();
					}
				});
		        getThis().changeState(CheckedOut.createCheckedOut());
			}
			@Override
			public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException {}
		});
    	
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    /**
     * Calculates the current sum of the cart.
     * 
     * @return sum of the articles in the cart
     */
    public long fetchCurrentSum() 
				throws PersistenceException{
    	return getThis().getCartMngr().getArticleList().aggregate(new Aggregtion<PersistentQuantifiedArticles, Long>() {
			@Override
			public Long neutral() throws PersistenceException {
				return (long) 0;
			}
			@Override
			public Long compose(Long result, PersistentQuantifiedArticles argument) throws PersistenceException {
				return result + argument.fetchPrice();
			}
		});
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    public void order(final PersistentCustomerDelivery deliveryMethod) 
				throws model.FirstCheckOut, model.InsufficientFunds, PersistenceException{
    	// Check if cart is checked out
    	getThis().getState().accept(new CartStateExceptionVisitor<FirstCheckOut>() {
			@Override
			public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException {}
			@Override
			public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException, FirstCheckOut {
				throw new FirstCheckOut(serverConstants.ErrorMessages.FirstCheckOut);
			}
		});
    	getThis().getState().accept(new CartStateExceptionVisitor<InsufficientFunds>() {
			@Override
			public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException {}
			@Override
			public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException, InsufficientFunds {
				// pay the sum of the articles from the account
				getThis().getCartMngr().pay(getThis().getCurrentSum() + deliveryMethod.getExtraCharge());
				// create order to deliver with this article list
				PersistentCustomerOrder co = CustomerOrder.createCustomerOrder(deliveryMethod.getTime(), serverConstants.OrderConstants.current);
				getThis().getCartMngr().getArticleList().applyToAll(new Procdure<PersistentQuantifiedArticles>() {
					@Override
					public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException {
						co.getArticleList().add(argument);
					}
				});
				getThis().getCartMngr().addOrder(co);
				// cause reorder if necessary
		        getThis().getCartMngr().getArticleList().applyToAll(new Procdure<PersistentQuantifiedArticles>() {
					@Override
					public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException {
						argument.pack();
					}
				});
		        co.send();
			}
		});
    }
    /**
     * Removes the article from the cart.
     * Recalculates the current sum of the cart.
     * 
     * @param article - the article to remove
     */
    public void removeArticle(final PersistentQuantifiedArticles article) 
				throws PersistenceException{
    	getThis().checkOutReverse();
    	// Delete article from cart
        getThis().getCartMngr().getArticleList().filter(new Predcate<PersistentQuantifiedArticles>() {
			@Override
			public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
				return !argument.equals(article);
			}
		});
        // Calculation of new sum
        getThis().setCurrentSum(getThis().fetchCurrentSum());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
