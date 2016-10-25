package persistence;



import model.visitor.*;

public class ManufacturerICProxi extends PersistentInCacheProxiOptimistic implements PersistentManufacturer{
    
    public ManufacturerICProxi(long objectId) {
        super(objectId);
    }
    public ManufacturerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theManufacturerFacade
            .getManufacturer(this.getId());
    }
    
    public long getClassId() {
        return 153;
    }
    
    public String getName() throws PersistenceException {
        return ((PersistentManufacturer)this.getTheObject()).getName();
    }
    public void setName(String newValue) throws PersistenceException {
        ((PersistentManufacturer)this.getTheObject()).setName(newValue);
    }
    public PersistentManufacturer getThis() throws PersistenceException {
        return ((PersistentManufacturer)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleManufacturer(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleManufacturer(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleManufacturer(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleManufacturer(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentManufacturer)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentManufacturer)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentManufacturer)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentManufacturer)this.getTheObject()).initializeOnInstantiation();
    }

    
}
