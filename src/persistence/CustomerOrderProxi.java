package persistence;



import model.visitor.*;

public class CustomerOrderProxi extends DeliveryProxi implements PersistentCustomerOrder{
    
    public CustomerOrderProxi(long objectId) {
        super(objectId);
    }
    public CustomerOrderProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 111;
    }
    
    public CustomerOrder_ArticleListProxi getArticleList() throws PersistenceException {
        return ((PersistentCustomerOrder)this.getTheObject()).getArticleList();
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
    public void acceptDelivery() 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).acceptDelivery();
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
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).retoure();
    }
    public void send() 
				throws PersistenceException{
        ((PersistentCustomerOrder)this.getTheObject()).send();
    }

    
}
