package persistence;



import model.visitor.*;

public class OfferedFSaleICProxi extends PersistentInCacheProxiOptimistic implements PersistentOfferedFSale{
    
    public OfferedFSaleICProxi(long objectId) {
        super(objectId);
    }
    public OfferedFSaleICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOfferedFSaleFacade
            .getOfferedFSale(this.getId());
    }
    
    public long getClassId() {
        return 110;
    }
    
    public PersistentOfferedFSale getThis() throws PersistenceException {
        return ((PersistentOfferedFSale)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOfferedFSale(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOfferedFSale(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOfferedFSale(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOfferedFSale(this);
    }
    public void accept(ArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleOfferedFSale(this);
    }
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOfferedFSale(this);
    }
    public <E extends model.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOfferedFSale(this);
    }
    public <R, E extends model.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOfferedFSale(this);
    }
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException{
        return ((PersistentOfferedFSale)this.getTheObject()).getMyArticle();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOfferedFSale)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void addToCart(final long amount, final PersistentCart cart) 
				throws PersistenceException{
        ((PersistentOfferedFSale)this.getTheObject()).addToCart(amount, cart);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOfferedFSale)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOfferedFSale)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOfferedFSale)this.getTheObject()).initializeOnInstantiation();
    }
    public void reorder(final long amount, final long manuDelivery) 
				throws PersistenceException{
        ((PersistentOfferedFSale)this.getTheObject()).reorder(amount, manuDelivery);
    }

    
}
