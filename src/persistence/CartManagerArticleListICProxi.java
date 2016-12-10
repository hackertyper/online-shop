package persistence;



import model.visitor.*;

public class CartManagerArticleListICProxi extends PersistentInCacheProxiOptimistic implements PersistentCartManagerArticleList{
    
    public CartManagerArticleListICProxi(long objectId) {
        super(objectId);
    }
    public CartManagerArticleListICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCartManagerArticleListFacade
            .getCartManagerArticleList(this.getId());
    }
    
    public long getClassId() {
        return 202;
    }
    
    public PersistentCartManager getObserver() throws PersistenceException {
        return ((PersistentCartManagerArticleList)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentCartManager newValue) throws PersistenceException {
        ((PersistentCartManagerArticleList)this.getTheObject()).setObserver(newValue);
    }
    public CartManagerArticleList_ObserveeProxi getObservee() throws PersistenceException {
        return ((PersistentCartManagerArticleList)this.getTheObject()).getObservee();
    }
    public PersistentCartManagerArticleList getThis() throws PersistenceException {
        return ((PersistentCartManagerArticleList)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerArticleList(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerArticleList(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerArticleList(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerArticleList(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCartManagerArticleList(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCartManagerArticleList(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCartManagerArticleList(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCartManagerArticleList(this);
    }
    
    
    public void add(final PersistentQuantifiedArticles observee) 
				throws PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<PersistentQuantifiedArticles,R,E> aggregtion) 
				throws E, PersistenceException{
        return ((PersistentCartManagerArticleList)this.getTheObject()).aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<PersistentQuantifiedArticles,R> aggregtion) 
				throws PersistenceException{
        return ((PersistentCartManagerArticleList)this.getTheObject()).aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<PersistentQuantifiedArticles,E> procdure) 
				throws E, PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<PersistentQuantifiedArticles> procdure) 
				throws PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).filterException(predcate);
    }
    public void filter(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<PersistentQuantifiedArticles> findAllException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentCartManagerArticleList)this.getTheObject()).findAllException(predcate);
    }
    public SearchListRoot<PersistentQuantifiedArticles> findAll(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        return ((PersistentCartManagerArticleList)this.getTheObject()).findAll(predcate);
    }
    public <E extends model.UserException> PersistentQuantifiedArticles findFirstException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentCartManagerArticleList)this.getTheObject()).findFirstException(predcate);
    }
    public PersistentQuantifiedArticles findFirst(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        return ((PersistentCartManagerArticleList)this.getTheObject()).findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        return ((PersistentCartManagerArticleList)this.getTheObject()).getLength();
    }
    public QuantifiedArticlesSearchList getList() 
				throws PersistenceException{
        return ((PersistentCartManagerArticleList)this.getTheObject()).getList();
    }
    public java.util.Iterator<PersistentQuantifiedArticles> iterator() 
				throws PersistenceException{
        return ((PersistentCartManagerArticleList)this.getTheObject()).iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCartManagerArticleList)this.getTheObject()).update(event);
    }

    
}
