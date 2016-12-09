package persistence;



import model.visitor.*;

public class OrderServiceICProxi extends CustomerServiceICProxi implements PersistentOrderService{
    
    public OrderServiceICProxi(long objectId) {
        super(objectId);
    }
    public OrderServiceICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOrderServiceFacade
            .getOrderService(this.getId());
    }
    
    public long getClassId() {
        return -223;
    }
    
    public PersistentOrderManager getOrderMngr() throws PersistenceException {
        return ((PersistentOrderService)this.getTheObject()).getOrderMngr();
    }
    public void setOrderMngr(PersistentOrderManager newValue) throws PersistenceException {
        ((PersistentOrderService)this.getTheObject()).setOrderMngr(newValue);
    }
    public PersistentOrderService getThis() throws PersistenceException {
        return ((PersistentOrderService)this.getTheObject()).getThis();
    }
    
    public void accept(CustomerServiceVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(CustomerServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(CustomerServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(CustomerServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleOrderService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderService(this);
    }
    
    
    public String customerService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentOrderService)this.getTheObject()).customerService_Menu_Filter(anything);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public String orderService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentOrderService)this.getTheObject()).orderService_Menu_Filter(anything);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).register(observee);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).signalChanged(signal);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).updateObservers(event);
    }
    public void acceptDelivery(final PersistentCustomerOrder customerOrder) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).acceptDelivery(customerOrder);
    }
    public void cancel(final PersistentPreOrder preOrder) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).cancel(preOrder);
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).disconnected();
    }
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).handleException(command, exception);
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).handleResult(command);
    }
    public boolean hasChanged() 
				throws PersistenceException{
        return ((PersistentOrderService)this.getTheObject()).hasChanged();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).initializeOnInstantiation();
    }
    public void preorder(final PersistentPreOrder preOrder, final PersistentCustomerDelivery deliveryMethod) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).preorder(preOrder, deliveryMethod);
    }
    public void retoureArticle(final PersistentQuantifiedArticles article, final long amount) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).retoureArticle(article, amount);
    }
    public void retoureDelivery(final PersistentCustomerOrder customerOrder) 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).retoureDelivery(customerOrder);
    }
    public void signalChanged() 
				throws PersistenceException{
        ((PersistentOrderService)this.getTheObject()).signalChanged();
    }

    
}
