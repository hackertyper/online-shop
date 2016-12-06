package persistence;



import model.visitor.*;

public class PreOrderICProxi extends PersistentInCacheProxiOptimistic implements PersistentPreOrder{
    
    public PreOrderICProxi(long objectId) {
        super(objectId);
    }
    public PreOrderICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().thePreOrderFacade
            .getPreOrder(this.getId());
    }
    
    public long getClassId() {
        return 240;
    }
    
    public PersistentCartManager getCartManager() throws PersistenceException {
        return ((PersistentPreOrder)this.getTheObject()).getCartManager();
    }
    public void setCartManager(PersistentCartManager newValue) throws PersistenceException {
        ((PersistentPreOrder)this.getTheObject()).setCartManager(newValue);
    }
    public long getSum() throws PersistenceException {
        return ((PersistentPreOrder)this.getTheObject()).getSum();
    }
    public void setSum(long newValue) throws PersistenceException {
        ((PersistentPreOrder)this.getTheObject()).setSum(newValue);
    }
    public void setArticleList(PersistentPreOrderArticleList newValue) throws PersistenceException {
        ((PersistentPreOrder)this.getTheObject()).setArticleList(newValue);
    }
    public PersistentStandardDelivery getStandardDelivery() throws PersistenceException {
        return ((PersistentPreOrder)this.getTheObject()).getStandardDelivery();
    }
    public void setStandardDelivery(PersistentStandardDelivery newValue) throws PersistenceException {
        ((PersistentPreOrder)this.getTheObject()).setStandardDelivery(newValue);
    }
    public PersistentOverNightDelivery getOnDelivery() throws PersistenceException {
        return ((PersistentPreOrder)this.getTheObject()).getOnDelivery();
    }
    public void setOnDelivery(PersistentOverNightDelivery newValue) throws PersistenceException {
        ((PersistentPreOrder)this.getTheObject()).setOnDelivery(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentPreOrder)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentPreOrder)this.getTheObject()).setSubService(newValue);
    }
    public PersistentPreOrder getThis() throws PersistenceException {
        return ((PersistentPreOrder)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrder(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handlePreOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrder(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).deregister(observee);
    }
    public PersistentPreOrderArticleList getArticleList() 
				throws PersistenceException{
        return ((PersistentPreOrder)this.getTheObject()).getArticleList();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).updateObservers(event);
    }
    public void articleList_update(final model.meta.QuantifiedArticlesMssgs event) 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).articleList_update(event);
    }
    public void cancel() 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).cancel();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentPreOrder)this.getTheObject()).initializeOnInstantiation();
    }
    public PersistentCustomerOrder preorder(final PersistentCustomerDelivery deliveryMethod) 
				throws model.InsufficientFunds, PersistenceException{
        return ((PersistentPreOrder)this.getTheObject()).preorder(deliveryMethod);
    }

    
}
