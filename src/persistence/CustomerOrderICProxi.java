package persistence;



import model.visitor.*;

public class CustomerOrderICProxi extends DeliveryICProxi implements PersistentCustomerOrder{
    
    public CustomerOrderICProxi(long objectId) {
        super(objectId);
    }
    public CustomerOrderICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerOrderFacade
            .getCustomerOrder(this.getId());
    }
    
    public long getClassId() {
        return 151;
    }
    
    public void setArticleList(PersistentCustomerOrderArticleList newValue) throws PersistenceException {
        ((PersistentCustomerOrder)this.getTheObject()).setArticleList(newValue);
    }
    public PersistentOrderManager getOrdermngr() throws PersistenceException {
        return ((PersistentCustomerOrder)this.getTheObject()).getOrdermngr();
    }
    public void setOrdermngr(PersistentOrderManager newValue) throws PersistenceException {
        ((PersistentCustomerOrder)this.getTheObject()).setOrdermngr(newValue);
    }
    public CustomerOrderState getMyState() throws PersistenceException {
        return ((PersistentCustomerOrder)this.getTheObject()).getMyState();
    }
    public void setMyState(CustomerOrderState newValue) throws PersistenceException {
        ((PersistentCustomerOrder)this.getTheObject()).setMyState(newValue);
    }
    public PersistentCustomerOrder getThis() throws PersistenceException {
        return ((PersistentCustomerOrder)this.getTheObject()).getThis();
    }
    
    public void accept(DeliveryVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrder(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrder(this);
    }
    public <E extends model.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrder(this);
    }
    public <R, E extends model.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrder(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrder(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).deregister(observee);
    }
    public PersistentCustomerOrderArticleList getArticleList() 
				throws PersistenceException{
        return ((PersistentCustomerOrder)this.getTheObject()).getArticleList();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).updateObservers(event);
    }
    public void accepted() 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).accepted();
    }
    public void arrived() 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).arrived();
    }
    public void articleList_update(final model.meta.QuantifiedArticlesMssgs event) 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).articleList_update(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deliver() 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).deliver();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).initializeOnInstantiation();
    }
    public void retoure() 
				throws model.NotArrived, PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).retoure();
    }
    public void send() 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).send();
    }

    
}
