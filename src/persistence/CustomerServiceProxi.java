package persistence;



import model.visitor.*;

public class CustomerServiceProxi extends ServiceProxi implements PersistentCustomerService{
    
    public CustomerServiceProxi(long objectId) {
        super(objectId);
    }
    public CustomerServiceProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return -103;
    }
    
    public PersistentCustomer getManager() throws PersistenceException {
        return ((PersistentCustomerService)this.getTheObject()).getManager();
    }
    public void setManager(PersistentCustomer newValue) throws PersistenceException {
        ((PersistentCustomerService)this.getTheObject()).setManager(newValue);
    }
    public PersistentCustomerService getThis() throws PersistenceException {
        return ((PersistentCustomerService)this.getTheObject()).getThis();
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleCustomerService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerService(this);
    }
    
    
    public String customerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentCustomerService)this.getTheObject()).customerService_Menu_Filter(anything);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).signalChanged(signal);
    }
    public void acceptDelivery(final PersistentCustomerOrder customerOrder) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).acceptDelivery(customerOrder);
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).addToCart(article, amount);
    }
    public void checkOut() 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).checkOut();
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deposit(final long amount) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).deposit(amount);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).disconnected();
    }
    public void findArticle(final String description) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).findArticle(description);
    }
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).handleException(command, exception);
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).handleResult(command);
    }
    public boolean hasChanged() 
				throws PersistenceException{
        return ((PersistentCustomerService)this.getTheObject()).hasChanged();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).initializeOnInstantiation();
    }
    public void order() 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).order();
    }
    public void removeFCart(final PersistentQuantifiedArticles article, final PersistentCart cart) 
				throws PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).removeFCart(article, cart);
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentCustomerService)this.getTheObject()).withdraw(amount);
    }

    
}