package persistence;


import model.visitor.*;

public interface Article4Public extends Item4Public {
    
    
    public void accept(ItemVisitor visitor) throws PersistenceException;
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void changeManuDelivery(final long newManuDelivery, final Invoker invoker) 
				throws PersistenceException;
    public void changePrice(final long newPrice, final Invoker invoker) 
				throws PersistenceException;
    public void changeProductGroup(final PersistentProductGroup newPG, final Invoker invoker) 
				throws PersistenceException;
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public void addToCart(final long amount, final PersistentCart cart) 
				throws PersistenceException;
    public void changeManuDelivery(final long newManuDelivery) 
				throws PersistenceException;
    public void changePrice(final long newPrice) 
				throws PersistenceException;
    public void changeProductGroup(final PersistentProductGroup newPG) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void pack(final long amount) 
				throws PersistenceException;
    public void reserve(final long amount) 
				throws model.InsufficientStock, PersistenceException;

}

