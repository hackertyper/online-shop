package persistence;



import model.visitor.*;

public class CartICProxi extends PersistentInCacheProxiOptimistic implements PersistentCart{
    
    public CartICProxi(long objectId) {
        super(objectId);
    }
    public CartICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCartFacade
            .getCart(this.getId());
    }
    
    public long getClassId() {
        return 203;
    }
    
    public long getCurrentSum() throws PersistenceException {
        return ((PersistentCart)this.getTheObject()).getCurrentSum();
    }
    public void setCurrentSum(long newValue) throws PersistenceException {
        ((PersistentCart)this.getTheObject()).setCurrentSum(newValue);
    }
    public PersistentCartState getState() throws PersistenceException {
        return ((PersistentCart)this.getTheObject()).getState();
    }
    public void setState(PersistentCartState newValue) throws PersistenceException {
        ((PersistentCart)this.getTheObject()).setState(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentCart)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentCart)this.getTheObject()).setSubService(newValue);
    }
    public PersistentCart getThis() throws PersistenceException {
        return ((PersistentCart)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCart(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCart(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCart(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCart(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCart(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCart(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCart(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).deregister(observee);
    }
    public PersistentCartManager getCartMngr() 
				throws PersistenceException{
        return ((PersistentCart)this.getTheObject()).getCartMngr();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).updateObservers(event);
    }
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).changeAmount(article, newAmount);
    }
    public void changeState(final PersistentCartState newState) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).changeState(newState);
    }
    public void checkOutReverse() 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).checkOutReverse();
    }
    public void checkOut() 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).checkOut();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public long fetchCurrentSum() 
				throws PersistenceException{
        return ((PersistentCart)this.getTheObject()).fetchCurrentSum();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).initializeOnInstantiation();
    }
    public void order(final PersistentCustomerDelivery deliveryMethod) 
				throws model.FirstCheckOut, model.InsufficientFunds, PersistenceException{
        ((PersistentCart)this.getTheObject()).order(deliveryMethod);
    }
    public void removeArticle(final PersistentQuantifiedArticles article) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).removeArticle(article);
    }

    
}
