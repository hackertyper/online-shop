package persistence;



import model.visitor.*;

public class CustomerManagerProxi extends PersistentProxi implements PersistentCustomerManager{
    
    public CustomerManagerProxi(long objectId) {
        super(objectId);
    }
    public CustomerManagerProxi(PersistentInCacheProxi object) {
        super(object);
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
    
    
    public void acceptDelivery(final PersistentCustomerOrder customerOrder, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).acceptDelivery(customerOrder, invoker);
    }
    public void addToCart(final PersistentArticle article, final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).addToCart(article, amount, invoker);
    }
    public void checkOut(final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).checkOut(invoker);
    }
    public void deposit(final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).deposit(amount, invoker);
    }
    public void findArticle(final String description, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).findArticle(description, invoker);
    }
    public PersistentCustomerService getMyServer() 
				throws PersistenceException{
        return ((PersistentCustomerManager)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void order(final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).order(invoker);
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
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).checkOut();
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
    public void order() 
				throws PersistenceException{
        ((PersistentCustomerManager)this.getTheObject()).order();
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
