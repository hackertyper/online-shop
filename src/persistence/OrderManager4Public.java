package persistence;


import model.visitor.*;

public interface OrderManager4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void acceptDelivery(final PersistentCustomerOrder arrivedOrder, final Invoker invoker) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void retoureArticle(final PersistentQuantifiedArticles article, final long amount, final Invoker invoker) 
				throws PersistenceException;
    public void retoureDelivery(final PersistentCustomerOrder arrivedOrder, final Invoker invoker) 
				throws PersistenceException;
    public void acceptDelivery(final PersistentCustomerOrder arrivedOrder) 
				throws model.NotArrived, PersistenceException;
    public void addOrder(final PersistentCustomerOrder order) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void retoureArticle(final PersistentQuantifiedArticles article, final long amount) 
				throws model.NotArrived, model.InsufficientFunds, PersistenceException;
    public void retoureDelivery(final PersistentCustomerOrder arrivedOrder) 
				throws model.NotArrived, model.InsufficientFunds, PersistenceException;

}

