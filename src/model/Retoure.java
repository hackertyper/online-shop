
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class Retoure extends model.Delivery implements PersistentRetoure{
    
    
    public static PersistentRetoure createRetoure(long remainingTimeToDelivery,java.sql.Timestamp sendDate) throws PersistenceException{
        return createRetoure(remainingTimeToDelivery,sendDate,false);
    }
    
    public static PersistentRetoure createRetoure(long remainingTimeToDelivery,java.sql.Timestamp sendDate,boolean delayed$Persistence) throws PersistenceException {
        PersistentRetoure result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theRetoureFacade
                .newDelayedRetoure(remainingTimeToDelivery,sendDate);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theRetoureFacade
                .newRetoure(remainingTimeToDelivery,sendDate,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("remainingTimeToDelivery", remainingTimeToDelivery);
        final$$Fields.put("sendDate", sendDate);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentRetoure createRetoure(long remainingTimeToDelivery,java.sql.Timestamp sendDate,boolean delayed$Persistence,PersistentRetoure This) throws PersistenceException {
        PersistentRetoure result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theRetoureFacade
                .newDelayedRetoure(remainingTimeToDelivery,sendDate);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theRetoureFacade
                .newRetoure(remainingTimeToDelivery,sendDate,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("remainingTimeToDelivery", remainingTimeToDelivery);
        final$$Fields.put("sendDate", sendDate);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("articleList", this.getArticleList().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Retoure provideCopy() throws PersistenceException{
        Retoure result = this;
        result = new Retoure(this.remainingTimeToDelivery, 
                             this.sendDate, 
                             this.subService, 
                             this.This, 
                             this.getId());
        result.articleList = this.articleList.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected Retoure_ArticleListProxi articleList;
    
    public Retoure(long remainingTimeToDelivery,java.sql.Timestamp sendDate,SubjInterface subService,PersistentDelivery This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)remainingTimeToDelivery,(java.sql.Timestamp)sendDate,(SubjInterface)subService,(PersistentDelivery)This,id);
        this.articleList = new Retoure_ArticleListProxi(this);        
    }
    
    static public long getTypeId() {
        return 134;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 134) ConnectionHandler.getTheConnectionHandler().theRetoureFacade
            .newRetoure(remainingTimeToDelivery,sendDate,this.getId());
        super.store();
        this.getArticleList().store();
        
    }
    
    public Retoure_ArticleListProxi getArticleList() throws PersistenceException {
        return this.articleList;
    }
    public PersistentRetoure getThis() throws PersistenceException {
        if(this.This == null){
            PersistentRetoure result = (PersistentRetoure)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentRetoure)this.This;
    }
    
    public void accept(DeliveryVisitor visitor) throws PersistenceException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoure(this);
    }
    public <E extends model.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends model.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoure(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoure(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoure(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoure(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoure(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticleList().getLength() > 0) return 1;
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
        this.setThis((PersistentRetoure)This);
		if(this.isTheSameAs(This)){
			this.setRemainingTimeToDelivery((Long)final$$Fields.get("remainingTimeToDelivery"));
			this.setSendDate((java.sql.Timestamp)final$$Fields.get("sendDate"));
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
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void deliver() 
				throws PersistenceException{
    	getThis().getArticleList().applyToAll(new Procdure<PersistentQuantifiedArticles>() {
			@Override
			public void doItTo(PersistentQuantifiedArticles argument) throws PersistenceException {
				argument.getArticle().receiveDelivery(argument.getAmount());
			}
		});
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
