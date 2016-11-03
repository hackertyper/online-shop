package persistence;



import model.visitor.*;

public class CheckedOutProxi extends CartStateProxi implements PersistentCheckedOut{
    
    public CheckedOutProxi(long objectId) {
        super(objectId);
    }
    public CheckedOutProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 218;
    }
    
    public PersistentCheckedOut getThis() throws PersistenceException {
        return ((PersistentCheckedOut)this.getTheObject()).getThis();
    }
    
    public void accept(CartStateVisitor visitor) throws PersistenceException {
        visitor.handleCheckedOut(this);
    }
    public <R> R accept(CartStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckedOut(this);
    }
    public <E extends model.UserException>  void accept(CartStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckedOut(this);
    }
    public <R, E extends model.UserException> R accept(CartStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckedOut(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCheckedOut(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckedOut(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckedOut(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckedOut(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCheckedOut(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCheckedOut(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCheckedOut(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCheckedOut(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCheckedOut)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCheckedOut)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCheckedOut)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCheckedOut)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCheckedOut)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCheckedOut)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCheckedOut)this.getTheObject()).initializeOnInstantiation();
    }

    
}
