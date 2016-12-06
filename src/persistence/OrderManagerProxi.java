package persistence;



import model.visitor.*;

public class OrderManagerProxi extends PersistentProxi implements PersistentOrderManager{
    
    public OrderManagerProxi(long objectId) {
        super(objectId);
    }
    public OrderManagerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 224;
    }
    
    public OrderManager_OrdersProxi getOrders() throws PersistenceException {
        return ((PersistentOrderManager)this.getTheObject()).getOrders();
    }
    public OrderManager_PreOrdersProxi getPreOrders() throws PersistenceException {
        return ((PersistentOrderManager)this.getTheObject()).getPreOrders();
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
    public void cancel(final PersistentPreOrder preOrder, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).cancel(preOrder, invoker);
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
    public void preorder(final PersistentPreOrder preOrder, final PersistentCustomerDelivery deliveryMethod, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).preorder(preOrder, deliveryMethod, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).register(observee);
    }
    public void retoureArticle(final PersistentQuantifiedArticles article, final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).retoureArticle(article, amount, invoker);
    }
    public void retoureDelivery(final PersistentCustomerOrder arrivedOrder, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).retoureDelivery(arrivedOrder, invoker);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).updateObservers(event);
    }
    public void acceptDelivery(final PersistentCustomerOrder arrivedOrder) 
				throws model.NotArrived, PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).acceptDelivery(arrivedOrder);
    }
    public void addOrder(final PersistentCustomerOrder order) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).addOrder(order);
    }
    public void addPreOrder(final PersistentPreOrder preOrder) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).addPreOrder(preOrder);
    }
    public void cancel(final PersistentPreOrder preOrder) 
				throws PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).cancel(preOrder);
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
    public void preorder(final PersistentPreOrder preOrder, final PersistentCustomerDelivery deliveryMethod) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).preorder(preOrder, deliveryMethod);
    }
    public void retoureArticle(final PersistentQuantifiedArticles article, final long amount) 
				throws model.NotArrived, model.InsufficientFunds, PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).retoureArticle(article, amount);
    }
    public void retoureDelivery(final PersistentCustomerOrder arrivedOrder) 
				throws model.NotArrived, model.InsufficientFunds, PersistenceException{
        ((PersistentOrderManager)this.getTheObject()).retoureDelivery(arrivedOrder);
    }

    
}
