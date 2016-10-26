package persistence;



import model.visitor.*;

public class RemovedFSaleICProxi extends PersistentInCacheProxiOptimistic implements PersistentRemovedFSale{
    
    public RemovedFSaleICProxi(long objectId) {
        super(objectId);
    }
    public RemovedFSaleICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theRemovedFSaleFacade
            .getRemovedFSale(this.getId());
    }
    
    public long getClassId() {
        return 132;
    }
    
    public PersistentRemovedFSale getThis() throws PersistenceException {
        return ((PersistentRemovedFSale)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleRemovedFSale(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRemovedFSale(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRemovedFSale(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRemovedFSale(this);
    }
    public void accept(ArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleRemovedFSale(this);
    }
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRemovedFSale(this);
    }
    public <E extends model.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRemovedFSale(this);
    }
    public <R, E extends model.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRemovedFSale(this);
    }
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException{
        return ((PersistentRemovedFSale)this.getTheObject()).getMyArticle();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentRemovedFSale)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void addToCart(final long amount, final PersistentCart cart) 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentRemovedFSale)this.getTheObject()).addToCart(amount, cart);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentRemovedFSale)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentRemovedFSale)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentRemovedFSale)this.getTheObject()).initializeOnInstantiation();
    }

    
}
