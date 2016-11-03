package persistence;



import model.visitor.*;

public class OrderManagerICProxi extends PersistentInCacheProxiOptimistic implements PersistentOrderManager{
    
    public OrderManagerICProxi(long objectId) {
        super(objectId);
    }
    public OrderManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theOrderManagerFacade
            .getOrderManager(this.getId());
    }
    
    public long getClassId() {
        return 224;
    }
    
    public OrderManager_OrdersProxi getOrders() throws PersistenceException {
        return ((PersistentOrderManager)this.getTheObject()).getOrders();
    }
    public long getRetourePrice() throws PersistenceException {
        return ((PersistentOrderManager)this.getTheObject()).getRetourePrice();
    }
    public void setRetourePrice(long newValue) throws PersistenceException {
        ((PersistentOrderManager)this.getTheObject()).setRetourePrice(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentOrderManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentOrderManager)this.getTheObject()).setSubService(newValue);
    }
    public PersistentOrderManager getThis() throws PersistenceException {
        return ((PersistentOrderManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleOrderManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleOrderManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleOrderManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleOrderManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleOrderManager(this);
    }
    
    
    public void acceptDelivery(final PersistentCustomerOrder arrivedOrder, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).acceptDelivery(arrivedOrder, invoker);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).deregister(observee);
    }
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        return ((PersistentOrderManager)this.getTheObject()).getCustomerManager();
    }
    public PersistentOrderService getMyOrderServer() 
				throws PersistenceException{
        return ((PersistentOrderManager)this.getTheObject()).getMyOrderServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).register(observee);
    }
    public void retoureDelivery(final PersistentCustomerOrder arrivedOrder, final QuantifiedArticlesSearchList list, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).retoureDelivery(arrivedOrder, list, invoker);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).updateObservers(event);
    }
    public void acceptDelivery(final PersistentCustomerOrder arrivedOrder) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).acceptDelivery(arrivedOrder);
    }
    public void addOrder(final PersistentCustomerOrder order) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).addOrder(order);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void retoureDelivery(final PersistentCustomerOrder arrivedOrder, final QuantifiedArticlesSearchList list) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).retoureDelivery(arrivedOrder, list);
    }

    
}
