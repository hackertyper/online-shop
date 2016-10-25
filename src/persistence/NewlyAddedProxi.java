package persistence;



import model.visitor.*;

public class NewlyAddedProxi extends PersistentProxi implements PersistentNewlyAdded{
    
    public NewlyAddedProxi(long objectId) {
        super(objectId);
    }
    public NewlyAddedProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 154;
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
    
    
    public PersistentArticle getMyArticle() 
				throws PersistenceException{
        return ((PersistentNewlyAdded)this.getTheObject()).getMyArticle();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void startSelling(final Invoker invoker) 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).startSelling(invoker);
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
    public void startSelling() 
				throws PersistenceException{
        ((PersistentNewlyAdded)this.getTheObject()).startSelling();
    }

    
}
