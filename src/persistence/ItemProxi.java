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
    public abstract PersistentItem getThis() throws PersistenceException ;
    
    
    
    public void changeDescription(final String newDescription, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).changeDescription(newDescription, invoker);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentItem)this.getTheObject()).initialize(This, final$$Fields);
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
