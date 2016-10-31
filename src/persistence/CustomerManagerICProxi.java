package persistence;



import model.visitor.*;

public class CustomerManagerICProxi extends PersistentInCacheProxiOptimistic implements PersistentCustomerManager{
    
    public CustomerManagerICProxi(long objectId) {
        super(objectId);
    }
    public CustomerManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerManagerFacade
            .getCustomerManager(this.getId());
    }
    
    public long getClassId() {
        return 184;
    }
    
    public PersistentShopManager getShopMngr() throws PersistenceException {
        return ((PersistentCustomerManager)this.getTheObject()).getShopMngr();
    }
    public void setShopMngr(PersistentShopManager newValue) throws PersistenceException {
        ((PersistentCustomerManager)this.getTheObject()).setShopMngr(newValue);
    }
    public PersistentAccountManager getAccMngr() throws PersistenceException {
        return ((PersistentCustomerManager)this.getTheObject()).getAccMngr();
    }
    public void setAccMngr(PersistentAccountManager newValue) throws PersistenceException {
        ((PersistentCustomerManager)this.getTheObject()).setAccMngr(newValue);
    }
    public PersistentCartManager getCartMngr() throws PersistenceException {
        return ((PersistentCustomerManager)this.getTheObject()).getCartMngr();
    }
    public void setCartMngr(PersistentCartManager newValue) throws PersistenceException {
        ((PersistentCustomerManager)this.getTheObject()).setCartMngr(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentCustomerManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentCustomerManager)this.getTheObject()).setSubService(newValue);
    }
    public PersistentCustomerManager getThis() throws PersistenceException {
        return ((PersistentCustomerManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerManager(this);
    }
    
    
    public void acceptDelivery(final PersistentCustomerOrder customerOrder, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).acceptDelivery(customerOrder, invoker);
    }
    public void deposit(final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).deposit(amount, invoker);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).deregister(observee);
    }
    public void findArticle(final String description, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).findArticle(description, invoker);
    }
    public PersistentCustomerService getMyCustomerServer() 
				throws PersistenceException{
        return ((PersistentCustomerManager)this.getTheObject()).getMyCustomerServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).updateObservers(event);
    }
    public void withdraw(final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).withdraw(amount, invoker);
    }
    public void acceptDelivery(final PersistentCustomerOrder customerOrder) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).acceptDelivery(customerOrder);
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).addToCart(article, amount);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deposit(final long amount) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).deposit(amount);
    }
    public void findArticle(final String description) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).findArticle(description);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void pay(final long sum) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).pay(sum);
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).withdraw(amount);
    }

    
}
