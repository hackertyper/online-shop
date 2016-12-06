package persistence;



import model.visitor.*;

public class CartManagerStandardDeliveryICProxi extends PersistentInCacheProxiOptimistic implements PersistentCartManagerStandardDelivery{
    
    public CartManagerStandardDeliveryICProxi(long objectId) {
        super(objectId);
    }
    public CartManagerStandardDeliveryICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCartManagerStandardDeliveryFacade
            .getCartManagerStandardDelivery(this.getId());
    }
    
    public long getClassId() {
        return 259;
    }
    
    public PersistentCartManager getObserver() throws PersistenceException {
        return ((PersistentCartManagerStandardDelivery)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentCartManager newValue) throws PersistenceException {
        ((PersistentCartManagerStandardDelivery)this.getTheObject()).setObserver(newValue);
    }
    public PersistentStandardDelivery getObservee() throws PersistenceException {
        return ((PersistentCartManagerStandardDelivery)this.getTheObject()).getObservee();
    }
    public void setObservee(PersistentStandardDelivery newValue) throws PersistenceException {
        ((PersistentCartManagerStandardDelivery)this.getTheObject()).setObservee(newValue);
    }
    public PersistentCartManagerStandardDelivery getThis() throws PersistenceException {
        return ((PersistentCartManagerStandardDelivery)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerStandardDelivery(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerStandardDelivery(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerStandardDelivery(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerStandardDelivery(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerStandardDelivery(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerStandardDelivery(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerStandardDelivery(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerStandardDelivery(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCartManagerStandardDelivery)this.getTheObject()).update(event);
    }

    
}
