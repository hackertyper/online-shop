package persistence;


import model.visitor.*;

public interface Cart4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount) 
				throws PersistenceException;
    public void changeState(final PersistentCartState newState) 
				throws PersistenceException;
    public void checkOutReverse() 
				throws PersistenceException;
    public void checkOut() 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public long fetchCurrentSum() 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void order(final PersistentCustomerDelivery deliveryMethod) 
				throws model.FirstCheckOut, model.InsufficientFunds, PersistenceException;
    public void removeArticle(final PersistentQuantifiedArticles article) 
				throws PersistenceException;

}

