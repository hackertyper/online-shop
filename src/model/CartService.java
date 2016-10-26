
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CartService extends model.CustomerService implements PersistentCartService{
    
    
    public static PersistentCartService createCartService() throws PersistenceException{
        return createCartService(false);
    }
    
    public static PersistentCartService createCartService(boolean delayed$Persistence) throws PersistenceException {
        PersistentCartService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCartServiceFacade
                .newDelayedCartService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCartServiceFacade
                .newCartService(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCartService createCartService(boolean delayed$Persistence,PersistentCartService This) throws PersistenceException {
        PersistentCartService result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCartServiceFacade
                .newDelayedCartService();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCartServiceFacade
                .newCartService(-1);
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
    
    public CartService provideCopy() throws PersistenceException{
        CartService result = this;
        result = new CartService(this.This, 
                                 this.manager, 
                                 this.cartMngr, 
                                 this.getId());
        result.errors = this.errors.copy(result);
        result.errors = this.errors.copy(result);
        result.services = this.services.copy(result);
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentCartManager cartMngr;
    
    public CartService(PersistentService This,PersistentCustomerManager manager,PersistentCartManager cartMngr,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((PersistentService)This,(PersistentCustomerManager)manager,id);
        this.cartMngr = cartMngr;        
    }
    
    static public long getTypeId() {
        return -187;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == -187) ConnectionHandler.getTheConnectionHandler().theCartServiceFacade
            .newCartService(this.getId());
        super.store();
        if(this.getCartMngr() != null){
            this.getCartMngr().store();
            ConnectionHandler.getTheConnectionHandler().theCartServiceFacade.cartMngrSet(this.getId(), getCartMngr());
        }
        
    }
    
    public PersistentCartManager getCartMngr() throws PersistenceException {
        return this.cartMngr;
    }
    public void setCartMngr(PersistentCartManager newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.cartMngr)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.cartMngr = (PersistentCartManager)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theCartServiceFacade.cartMngrSet(this.getId(), newValue);
        }
    }
    public PersistentCartService getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCartService result = (PersistentCartService)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCartService)this.This;
    }
    
    public void accept(CustomerServiceVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getManager() != null && this.getManager().getTheObject().getLeafInfo() != 0) return 1;
        if (this.getCartMngr() != null && this.getCartMngr().getTheObject().getLeafInfo() != 0) return 1;
        if (this.getServices().getLength() > 0) return 1;
        return 0;
    }
    
    
    public String cartService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        String result = "+++";
		return result;
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentCartService)This);
		if(this.isTheSameAs(This)){
		}
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void checkOut() 
				throws PersistenceException{
        getThis().getManager().checkOut(getThis());
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
        getThis().setCartMngr(super.getManager().getCartMngr());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    public void order() 
				throws PersistenceException{
        getThis().getManager().order(getThis());
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
