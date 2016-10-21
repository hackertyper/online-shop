package persistence;



import model.visitor.*;

public class CustomerProxi extends PersistentProxi implements PersistentCustomer{
    
    public CustomerProxi(long objectId) {
        super(objectId);
    }
    public CustomerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 106;
    }
    
    public PersistentAccount getMyAccount() throws PersistenceException {
        return ((PersistentCustomer)this.getTheObject()).getMyAccount();
    }
    public void setMyAccount(PersistentAccount newValue) throws PersistenceException {
        ((PersistentCustomer)this.getTheObject()).setMyAccount(newValue);
    }
    public PersistentCart getMyCart() throws PersistenceException {
        return ((PersistentCustomer)this.getTheObject()).getMyCart();
    }
    public void setMyCart(PersistentCart newValue) throws PersistenceException {
        ((PersistentCustomer)this.getTheObject()).setMyCart(newValue);
    }
    public Customer_ItemRangeProxi getItemRange() throws PersistenceException {
        return ((PersistentCustomer)this.getTheObject()).getItemRange();
    }
    public PersistentCustomer getThis() throws PersistenceException {
        return ((PersistentCustomer)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomer(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomer(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomer(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomer(this);
    }
    
    
    public void addToCart(final PersistentArticle article, final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).addToCart(article, amount, invoker);
    }
    public void checkOut(final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).checkOut(invoker);
    }
    public void deposit(final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).deposit(amount, invoker);
    }
    public void findArticle(final String description, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).findArticle(description, invoker);
    }
    public PersistentCustomerService getMyServer() 
				throws PersistenceException{
        return ((PersistentCustomer)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void order(final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).order(invoker);
    }
    public void pay(final long sum, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).pay(sum, invoker);
    }
    public void withdraw(final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).withdraw(amount, invoker);
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentCustomer)this.getTheObject()).addToCart(article, amount);
    }
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentCustomer)this.getTheObject()).checkOut();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deposit(final long amount) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).deposit(amount);
    }
    public void findArticle(final String description) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).findArticle(description);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).initializeOnInstantiation();
    }
    public void order() 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).order();
    }
    public void pay(final long sum) 
				throws PersistenceException{
        ((PersistentCustomer)this.getTheObject()).pay(sum);
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentCustomer)this.getTheObject()).withdraw(amount);
    }

    
}
