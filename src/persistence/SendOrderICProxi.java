package persistence;



import model.visitor.*;

public class SendOrderICProxi extends PersistentInCacheProxiOptimistic implements PersistentSendOrder{
    
    public SendOrderICProxi(long objectId) {
        super(objectId);
    }
    public SendOrderICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theSendOrderFacade
            .getSendOrder(this.getId());
    }
    
    public long getClassId() {
        return 126;
    }
    
    public PersistentSendOrder getThis() throws PersistenceException {
        return ((PersistentSendOrder)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleSendOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSendOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSendOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSendOrder(this);
    }
    public void accept(CustomerOrderStateVisitor visitor) throws PersistenceException {
        visitor.handleSendOrder(this);
    }
    public <R> R accept(CustomerOrderStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleSendOrder(this);
    }
    public <E extends model.UserException>  void accept(CustomerOrderStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleSendOrder(this);
    }
    public <R, E extends model.UserException> R accept(CustomerOrderStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleSendOrder(this);
    }
    
    
    public PersistentCustomerOrder getCustomerOrder() 
				throws PersistenceException{
        return ((PersistentSendOrder)this.getTheObject()).getCustomerOrder();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentSendOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentSendOrder)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentSendOrder)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentSendOrder)this.getTheObject()).initializeOnInstantiation();
    }

    
}
