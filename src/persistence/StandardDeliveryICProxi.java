package persistence;



import model.visitor.*;

public class StandardDeliveryICProxi extends CustomerDeliveryICProxi implements PersistentStandardDelivery{
    
    public StandardDeliveryICProxi(long objectId) {
        super(objectId);
    }
    public StandardDeliveryICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theStandardDeliveryFacade
            .getStandardDelivery(this.getId());
    }
    
    public long getClassId() {
        return 229;
    }
    
    public PersistentStandardDelivery getThis() throws PersistenceException {
        return ((PersistentStandardDelivery)this.getTheObject()).getThis();
    }
    
    public void accept(CustomerDeliveryVisitor visitor) throws PersistenceException {
        visitor.handleStandardDelivery(this);
    }
    public <R> R accept(CustomerDeliveryReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStandardDelivery(this);
    }
    public <E extends model.UserException>  void accept(CustomerDeliveryExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStandardDelivery(this);
    }
    public <R, E extends model.UserException> R accept(CustomerDeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStandardDelivery(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleStandardDelivery(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStandardDelivery(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStandardDelivery(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStandardDelivery(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleStandardDelivery(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleStandardDelivery(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleStandardDelivery(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleStandardDelivery(this);
    }
    
    
    public void changeExtraCharge(final long newCharge) 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).changeExtraCharge(newCharge);
    }
    public void changeTime(final long newTime) 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).changeTime(newTime);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).updateObservers(event);
    }
    public void changeExtraChargeImplementation(final long newCharge) 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).changeExtraChargeImplementation(newCharge);
    }
    public void changeTimeImplementation(final long newTime) 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).changeTimeImplementation(newTime);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentStandardDelivery)this.getTheObject()).initializeOnInstantiation();
    }

    
}
