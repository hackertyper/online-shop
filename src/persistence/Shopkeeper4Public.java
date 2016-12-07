package persistence;


import model.visitor.*;

public interface Shopkeeper4Public extends Anything, SubjInterface, AbstractPersistentProxi {
    
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void changeCharge(final PersistentCustomerDelivery cd, final long newCharge, final Invoker invoker) 
				throws PersistenceException;
    public void changeDescription(final PersistentItem item, final String newDescription) 
				throws PersistenceException;
    public void changeDescription(final PersistentItem item, final String newDescription, final Invoker invoker) 
				throws PersistenceException;
    public void changePrice(final PersistentArticle article, final long newPrice) 
				throws PersistenceException;
    public void changePrice(final PersistentArticle article, final long newPrice, final Invoker invoker) 
				throws PersistenceException;
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException;
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG, final Invoker invoker) 
				throws PersistenceException;
    public void changeRetourePercentage(final long newPercentage, final Invoker invoker) 
				throws PersistenceException;
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime, final Invoker invoker) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void presetBalance(final long amount, final Invoker invoker) 
				throws PersistenceException;
    public void presetLowerLimit(final long amount, final Invoker invoker) 
				throws PersistenceException;
    public void changeCharge(final PersistentCustomerDelivery cd, final long newCharge) 
				throws PersistenceException;
    public void changeDescriptionImplementation(final PersistentItem item, final String newDescription) 
				throws PersistenceException;
    public void changePriceImplementation(final PersistentArticle article, final long newPrice) 
				throws PersistenceException;
    public void changeProductGroupImplementation(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException;
    public void changeRetourePercentage(final long newPercentage) 
				throws PersistenceException;
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void presetBalance(final long amount) 
				throws PersistenceException;
    public void presetLowerLimit(final long amount) 
				throws PersistenceException;

}

