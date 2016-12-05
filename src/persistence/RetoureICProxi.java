package persistence;



import model.visitor.*;

public class RetoureICProxi extends DeliveryICProxi implements PersistentRetoure{
    
    public RetoureICProxi(long objectId) {
        super(objectId);
    }
    public RetoureICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theRetoureFacade
            .getRetoure(this.getId());
    }
    
    public long getClassId() {
        return 134;
    }
    
    public Retoure_ArticleListProxi getArticleList() throws PersistenceException {
        return ((PersistentRetoure)this.getTheObject()).getArticleList();
    }
    public PersistentRetoure getThis() throws PersistenceException {
        return ((PersistentRetoure)this.getTheObject()).getThis();
    }
    
    public void accept(DeliveryVisitor visitor) throws PersistenceException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoure(this);
    }
    public <E extends model.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends model.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoure(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoure(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoure(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleRetoure(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleRetoure(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleRetoure(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleRetoure(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentRetoure)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentRetoure)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentRetoure)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentRetoure)this.getTheObject()).updateObservers(event);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentRetoure)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deliver() 
				throws PersistenceException{
        ((PersistentRetoure)this.getTheObject()).deliver();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentRetoure)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentRetoure)this.getTheObject()).initializeOnInstantiation();
    }
    public void send() 
				throws PersistenceException{
        ((PersistentRetoure)this.getTheObject()).send();
    }

    
}
