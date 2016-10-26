package persistence;



import model.visitor.*;

public class CartManagerICProxi extends PersistentInCacheProxiOptimistic implements PersistentCartManager{
    
    public CartManagerICProxi(long objectId) {
        super(objectId);
    }
    public CartManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCartManagerFacade
            .getCartManager(this.getId());
    }
    
    public long getClassId() {
        return 190;
    }
    
    public PersistentCart getMyCart() throws PersistenceException {
        return ((PersistentCartManager)this.getTheObject()).getMyCart();
    }
    public void setMyCart(PersistentCart newValue) throws PersistenceException {
        ((PersistentCartManager)this.getTheObject()).setMyCart(newValue);
    }
    public PersistentCartManager getThis() throws PersistenceException {
        return ((PersistentCartManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManager(this);
    }
    
    
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        return ((PersistentCartManager)this.getTheObject()).getCustomerManager();
    }
    public PersistentCartService getMyCartServer() 
				throws PersistenceException{
        return ((PersistentCartManager)this.getTheObject()).getMyCartServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).addToCart(article, amount);
    }
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentCartManager)this.getTheObject()).checkOut();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void order() 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).order();
    }

    
}
