package persistence;



import model.visitor.*;

public class RegisterServiceICProxi extends ServiceICProxi implements PersistentRegisterService{
    
    public RegisterServiceICProxi(long objectId) {
        super(objectId);
    }
    public RegisterServiceICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theRegisterServiceFacade
            .getRegisterService(this.getId());
    }
    
    public long getClassId() {
        return -142;
    }
    
    public PersistentRegisterService getThis() throws PersistenceException {
        return ((PersistentRegisterService)this.getTheObject()).getThis();
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleRegisterService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRegisterService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRegisterService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleRegisterService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRegisterService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRegisterService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleRegisterService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRegisterService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRegisterService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleRegisterService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRegisterService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRegisterService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleRegisterService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRegisterService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRegisterService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRegisterService(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public String registerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentRegisterService)this.getTheObject()).registerService_Menu_Filter(anything);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).register(observee);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).signalChanged(signal);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).updateObservers(event);
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).disconnected();
    }
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).handleException(command, exception);
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).handleResult(command);
    }
    public boolean hasChanged() 
				throws PersistenceException{
        return ((PersistentRegisterService)this.getTheObject()).hasChanged();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).initializeOnInstantiation();
    }
    public void register(final String accountName, final String password) 
				throws model.DuplicateUsername, PersistenceException{
        ((PersistentRegisterService)this.getTheObject()).register(accountName, password);
    }

    
}
