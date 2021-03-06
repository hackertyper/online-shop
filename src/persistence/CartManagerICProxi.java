package persistence;



import model.visitor.*;

public class CartManagerICProxi extends PersistentInCacheProxiOptimistic implements PersistentCartManager{
    
    public CartManagerICProxi(long objectId) {
        super(objectId);
    }
    public CartManagerICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCartManagerFacade
            .getCartManager(this.getId());
    }
    
    public long getClassId() {
        return 216;
    }
    
    public PersistentCart getMyCart() throws PersistenceException {
        return ((PersistentCartManager)this.getTheObject()).getMyCart();
    }
    public void setMyCart(PersistentCart newValue) throws PersistenceException {
        ((PersistentCartManager)this.getTheObject()).setMyCart(newValue);
    }
    public void setArticleList(PersistentCartManagerArticleList newValue) throws PersistenceException {
        ((PersistentCartManager)this.getTheObject()).setArticleList(newValue);
    }
    public void setStandardDelivery(PersistentCartManagerStandardDelivery newValue) throws PersistenceException {
        ((PersistentCartManager)this.getTheObject()).setStandardDelivery(newValue);
    }
    public void setOnDelivery(PersistentCartManagerOnDelivery newValue) throws PersistenceException {
        ((PersistentCartManager)this.getTheObject()).setOnDelivery(newValue);
    }
    public PersistentPreOrder getPreOrder() throws PersistenceException {
        return ((PersistentCartManager)this.getTheObject()).getPreOrder();
    }
    public void setPreOrder(PersistentPreOrder newValue) throws PersistenceException {
        ((PersistentCartManager)this.getTheObject()).setPreOrder(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentCartManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentCartManager)this.getTheObject()).setSubService(newValue);
    }
    public PersistentCartManager getThis() throws PersistenceException {
        return ((PersistentCartManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManager(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCartManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManager(this);
    }
    
    
    public void addArticle(final PersistentArticle article, final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).addArticle(article, amount, invoker);
    }
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).changeAmount(article, newAmount, invoker);
    }
    public void checkOut(final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).checkOut(invoker);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).deregister(observee);
    }
    public PersistentCartManagerArticleList getArticleList() 
				throws PersistenceException{
        return ((PersistentCartManager)this.getTheObject()).getArticleList();
    }
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        return ((PersistentCartManager)this.getTheObject()).getCustomerManager();
    }
    public PersistentCartService getMyCartServer() 
				throws PersistenceException{
        return ((PersistentCartManager)this.getTheObject()).getMyCartServer();
    }
    public PersistentOverNightDelivery getOnDelivery() 
				throws PersistenceException{
        return ((PersistentCartManager)this.getTheObject()).getOnDelivery();
    }
    public PersistentStandardDelivery getStandardDelivery() 
				throws PersistenceException{
        return ((PersistentCartManager)this.getTheObject()).getStandardDelivery();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void order(final PersistentCustomerDelivery deliveryMethod, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).order(deliveryMethod, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).register(observee);
    }
    public void removeFCart(final PersistentQuantifiedArticles article, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).removeFCart(article, invoker);
    }
    public void setOnDelivery(final PersistentOverNightDelivery onDelivery) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).setOnDelivery(onDelivery);
    }
    public void setStandardDelivery(final PersistentStandardDelivery standardDelivery) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).setStandardDelivery(standardDelivery);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).updateObservers(event);
    }
    public void addArticle(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).addArticle(article, amount);
    }
    public void addOrder(final PersistentCustomerOrder order) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).addOrder(order);
    }
    public void addPreOrder(final PersistentPreOrder preOrder) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).addPreOrder(preOrder);
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).addToCart(article, amount);
    }
    public void articleList_update(final model.meta.QuantifiedArticlesMssgs event) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).articleList_update(event);
    }
    public void changeAmount(final PersistentQuantifiedArticles article, final long newAmount) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).changeAmount(article, newAmount);
    }
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentCartManager)this.getTheObject()).checkOut();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).initializeOnInstantiation();
    }
    public void onDelivery_update(final model.meta.OverNightDeliveryMssgs event) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).onDelivery_update(event);
    }
    public void order(final PersistentCustomerDelivery deliveryMethod) 
				throws model.FirstCheckOut, model.InsufficientFunds, PersistenceException{
        ((PersistentCartManager)this.getTheObject()).order(deliveryMethod);
    }
    public void pay(final long sum) 
				throws model.InsufficientFunds, PersistenceException{
        ((PersistentCartManager)this.getTheObject()).pay(sum);
    }
    public void removeFCart(final PersistentQuantifiedArticles article) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).removeFCart(article);
    }
    public void standardDelivery_update(final model.meta.StandardDeliveryMssgs event) 
				throws PersistenceException{
        ((PersistentCartManager)this.getTheObject()).standardDelivery_update(event);
    }

    
}
