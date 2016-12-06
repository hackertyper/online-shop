package persistence;



public abstract class ItemProxi extends PersistentProxi implements PersistentItem{
    
    public ItemProxi(long objectId) {
        super(objectId);
    }
    public ItemProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public String getDescription() throws PersistenceException {
        return ((PersistentItem)this.getTheObject()).getDescription();
    }
    public void setDescription(String newValue) throws PersistenceException {
        ((PersistentItem)this.getTheObject()).setDescription(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentItem)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentItem)this.getTheObject()).setSubService(newValue);
    }
    public abstract PersistentItem getThis() throws PersistenceException ;
    
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).updateObservers(event);
    }
    public void changeDescription(final String newDescription) 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).changeDescription(newDescription);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).initializeOnInstantiation();
    }

    
}
