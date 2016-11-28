package persistence;



import model.visitor.*;

public class OverNightDeliveryICProxi extends CustomerDeliveryICProxi implements PersistentOverNightDelivery{
    
    public OverNightDeliveryICProxi(long objectId) {
        super(objectId);
    }
    public OverNightDeliveryICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOverNightDeliveryFacade
            .getOverNightDelivery(this.getId());
    }
    
    public long getClassId() {
        return 228;
    }
    
    public PersistentOverNightDelivery getThis() throws PersistenceException {
        return ((PersistentOverNightDelivery)this.getTheObject()).getThis();
    }
    
    public void accept(CustomerDeliveryVisitor visitor) throws PersistenceException {
        visitor.handleOverNightDelivery(this);
    }
    public <R> R accept(CustomerDeliveryReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOverNightDelivery(this);
    }
    public <E extends model.UserException>  void accept(CustomerDeliveryExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOverNightDelivery(this);
    }
    public <R, E extends model.UserException> R accept(CustomerDeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOverNightDelivery(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOverNightDelivery(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOverNightDelivery(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOverNightDelivery(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOverNightDelivery(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOverNightDelivery(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOverNightDelivery(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOverNightDelivery(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOverNightDelivery(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOverNightDelivery)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOverNightDelivery)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOverNightDelivery)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOverNightDelivery)this.getTheObject()).updateObservers(event);
    }
    public void changeExtraCharge(final long newCharge) 
				throws PersistenceException{
        ((PersistentOverNightDelivery)this.getTheObject()).changeExtraCharge(newCharge);
    }
    public void changeTime(final long newTime) 
				throws PersistenceException{
        ((PersistentOverNightDelivery)this.getTheObject()).changeTime(newTime);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOverNightDelivery)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOverNightDelivery)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOverNightDelivery)this.getTheObject()).initializeOnInstantiation();
    }

    
}
