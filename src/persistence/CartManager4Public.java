package persistence;


import model.visitor.*;

public interface CartManager4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void addArticle(final PersistentArticle article, final long amount) 
				throws PersistenceException;
    public void addArticle(final PersistentArticle article, final long amount, final Invoker invoker) 
				throws PersistenceException;
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount, final Invoker invoker) 
				throws PersistenceException;
    public void checkOut(final Invoker invoker) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void order(final PersistentCustomerDelivery deliveryMethod, final Invoker invoker) 
				throws PersistenceException;
    public void removeFCart(final PersistentQuantifiedArticles article, final Invoker invoker) 
				throws PersistenceException;
    public void addArticleImplementation(final PersistentArticle article, final long amount) 
				throws PersistenceException;
    public void addOrder(final PersistentCustomerOrder order) 
				throws PersistenceException;
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException;
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount) 
				throws PersistenceException;
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void order(final PersistentCustomerDelivery deliveryMethod) 
				throws model.FirstCheckOut, model.InsufficientFunds, PersistenceException;
    public void pay(final long sum) 
				throws model.InsufficientFunds, PersistenceException;
    public void removeFCart(final PersistentQuantifiedArticles article) 
				throws PersistenceException;

}

