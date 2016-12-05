
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class QuantifiedArticles extends PersistentObject implements PersistentQuantifiedArticles{
    
    /** Throws persistence exception if the object with the given id does not exist. */
    public static PersistentQuantifiedArticles getById(long objectId) throws PersistenceException{
        long classId = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.getClass(objectId);
        return (PersistentQuantifiedArticles)PersistentProxi.createProxi(objectId, classId);
    }
    
    public static PersistentQuantifiedArticles createQuantifiedArticles(PersistentArticle article,long amount) throws PersistenceException{
        return createQuantifiedArticles(article,amount,false);
    }
    
    public static PersistentQuantifiedArticles createQuantifiedArticles(PersistentArticle article,long amount,boolean delayed$Persistence) throws PersistenceException {
        PersistentQuantifiedArticles result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade
                .newDelayedQuantifiedArticles(amount);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade
                .newQuantifiedArticles(amount,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("article", article);
        final$$Fields.put("amount", amount);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentQuantifiedArticles createQuantifiedArticles(PersistentArticle article,long amount,boolean delayed$Persistence,PersistentQuantifiedArticles This) throws PersistenceException {
        PersistentQuantifiedArticles result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade
                .newDelayedQuantifiedArticles(amount);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade
                .newQuantifiedArticles(amount,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("article", article);
        final$$Fields.put("amount", amount);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot article = (AbstractPersistentRoot)this.getArticle();
            if (article != null) {
                result.put("article", article.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    article.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && article.hasEssentialFields())article.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("amount", new Long(this.getAmount()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public QuantifiedArticles provideCopy() throws PersistenceException{
        QuantifiedArticles result = this;
        result = new QuantifiedArticles(this.article, 
                                        this.amount, 
                                        this.subService, 
                                        this.This, 
                                        this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentArticle article;
    protected long amount;
    protected SubjInterface subService;
    protected PersistentQuantifiedArticles This;
    
    public QuantifiedArticles(PersistentArticle article,long amount,SubjInterface subService,PersistentQuantifiedArticles This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super(id);
        this.article = article;
        this.amount = amount;
        this.subService = subService;
        if (This != null && !(this.isTheSameAs(This))) this.This = This;        
    }
    
    static public long getTypeId() {
        return 124;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 124) ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade
            .newQuantifiedArticles(amount,this.getId());
        super.store();
        if(this.getArticle() != null){
            this.getArticle().store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.articleSet(this.getId(), getArticle());
        }
        if(this.getSubService() != null){
            this.getSubService().store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.subServiceSet(this.getId(), getSubService());
        }
        if(!this.isTheSameAs(this.getThis())){
            this.getThis().store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.ThisSet(this.getId(), getThis());
        }
        
    }
    
    public PersistentArticle getArticle() throws PersistenceException {
        return this.article;
    }
    public void setArticle(PersistentArticle newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.article)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.article = (PersistentArticle)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.articleSet(this.getId(), newValue);
        }
    }
    public long getAmount() throws PersistenceException {
        return this.amount;
    }
    public void setAmount(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.amountSet(this.getId(), newValue);
        this.amount = newValue;
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
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.subServiceSet(this.getId(), newValue);
        }
    }
    protected void setThis(PersistentQuantifiedArticles newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if (newValue.isTheSameAs(this)){
            this.This = null;
            return;
        }
        if(newValue.isTheSameAs(this.This)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.This = (PersistentQuantifiedArticles)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesFacade.ThisSet(this.getId(), newValue);
        }
    }
    public PersistentQuantifiedArticles getThis() throws PersistenceException {
        if(this.This == null){
            PersistentQuantifiedArticles result = (PersistentQuantifiedArticles)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentQuantifiedArticles)this.This;
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleQuantifiedArticles(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleQuantifiedArticles(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleQuantifiedArticles(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleQuantifiedArticles(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleQuantifiedArticles(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleQuantifiedArticles(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleQuantifiedArticles(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleQuantifiedArticles(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticle() != null && this.getArticle().getTheObject().getLeafInfo() != 0) return 1;
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
        this.setThis((PersistentQuantifiedArticles)This);
		if(this.isTheSameAs(This)){
			this.setArticle((PersistentArticle)final$$Fields.get("article"));
			this.setAmount((Long)final$$Fields.get("amount"));
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
    
    public void changeAmount(final long newAmount) 
				throws PersistenceException{
        getThis().setAmount(newAmount);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void deleteReserve() 
				throws PersistenceException{
        getThis().getArticle().deleteReserve(getThis().getAmount());
    }
    public long fetchPrice() 
				throws PersistenceException{
        return getThis().getArticle().getPrice() * getThis().getAmount();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    public void pack() 
				throws PersistenceException{
        getThis().getArticle().pack(getThis().getAmount());
    }
    public void reserve() 
				throws model.InsufficientStock, PersistenceException{
    	getThis().getArticle().reserve(getThis().getAmount());
    }
    /**
     * Retoures a single article in the given amount.
     */
    public void retoure(final long amount) 
				throws PersistenceException{
    	if(amount > getThis().getAmount()) {
    		getThis().setAmount(0);
    		PersistentRetoure re = Retoure.createRetoure(0, serverConstants.OrderConstants.current);
            re.getArticleList().add(QuantifiedArticles.createQuantifiedArticles(getThis().getArticle(), getThis().getAmount()));
            re.send();
    	} else {
	        getThis().setAmount(getThis().getAmount() - amount);
	        PersistentRetoure re = Retoure.createRetoure(0, serverConstants.OrderConstants.current);
	        re.getArticleList().add(QuantifiedArticles.createQuantifiedArticles(getThis().getArticle(), amount));
	        re.send();
    	}
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
