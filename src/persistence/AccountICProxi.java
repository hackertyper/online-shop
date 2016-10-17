package persistence;



import model.visitor.*;

public class AccountICProxi extends PersistentInCacheProxiOptimistic implements PersistentAccount{
    
    public AccountICProxi(long objectId) {
        super(objectId);
    }
    public AccountICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theAccountFacade
            .getAccount(this.getId());
    }
    
    public long getClassId() {
        return 101;
    }
    
    public long getLowerLimit() throws PersistenceException {
        return ((PersistentAccount)this.getTheObject()).getLowerLimit();
    }
    public void setLowerLimit(long newValue) throws PersistenceException {
        ((PersistentAccount)this.getTheObject()).setLowerLimit(newValue);
    }
    public long getBalance() throws PersistenceException {
        return ((PersistentAccount)this.getTheObject()).getBalance();
    }
    public void setBalance(long newValue) throws PersistenceException {
        ((PersistentAccount)this.getTheObject()).setBalance(newValue);
    }
    public PersistentAccount getThis() throws PersistenceException {
        return ((PersistentAccount)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAccount(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccount(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccount(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccount(this);
    }
    
    
    public PersistentCustomer getManager() 
				throws PersistenceException{
        return ((PersistentAccount)this.getTheObject()).getManager();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deposit(final long amount) 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).deposit(amount);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).initializeOnInstantiation();
    }
    public void pay(final long sum) 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).pay(sum);
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentAccount)this.getTheObject()).withdraw(amount);
    }

    
}
