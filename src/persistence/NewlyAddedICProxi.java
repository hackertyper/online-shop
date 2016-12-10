package persistence;



import model.visitor.*;

public class NewlyAddedICProxi extends PersistentInCacheProxiOptimistic implements PersistentNewlyAdded{
    
    public NewlyAddedICProxi(long objectId) {
        super(objectId);
    }
    public NewlyAddedICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theNewlyAddedFacade
            .getNewlyAdded(this.getId());
    }
    
    public long getClassId() {
        return 166;
    }
    
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentNewlyAdded)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentNewlyAdded)this.getTheObject()).setSubService(newValue);
    }
    public PersistentNewlyAdded getThis() throws PersistenceException {
        return ((PersistentNewlyAdded)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleNewlyAdded(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewlyAdded(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewlyAdded(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewlyAdded(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleNewlyAdded(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewlyAdded(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewlyAdded(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewlyAdded(this);
    }
    public void accept(ArticleStateVisitor visitor) throws PersistenceException {
        visitor.handleNewlyAdded(this);
    }
    public <R> R accept(ArticleStateReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleNewlyAdded(this);
    }
    public <E extends model.UserException>  void accept(ArticleStateExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleNewlyAdded(this);
    }
    public <R, E extends model.UserException> R accept(ArticleStateReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleNewlyAdded(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).deregister(observee);
    }
    public PersistentArticle getMyArticle() 
				throws PersistenceException{
        return ((PersistentNewlyAdded)this.getTheObject()).getMyArticle();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).register(observee);
    }
    public void startSelling(final Invoker invoker) 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).startSelling(invoker);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).initializeOnInstantiation();
    }
    public void order(final long amount) 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).order(amount);
    }
    public void startSelling() 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).startSelling();
    }

    
}
