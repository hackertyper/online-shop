package persistence;



import model.visitor.*;

public class ShopServiceProxi extends CustomerServiceProxi implements PersistentShopService{
    
    public ShopServiceProxi(long objectId) {
        super(objectId);
    }
    public ShopServiceProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return -185;
    }
    
    public PersistentShopManager getShopMngr() throws PersistenceException {
        return ((PersistentShopService)this.getTheObject()).getShopMngr();
    }
    public void setShopMngr(PersistentShopManager newValue) throws PersistenceException {
        ((PersistentShopService)this.getTheObject()).setShopMngr(newValue);
    }
    public PersistentShopService getThis() throws PersistenceException {
        return ((PersistentShopService)this.getTheObject()).getThis();
    }
    
    public void accept(CustomerServiceVisitor visitor) throws PersistenceException {
        visitor.handleShopService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopService(this);
    }
    public <E extends model.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopService(this);
    }
    public <R, E extends model.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopService(this);
    }
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleShopService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleShopService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleShopService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopService(this);
    }
    
    
    public String customerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentShopService)this.getTheObject()).customerService_Menu_Filter(anything);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public String shopService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentShopService)this.getTheObject()).shopService_Menu_Filter(anything);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).signalChanged(signal);
    }
    public void acceptDelivery(final PersistentCustomerOrder customerOrder) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).acceptDelivery(customerOrder);
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).addToCart(article, amount);
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).disconnected();
    }
    public void findArticle(final String description) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).findArticle(description);
    }
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).handleException(command, exception);
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).handleResult(command);
    }
    public boolean hasChanged() 
				throws PersistenceException{
        return ((PersistentShopService)this.getTheObject()).hasChanged();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).initializeOnInstantiation();
    }
    public void removeFCart(final PersistentQuantifiedArticles article, final PersistentCart cart) 
				throws PersistenceException{
        ((PersistentShopService)this.getTheObject()).removeFCart(article, cart);
    }

    
}
