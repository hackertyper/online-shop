
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class CheckedOut extends model.CartState implements PersistentCheckedOut{
    
    
    public static PersistentCheckedOut createCheckedOut() throws PersistenceException{
        return createCheckedOut(false);
    }
    
    public static PersistentCheckedOut createCheckedOut(boolean delayed$Persistence) throws PersistenceException {
        PersistentCheckedOut result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCheckedOutFacade
                .newDelayedCheckedOut();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCheckedOutFacade
                .newCheckedOut(-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentCheckedOut createCheckedOut(boolean delayed$Persistence,PersistentCheckedOut This) throws PersistenceException {
        PersistentCheckedOut result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theCheckedOutFacade
                .newDelayedCheckedOut();
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theCheckedOutFacade
                .newCheckedOut(-1);
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
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public CheckedOut provideCopy() throws PersistenceException{
        CheckedOut result = this;
        result = new CheckedOut(this.subService, 
                                this.This, 
                                this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    
    public CheckedOut(SubjInterface subService,PersistentCartState This,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((SubjInterface)subService,(PersistentCartState)This,id);        
    }
    
    static public long getTypeId() {
        return 215;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 215) ConnectionHandler.getTheConnectionHandler().theCheckedOutFacade
            .newCheckedOut(this.getId());
        super.store();
        
    }
    
    public PersistentCheckedOut getThis() throws PersistenceException {
        if(this.This == null){
            PersistentCheckedOut result = (PersistentCheckedOut)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentCheckedOut)this.This;
    }
    
    public void accept(CartStateVisitor visitor) throws PersistenceException {
        visitor.handleCheckedOut(this);
    }
    public <R> R accept(CartStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckedOut(this);
    }
    public <E extends model.UserException>  void accept(CartStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckedOut(this);
    }
    public <R, E extends model.UserException> R accept(CartStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckedOut(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCheckedOut(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckedOut(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckedOut(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckedOut(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCheckedOut(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckedOut(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckedOut(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckedOut(this);
    }
    public int getLeafInfo() throws PersistenceException{
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
        this.setThis((PersistentCheckedOut)This);
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
    public void initializeOnCreation() 
				throws PersistenceException{
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
    }
    
    
    // Start of section that contains overridden operations only.
    

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
