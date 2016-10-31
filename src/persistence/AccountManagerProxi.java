package persistence;



import model.visitor.*;

public class AccountManagerProxi extends PersistentProxi implements PersistentAccountManager{
    
    public AccountManagerProxi(long objectId) {
        super(objectId);
    }
    public AccountManagerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 188;
    }
    
    public PersistentAccount getMyAccount() throws PersistenceException {
        return ((PersistentAccountManager)this.getTheObject()).getMyAccount();
    }
    public void setMyAccount(PersistentAccount newValue) throws PersistenceException {
        ((PersistentAccountManager)this.getTheObject()).setMyAccount(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentAccountManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentAccountManager)this.getTheObject()).setSubService(newValue);
    }
    public PersistentAccountManager getThis() throws PersistenceException {
        return ((PersistentAccountManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAccountManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleAccountManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountManager(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).deregister(observee);
    }
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        return ((PersistentAccountManager)this.getTheObject()).getCustomerManager();
    }
    public PersistentAccountService getMyAccServer() 
				throws PersistenceException{
        return ((PersistentAccountManager)this.getTheObject()).getMyAccServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deposit(final long amount) 
				throws PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).deposit(amount);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void pay(final long sum) 
				throws PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).pay(sum);
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentAccountManager)this.getTheObject()).withdraw(amount);
    }

    
}
