
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerOrder extends model.Delivery implements PersistentCustomerOrder{
    
    
    public static PersistentCustomerOrder createCustomerOrder(long remainingTimeToDelivery) throws PersistenceException{
        return createCustomerOrder(remainingTimeToDelivery,false);
    }
    
    public static PersistentCustomerOrder createCustomerOrder(long remainingTimeToDelivery,boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
                .newDelayedCustomerOrder(remainingTimeToDelivery);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
                .newCustomerOrder(remainingTimeToDelivery,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("remainingTimeToDelivery", remainingTimeToDelivery);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCustomerOrder createCustomerOrder(long remainingTimeToDelivery,boolean delayed$Persistence,PersistentCustomerOrder This) throws PersistenceException {
        PersistentCustomerOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
                .newDelayedCustomerOrder(remainingTimeToDelivery);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
                .newCustomerOrder(remainingTimeToDelivery,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("remainingTimeToDelivery", remainingTimeToDelivery);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            result.put("articleList", this.getArticleList().getVector(allResults, depth, essentialLevel, forGUI, tdObserver, false, true));
            AbstractPersistentRoot myState = (AbstractPersistentRoot)this.getMyState();
            if (myState != null) {
                result.put("myState", myState.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myState.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myState.hasEssentialFields())myState.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CustomerOrder provideCopy() throws PersistenceException{
        CustomerOrder result = this;
        result = new CustomerOrder(this.remainingTimeToDelivery, 
                                   this.This, 
                                   this.myState, 
                                   this.getId());
        result.articleList = this.articleList.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected CustomerOrder_ArticleListProxi articleList;
    protected CustomerOrderState myState;
    
    public CustomerOrder(long remainingTimeToDelivery,PersistentDelivery This,CustomerOrderState myState,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)remainingTimeToDelivery,(PersistentDelivery)This,id);
        this.articleList = new CustomerOrder_ArticleListProxi(this);
        this.myState = myState;        
    }
    
    static public long getTypeId() {
        return 136;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 136) ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
            .newCustomerOrder(remainingTimeToDelivery,this.getId());
        super.store();
        this.getArticleList().store();
        if(this.getMyState() != null){
            this.getMyState().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade.myStateSet(this.getId(), getMyState());
        }
        
    }
    
    public CustomerOrder_ArticleListProxi getArticleList() throws PersistenceException {
        return this.articleList;
    }
    public CustomerOrderState getMyState() throws PersistenceException {
        return this.myState;
    }
    public void setMyState(CustomerOrderState newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.myState)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.myState = (CustomerOrderState)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade.myStateSet(this.getId(), newValue);
        }
    }
    public PersistentCustomerOrder getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCustomerOrder result = (PersistentCustomerOrder)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCustomerOrder)this.This;
    }
    
    public void accept(DeliveryVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrder(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrder(this);
    }
    public <E extends model.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrder(this);
    }
    public <R, E extends model.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrder(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getMyState() != null && this.getMyState().getTheObject().getLeafInfo() != 0) return 1;
        if (this.getArticleList().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerOrder)This);
		if(this.isTheSameAs(This)){
			this.setRemainingTimeToDelivery((Long)final$$Fields.get("remainingTimeToDelivery"));
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void acceptDelivery() 
				throws PersistenceException{
        //TODO: implement method: acceptDelivery
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        //TODO: implement method: copyingPrivateUserAttributes
        
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
    public void retoure() 
				throws PersistenceException{
        //TODO: implement method: retoure
        
    }
    public void send() 
				throws PersistenceException{
        //TODO: implement method: send
        
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
