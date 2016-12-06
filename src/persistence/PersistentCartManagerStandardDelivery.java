package persistence;


public interface PersistentCartManagerStandardDelivery extends Anything, ObsInterface, AbstractPersistentProxi, CartManagerStandardDelivery4Public {
    
    public PersistentCartManager getObserver() throws PersistenceException ;
    public void setObserver(PersistentCartManager newValue) throws PersistenceException ;
    public PersistentStandardDelivery getObservee() throws PersistenceException ;
    public void setObservee(PersistentStandardDelivery newValue) throws PersistenceException ;
    public PersistentCartManagerStandardDelivery getThis() throws PersistenceException ;
    
    

}

