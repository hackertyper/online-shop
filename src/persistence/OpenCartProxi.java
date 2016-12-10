package persistence;



import model.visitor.*;

public class OpenCartProxi extends CartStateProxi implements PersistentOpenCart{
    
    public OpenCartProxi(long objectId) {
        super(objectId);
    }
    public OpenCartProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 161;
    }
    
    public PersistentOpenCart getThis() throws PersistenceException {
        return ((PersistentOpenCart)this.getTheObject()).getThis();
    }
    
    public void accept(CartStateVisitor visitor) throws PersistenceException {
        visitor.handleOpenCart(this);
    }
    public <R> R accept(CartStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOpenCart(this);
    }
    public <E extends model.UserException>  void accept(CartStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOpenCart(this);
    }
    public <R, E extends model.UserException> R accept(CartStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOpenCart(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOpenCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOpenCart(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOpenCart(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOpenCart(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOpenCart(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOpenCart(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOpenCart(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOpenCart(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOpenCart)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOpenCart)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOpenCart)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOpenCart)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOpenCart)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOpenCart)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOpenCart)this.getTheObject()).initializeOnInstantiation();
    }

    
}
