package persistence;



import model.visitor.*;

public class ArrivedOrderICProxi extends PersistentInCacheProxiOptimistic implements PersistentArrivedOrder{
    
    public ArrivedOrderICProxi(long objectId) {
        super(objectId);
    }
    public ArrivedOrderICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theArrivedOrderFacade
            .getArrivedOrder(this.getId());
    }
    
    public long getClassId() {
        return 172;
    }
    
    public long getTimtToAccept() throws PersistenceException {
        return ((PersistentArrivedOrder)this.getTheObject()).getTimtToAccept();
    }
    public void setTimtToAccept(long newValue) throws PersistenceException {
        ((PersistentArrivedOrder)this.getTheObject()).setTimtToAccept(newValue);
    }
    public PersistentArrivedOrder getThis() throws PersistenceException {
        return ((PersistentArrivedOrder)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArrivedOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArrivedOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArrivedOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArrivedOrder(this);
    }
    public void accept(CustomerOrderStateVisitor visitor) throws PersistenceException {
        visitor.handleArrivedOrder(this);
    }
    public <R> R accept(CustomerOrderStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArrivedOrder(this);
    }
    public <E extends model.UserException>  void accept(CustomerOrderStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArrivedOrder(this);
    }
    public <R, E extends model.UserException> R accept(CustomerOrderStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArrivedOrder(this);
    }
    
    
    public PersistentCustomerOrder getCustomerOrder() 
				throws PersistenceException{
        return ((PersistentArrivedOrder)this.getTheObject()).getCustomerOrder();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void acceptDelivery() 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).acceptDelivery();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).initializeOnInstantiation();
    }
    public void retoure(final QuantifiedArticlesSearchList list) 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).retoure(list);
    }

    
}
