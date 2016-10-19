
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
    
    public static PersistentCart createCart() throws PersistenceException{
        return createCart(false);
    }
    
    public static PersistentCart createCart(boolean delayed$Persistence) throws PersistenceException {
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
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCart createCart(boolean delayed$Persistence,PersistentCart This) throws PersistenceException {
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
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("currentSum", new Long(this.getCurrentSum()).toString());
            result.put("articleList", this.getArticleList().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
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
    
    public Cart provideCopy() throws PersistenceException{
        Cart result = this;
        result = new Cart(this.currentSum, 
                          this.This, 
                          this.getId());
        result.articleList = this.articleList.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected long currentSum;
    protected Cart_ArticleListProxi articleList;
    protected PersistentCart This;
    
    public Cart(long currentSum,PersistentCart This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.currentSum = currentSum;
        this.articleList = new Cart_ArticleListProxi(this);
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
        this.getArticleList().store();
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
    public Cart_ArticleListProxi getArticleList() throws PersistenceException {
        return this.articleList;
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
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticleList().getLength() > 0) return 1;
        return 0;
    }
    
    
    public PersistentCustomer getManager() 
				throws PersistenceException{
        CustomerSearchList result = null;
		if (result == null) result = ConnectionHandler.getTheConnectionHandler().theCustomerFacade
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
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void addArticle(final PersistentQuantifiedArticles article) 
				throws PersistenceException{
    	PersistentQuantifiedArticles oldEntry = getThis().getArticleList().findFirst(new Predcate<PersistentQuantifiedArticles>() {
			@Override
			public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
				return argument.getArticle().equals(article.getArticle());
			}
		});
    	if(oldEntry == null) {
    		getThis().getArticleList().add(article);
    	} else {
    		oldEntry.setAmount(oldEntry.getAmount() + article.getAmount());
    	}
        getThis().setCurrentSum(getThis().getArticleList().aggregate(new Aggregtion<PersistentQuantifiedArticles, Long>() {

			@Override
			public Long neutral() throws PersistenceException {
				return (long) 0;
			}

			@Override
			public Long compose(Long result, PersistentQuantifiedArticles argument) throws PersistenceException {
				return result + (argument.getAmount() * argument.getArticle().getPrice());
			}
		}));
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
        //TODO: implement method: initializeOnCreation
        
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        //TODO: implement method: initializeOnInstantiation
        
    }
    public void order() 
				throws PersistenceException{
        //TODO: implement method: order
        getThis().getManager().pay(getThis().getCurrentSum());
    }
    public void removeArticle(final PersistentQuantifiedArticles article) 
				throws PersistenceException{
        getThis().getArticleList().removeFirstSuccess(new Predcate<PersistentQuantifiedArticles>() {
    		@Override
    		public boolean test(PersistentQuantifiedArticles argument) throws PersistenceException {
    			return argument.getArticle().equals(article.getArticle());
    		}
    	});
        getThis().setCurrentSum(getThis().getCurrentSum() - (article.getAmount() * article.getArticle().getPrice()));
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
