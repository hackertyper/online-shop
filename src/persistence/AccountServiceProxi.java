package persistence;



import model.visitor.*;

public class AccountServiceProxi extends CustomerServiceProxi implements PersistentAccountService{
    
    public AccountServiceProxi(long objectId) {
        super(objectId);
    }
    public AccountServiceProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return -186;
    }
    
    public PersistentAccountManager getAccMngr() throws PersistenceException {
        return ((PersistentAccountService)this.getTheObject()).getAccMngr();
    }
    public void setAccMngr(PersistentAccountManager newValue) throws PersistenceException {
        ((PersistentAccountService)this.getTheObject()).setAccMngr(newValue);
    }
    public PersistentAccountService getThis() throws PersistenceException {
        return ((PersistentAccountService)this.getTheObject()).getThis();
    }
    
    public void accept(CustomerServiceVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleAccountService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleAccountService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleAccountService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleAccountService(this);
    }
    
    
    public String accountService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentAccountService)this.getTheObject()).accountService_Menu_Filter(anything);
    }
    public String customerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentAccountService)this.getTheObject()).customerService_Menu_Filter(anything);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).register(observee);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).signalChanged(signal);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).updateObservers(event);
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deposit(final long amount) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).deposit(amount);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).disconnected();
    }
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).handleException(command, exception);
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).handleResult(command);
    }
    public boolean hasChanged() 
				throws PersistenceException{
        return ((PersistentAccountService)this.getTheObject()).hasChanged();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).initializeOnInstantiation();
    }
    public void signalChanged() 
				throws PersistenceException{
        ((PersistentAccountService)this.getTheObject()).signalChanged();
    }
    public void withdraw(final long amount) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentAccountService)this.getTheObject()).withdraw(amount);
    }

    
}
