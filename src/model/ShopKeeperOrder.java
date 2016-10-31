
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class ShopKeeperOrder extends model.Delivery implements PersistentShopKeeperOrder{
    
    
    public static PersistentShopKeeperOrder createShopKeeperOrder(long remainingTimeToDelivery,PersistentArticle article,long amount) throws PersistenceException{
        return createShopKeeperOrder(remainingTimeToDelivery,article,amount,false);
    }
    
    public static PersistentShopKeeperOrder createShopKeeperOrder(long remainingTimeToDelivery,PersistentArticle article,long amount,boolean delayed$Persistence) throws PersistenceException {
        PersistentShopKeeperOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopKeeperOrderFacade
                .newDelayedShopKeeperOrder(remainingTimeToDelivery,amount);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopKeeperOrderFacade
                .newShopKeeperOrder(remainingTimeToDelivery,amount,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("remainingTimeToDelivery", remainingTimeToDelivery);
        final$$Fields.put("article", article);
        final$$Fields.put("amount", amount);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentShopKeeperOrder createShopKeeperOrder(long remainingTimeToDelivery,PersistentArticle article,long amount,boolean delayed$Persistence,PersistentShopKeeperOrder This) throws PersistenceException {
        PersistentShopKeeperOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theShopKeeperOrderFacade
                .newDelayedShopKeeperOrder(remainingTimeToDelivery,amount);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theShopKeeperOrderFacade
                .newShopKeeperOrder(remainingTimeToDelivery,amount,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("remainingTimeToDelivery", remainingTimeToDelivery);
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
    
    public ShopKeeperOrder provideCopy() throws PersistenceException{
        ShopKeeperOrder result = this;
        result = new ShopKeeperOrder(this.remainingTimeToDelivery, 
                                     this.subService, 
                                     this.This, 
                                     this.article, 
                                     this.amount, 
                                     this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentArticle article;
    protected long amount;
    
    public ShopKeeperOrder(long remainingTimeToDelivery,SubjInterface subService,PersistentDelivery This,PersistentArticle article,long amount,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)remainingTimeToDelivery,(SubjInterface)subService,(PersistentDelivery)This,id);
        this.article = article;
        this.amount = amount;        
    }
    
    static public long getTypeId() {
        return 130;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 130) ConnectionHandler.getTheConnectionHandler().theShopKeeperOrderFacade
            .newShopKeeperOrder(remainingTimeToDelivery,amount,this.getId());
        super.store();
        if(this.getArticle() != null){
            this.getArticle().store();
            ConnectionHandler.getTheConnectionHandler().theShopKeeperOrderFacade.articleSet(this.getId(), getArticle());
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
            ConnectionHandler.getTheConnectionHandler().theShopKeeperOrderFacade.articleSet(this.getId(), newValue);
        }
    }
    public long getAmount() throws PersistenceException {
        return this.amount;
    }
    public void setAmount(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theShopKeeperOrderFacade.amountSet(this.getId(), newValue);
        this.amount = newValue;
    }
    public PersistentShopKeeperOrder getThis() throws PersistenceException {
        if(this.This == null){
            PersistentShopKeeperOrder result = (PersistentShopKeeperOrder)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentShopKeeperOrder)this.This;
    }
    
    public void accept(DeliveryVisitor visitor) throws PersistenceException {
        visitor.handleShopKeeperOrder(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopKeeperOrder(this);
    }
    public <E extends model.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopKeeperOrder(this);
    }
    public <R, E extends model.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopKeeperOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopKeeperOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopKeeperOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopKeeperOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopKeeperOrder(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopKeeperOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopKeeperOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopKeeperOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopKeeperOrder(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getArticle() != null) return 1;
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
        this.setThis((PersistentShopKeeperOrder)This);
		if(this.isTheSameAs(This)){
			this.setRemainingTimeToDelivery((Long)final$$Fields.get("remainingTimeToDelivery"));
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
    
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void deliver() 
				throws PersistenceException{
        //TODO: implement method: deliver
        
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
		//TODO: implement method: initializeOnCreation
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
		//TODO: implement method: initializeOnInstantiation
    }
    public void send() 
				throws PersistenceException{
        //TODO: implement method: send
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
