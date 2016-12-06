package persistence;



import model.visitor.*;

public class CartManagerOnDeliveryProxi extends PersistentProxi implements PersistentCartManagerOnDelivery{
    
    public CartManagerOnDeliveryProxi(long objectId) {
        super(objectId);
    }
    public CartManagerOnDeliveryProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 258;
    }
    
    public PersistentCartManager getObserver() throws PersistenceException {
        return ((PersistentCartManagerOnDelivery)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentCartManager newValue) throws PersistenceException {
        ((PersistentCartManagerOnDelivery)this.getTheObject()).setObserver(newValue);
    }
    public PersistentOverNightDelivery getObservee() throws PersistenceException {
        return ((PersistentCartManagerOnDelivery)this.getTheObject()).getObservee();
    }
    public void setObservee(PersistentOverNightDelivery newValue) throws PersistenceException {
        ((PersistentCartManagerOnDelivery)this.getTheObject()).setObservee(newValue);
    }
    public PersistentCartManagerOnDelivery getThis() throws PersistenceException {
        return ((PersistentCartManagerOnDelivery)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerOnDelivery(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerOnDelivery(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerOnDelivery(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerOnDelivery(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerOnDelivery(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerOnDelivery(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerOnDelivery(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerOnDelivery(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCartManagerOnDelivery)this.getTheObject()).update(event);
    }

    
}
