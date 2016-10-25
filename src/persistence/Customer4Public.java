package persistence;


import model.visitor.*;

public interface Customer4Public extends Anything, AbstractPersistentProxi {
    
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void addToCart(final PersistentArticle article, final long amount, final Invoker invoker) 
				throws PersistenceException;
    public void checkOut(final Invoker invoker) 
				throws PersistenceException;
    public void deposit(final long amount, final Invoker invoker) 
				throws PersistenceException;
    public void findArticle(final String description, final Invoker invoker) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void order(final Invoker invoker) 
				throws PersistenceException;
    public void pay(final long sum, final Invoker invoker) 
				throws PersistenceException;
    public void withdraw(final long amount, final Invoker invoker) 
				throws PersistenceException;
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException;
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void deposit(final long amount) 
				throws PersistenceException;
    public void findArticle(final String description) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void order() 
				throws PersistenceException;
    public void pay(final long sum) 
				throws PersistenceException;
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException;

}

