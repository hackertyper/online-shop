package persistence;



import model.visitor.*;

public class TestDeliveryProxi extends CustomerDeliveryProxi implements PersistentTestDelivery{
    
    public TestDeliveryProxi(long objectId) {
        super(objectId);
    }
    public TestDeliveryProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 231;
    }
    
    public PersistentTestDelivery getThis() throws PersistenceException {
        return ((PersistentTestDelivery)this.getTheObject()).getThis();
    }
    
    public void accept(CustomerDeliveryVisitor visitor) throws PersistenceException {
        visitor.handleTestDelivery(this);
    }
    public <R> R accept(CustomerDeliveryReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleTestDelivery(this);
    }
    public <E extends model.UserException>  void accept(CustomerDeliveryExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleTestDelivery(this);
    }
    public <R, E extends model.UserException> R accept(CustomerDeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleTestDelivery(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleTestDelivery(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleTestDelivery(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleTestDelivery(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleTestDelivery(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleTestDelivery(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleTestDelivery(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleTestDelivery(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleTestDelivery(this);
    }
    
    
    public void changeExtraCharge(final long newCharge) 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).changeExtraCharge(newCharge);
    }
    public void changeTime(final long newTime) 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).changeTime(newTime);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).updateObservers(event);
    }
    public void changeExtraChargeImplementation(final long newCharge) 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).changeExtraChargeImplementation(newCharge);
    }
    public void changeTimeImplementation(final long newTime) 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).changeTimeImplementation(newTime);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentTestDelivery)this.getTheObject()).initializeOnInstantiation();
    }

    
}
