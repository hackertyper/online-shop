package persistence;



import model.visitor.*;

public class QuantifiedArticlesArticleICProxi extends PersistentInCacheProxiOptimistic implements PersistentQuantifiedArticlesArticle{
    
    public QuantifiedArticlesArticleICProxi(long objectId) {
        super(objectId);
    }
    public QuantifiedArticlesArticleICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theQuantifiedArticlesArticleFacade
            .getQuantifiedArticlesArticle(this.getId());
    }
    
    public long getClassId() {
        return 250;
    }
    
    public PersistentQuantifiedArticles getObserver() throws PersistenceException {
        return ((PersistentQuantifiedArticlesArticle)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentQuantifiedArticles newValue) throws PersistenceException {
        ((PersistentQuantifiedArticlesArticle)this.getTheObject()).setObserver(newValue);
    }
    public PersistentArticle getObservee() throws PersistenceException {
        return ((PersistentQuantifiedArticlesArticle)this.getTheObject()).getObservee();
    }
    public void setObservee(PersistentArticle newValue) throws PersistenceException {
        ((PersistentQuantifiedArticlesArticle)this.getTheObject()).setObservee(newValue);
    }
    public PersistentQuantifiedArticlesArticle getThis() throws PersistenceException {
        return ((PersistentQuantifiedArticlesArticle)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleQuantifiedArticlesArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleQuantifiedArticlesArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleQuantifiedArticlesArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleQuantifiedArticlesArticle(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleQuantifiedArticlesArticle(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleQuantifiedArticlesArticle(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleQuantifiedArticlesArticle(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleQuantifiedArticlesArticle(this);
    }
    
    
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentQuantifiedArticlesArticle)this.getTheObject()).update(event);
    }

    
}
