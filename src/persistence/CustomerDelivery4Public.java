package persistence;


import model.visitor.*;

public interface CustomerDelivery4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(CustomerDeliveryVisitor visitor) throws PersistenceException;
    public <R> R accept(CustomerDeliveryReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(CustomerDeliveryExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(CustomerDeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void changeExtraCharge(final long newCharge) 
				throws PersistenceException;
    public void changeTime(final long newTime) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void changeExtraChargeImplementation(final long newCharge) 
				throws PersistenceException;
    public void changeTimeImplementation(final long newTime) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;

}

