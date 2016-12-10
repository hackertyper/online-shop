package persistence;



import model.visitor.*;

public class AccountProxi extends PersistentProxi implements PersistentAccount{
    
    public AccountProxi(long objectId) {
        super(objectId);
    }
    public AccountProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 148;
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
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentAccount)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentAccount)this.getTheObject()).setSubService(newValue);
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
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleAccount(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccount(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccount(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccount(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).deregister(observee);
    }
    public PersistentAccountManager getAccMngr() 
				throws PersistenceException{
        return ((PersistentAccount)this.getTheObject()).getAccMngr();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).updateObservers(event);
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
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentAccount)this.getTheObject()).pay(sum);
    }
    public void returnPayment(final long sum) 
				throws PersistenceException{
        ((PersistentAccount)this.getTheObject()).returnPayment(sum);
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentAccount)this.getTheObject()).withdraw(amount);
    }

    
}
