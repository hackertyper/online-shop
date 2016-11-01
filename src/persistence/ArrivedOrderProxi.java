package persistence;



import model.visitor.*;

public class ArrivedOrderProxi extends PersistentProxi implements PersistentArrivedOrder{
    
    public ArrivedOrderProxi(long objectId) {
        super(objectId);
    }
    public ArrivedOrderProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 112;
    }
    
    public long getTimtToAccept() throws PersistenceException {
        return ((PersistentArrivedOrder)this.getTheObject()).getTimtToAccept();
    }
    public void setTimtToAccept(long newValue) throws PersistenceException {
        ((PersistentArrivedOrder)this.getTheObject()).setTimtToAccept(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentArrivedOrder)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentArrivedOrder)this.getTheObject()).setSubService(newValue);
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
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArrivedOrder(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArrivedOrder(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArrivedOrder(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArrivedOrder(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).deregister(observee);
    }
    public PersistentCustomerOrder getCustomerOrder() 
				throws PersistenceException{
        return ((PersistentArrivedOrder)this.getTheObject()).getCustomerOrder();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).updateObservers(event);
    }
    public void acceptDelivery() 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).acceptDelivery();
    }
    public void arrived() 
				throws PersistenceException{
        ((PersistentArrivedOrder)this.getTheObject()).arrived();
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
