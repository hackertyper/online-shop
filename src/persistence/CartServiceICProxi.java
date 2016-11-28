package persistence;



import model.visitor.*;

public class CartServiceICProxi extends CustomerServiceICProxi implements PersistentCartService{
    
    public CartServiceICProxi(long objectId) {
        super(objectId);
    }
    public CartServiceICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCartServiceFacade
            .getCartService(this.getId());
    }
    
    public long getClassId() {
        return -187;
    }
    
    public PersistentCartManager getCartMngr() throws PersistenceException {
        return ((PersistentCartService)this.getTheObject()).getCartMngr();
    }
    public void setCartMngr(PersistentCartManager newValue) throws PersistenceException {
        ((PersistentCartService)this.getTheObject()).setCartMngr(newValue);
    }
    public PersistentCartService getThis() throws PersistenceException {
        return ((PersistentCartService)this.getTheObject()).getThis();
    }
    
    public void accept(CustomerServiceVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleCartService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartService(this);
    }
    
    
    public String cartService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentCartService)this.getTheObject()).cartService_Menu_Filter(anything);
    }
    public String customerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentCartService)this.getTheObject()).customerService_Menu_Filter(anything);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).register(observee);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).signalChanged(signal);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).updateObservers(event);
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).addToCart(article, amount);
    }
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).changeAmount(article, newAmount);
    }
    public void checkOut() 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).checkOut();
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).disconnected();
    }
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).handleException(command, exception);
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).handleResult(command);
    }
    public boolean hasChanged() 
				throws PersistenceException{
        return ((PersistentCartService)this.getTheObject()).hasChanged();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).initializeOnInstantiation();
    }
    public void order(final PersistentCart cart, final PersistentCustomerDelivery deliveryMethod) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).order(cart, deliveryMethod);
    }
    public void removeFCart(final PersistentQuantifiedArticles article) 
				throws PersistenceException{
        ((PersistentCartService)this.getTheObject()).removeFCart(article);
    }

    
}
