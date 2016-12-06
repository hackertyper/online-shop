package persistence;


public interface PersistentCartManagerOnDelivery extends Anything, ObsInterface, AbstractPersistentProxi, CartManagerOnDelivery4Public {
    
    public PersistentCartManager getObserver() throws PersistenceException ;
    public void setObserver(PersistentCartManager newValue) throws PersistenceException ;
    public PersistentOverNightDelivery getObservee() throws PersistenceException ;
    public void setObservee(PersistentOverNightDelivery newValue) throws PersistenceException ;
    public PersistentCartManagerOnDelivery getThis() throws PersistenceException ;
    
    

}

