
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CustomerOrder extends model.Delivery implements PersistentCustomerOrder{
    
    
    public static PersistentCustomerOrder createCustomerOrder(long remainingTimeToDelivery,java.sql.Timestamp sendDate) throws PersistenceException{
        return createCustomerOrder(remainingTimeToDelivery,sendDate,false);
    }
    
    public static PersistentCustomerOrder createCustomerOrder(long remainingTimeToDelivery,java.sql.Timestamp sendDate,boolean delayed$Persistence) throws PersistenceException {
        PersistentCustomerOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
                .newDelayedCustomerOrder(remainingTimeToDelivery,sendDate);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
                .newCustomerOrder(remainingTimeToDelivery,sendDate,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("remainingTimeToDelivery", remainingTimeToDelivery);
        final$$Fields.put("sendDate", sendDate);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCustomerOrder createCustomerOrder(long remainingTimeToDelivery,java.sql.Timestamp sendDate,boolean delayed$Persistence,PersistentCustomerOrder This) throws PersistenceException {
        PersistentCustomerOrder result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
                .newDelayedCustomerOrder(remainingTimeToDelivery,sendDate);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
                .newCustomerOrder(remainingTimeToDelivery,sendDate,-1);
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
            AbstractPersistentRoot ordermngr = (AbstractPersistentRoot)this.getOrdermngr();
            if (ordermngr != null) {
                result.put("ordermngr", ordermngr.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    ordermngr.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && ordermngr.hasEssentialFields())ordermngr.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
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
                                   this.sendDate, 
                                   this.subService, 
                                   this.This, 
                                   this.ordermngr, 
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
    protected PersistentOrderManager ordermngr;
    protected CustomerOrderState myState;
    
    public CustomerOrder(long remainingTimeToDelivery,java.sql.Timestamp sendDate,SubjInterface subService,PersistentDelivery This,PersistentOrderManager ordermngr,CustomerOrderState myState,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((long)remainingTimeToDelivery,(java.sql.Timestamp)sendDate,(SubjInterface)subService,(PersistentDelivery)This,id);
        this.articleList = new CustomerOrder_ArticleListProxi(this);
        this.ordermngr = ordermngr;
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
            .newCustomerOrder(remainingTimeToDelivery,sendDate,this.getId());
        super.store();
        this.getArticleList().store();
        if(this.getOrdermngr() != null){
            this.getOrdermngr().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade.ordermngrSet(this.getId(), getOrdermngr());
        }
        if(this.getMyState() != null){
            this.getMyState().store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade.myStateSet(this.getId(), getMyState());
        }
        
    }
    
    public CustomerOrder_ArticleListProxi getArticleList() throws PersistenceException {
        return this.articleList;
    }
    public PersistentOrderManager getOrdermngr() throws PersistenceException {
        return this.ordermngr;
    }
    public void setOrdermngr(PersistentOrderManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.ordermngr)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.ordermngr = (PersistentOrderManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade.ordermngrSet(this.getId(), newValue);
        }
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
        if (this.getArticleList().getLength() > 0) return 1;
        return 0;
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCustomerOrder)This);
		if(this.isTheSameAs(This)){
			this.setRemainingTimeToDelivery((Long)final$$Fields.get("remainingTimeToDelivery"));
			this.setSendDate((java.sql.Timestamp)final$$Fields.get("sendDate"));
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
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
    public void retoure(final QuantifiedArticlesSearchList list) 
				throws PersistenceException{
        //TODO: implement method: retoure
        
    }
    
    
    // Start of section that contains overridden operations only.
    
    public void run() {
        try {
			getThis().getMyState().accept(new CustomerOrderStateVisitor() {
				@Override
				public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException {
					try {
						// wait for the delivery time to run finish
						Thread.sleep(getThis().getRemainingTimeToDelivery());
						// deliver the order
						getThis().deliver();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				@Override
				public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException {
					try {
						// wait for the acception time to run out
						Thread.sleep(arrivedOrder.getTimeToAccept());
						// return whole order
						try {
							getThis().getOrdermngr().retoureDelivery(getThis(), getThis().getArticleList().getList());
						} catch (InsufficientFunds e) {
							throw new Error(e.getMessage());
						}
					} catch (InterruptedException e) {
						// called if order is accepted
						getThis().getOrdermngr().getOrders().filter(new Predcate<PersistentCustomerOrder>() {
							@Override
							public boolean test(PersistentCustomerOrder argument) throws PersistenceException {
								return !getThis().equals(argument);
							}
						});
					}
				}
				@Override
				public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException {
					// TODO Auto-generated method stub
					
				}
			});
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
    }

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
