package persistence;



public abstract class DeliveryProxi extends PersistentProxi implements PersistentDelivery{
    
    public DeliveryProxi(long objectId) {
        super(objectId);
    }
    public DeliveryProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getRemainingTimeToDelivery() throws PersistenceException {
        return ((PersistentDelivery)this.getTheObject()).getRemainingTimeToDelivery();
    }
    public void setRemainingTimeToDelivery(long newValue) throws PersistenceException {
        ((PersistentDelivery)this.getTheObject()).setRemainingTimeToDelivery(newValue);
    }
    public abstract PersistentDelivery getThis() throws PersistenceException ;
    
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentDelivery)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentDelivery)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deliver() 
				throws PersistenceException{
        ((PersistentDelivery)this.getTheObject()).deliver();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentDelivery)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentDelivery)this.getTheObject()).initializeOnInstantiation();
    }
    public void send() 
				throws PersistenceException{
        ((PersistentDelivery)this.getTheObject()).send();
    }

    
}