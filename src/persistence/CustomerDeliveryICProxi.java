package persistence;



public abstract class CustomerDeliveryICProxi extends PersistentInCacheProxiOptimistic implements PersistentCustomerDelivery{
    
    public CustomerDeliveryICProxi(long objectId) {
        super(objectId);
    }
    public CustomerDeliveryICProxi(PersistentObject object) {
        super(object);
    }
    
    
    public long getTime() throws PersistenceException {
        return ((PersistentCustomerDelivery)this.getTheObject()).getTime();
    }
    public void setTime(long newValue) throws PersistenceException {
        ((PersistentCustomerDelivery)this.getTheObject()).setTime(newValue);
    }
    public long getExtraCharge() throws PersistenceException {
        return ((PersistentCustomerDelivery)this.getTheObject()).getExtraCharge();
    }
    public void setExtraCharge(long newValue) throws PersistenceException {
        ((PersistentCustomerDelivery)this.getTheObject()).setExtraCharge(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentCustomerDelivery)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentCustomerDelivery)this.getTheObject()).setSubService(newValue);
    }
    public abstract PersistentCustomerDelivery getThis() throws PersistenceException ;
    
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerDelivery)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerDelivery)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerDelivery)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerDelivery)this.getTheObject()).updateObservers(event);
    }
    public void changeExtraCharge(final long newCharge) 
				throws PersistenceException{
        ((PersistentCustomerDelivery)this.getTheObject()).changeExtraCharge(newCharge);
    }
    public void changeTime(final long newTime) 
				throws PersistenceException{
        ((PersistentCustomerDelivery)this.getTheObject()).changeTime(newTime);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerDelivery)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerDelivery)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerDelivery)this.getTheObject()).initializeOnInstantiation();
    }

    
}
