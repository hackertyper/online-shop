package persistence;



import model.visitor.*;

public class CustomerOrderArticleListICProxi extends PersistentInCacheProxiOptimistic implements PersistentCustomerOrderArticleList{
    
    public CustomerOrderArticleListICProxi(long objectId) {
        super(objectId);
    }
    public CustomerOrderArticleListICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theCustomerOrderArticleListFacade
            .getCustomerOrderArticleList(this.getId());
    }
    
    public long getClassId() {
        return 252;
    }
    
    public PersistentCustomerOrder getObserver() throws PersistenceException {
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentCustomerOrder newValue) throws PersistenceException {
        ((PersistentCustomerOrderArticleList)this.getTheObject()).setObserver(newValue);
    }
    public CustomerOrderArticleList_ObserveeProxi getObservee() throws PersistenceException {
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).getObservee();
    }
    public PersistentCustomerOrderArticleList getThis() throws PersistenceException {
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderArticleList(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderArticleList(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderArticleList(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderArticleList(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleCustomerOrderArticleList(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCustomerOrderArticleList(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCustomerOrderArticleList(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCustomerOrderArticleList(this);
    }
    
    
    public void add(final PersistentQuantifiedArticles observee) 
				throws PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<PersistentQuantifiedArticles,R,E> aggregtion) 
				throws E, PersistenceException{
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<PersistentQuantifiedArticles,R> aggregtion) 
				throws PersistenceException{
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<PersistentQuantifiedArticles,E> procdure) 
				throws E, PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<PersistentQuantifiedArticles> procdure) 
				throws PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).filterException(predcate);
    }
    public void filter(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<PersistentQuantifiedArticles> findAllException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).findAllException(predcate);
    }
    public SearchListRoot<PersistentQuantifiedArticles> findAll(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).findAll(predcate);
    }
    public <E extends model.UserException> PersistentQuantifiedArticles findFirstException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).findFirstException(predcate);
    }
    public PersistentQuantifiedArticles findFirst(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).getLength();
    }
    public QuantifiedArticlesSearchList getList() 
				throws PersistenceException{
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).getList();
    }
    public java.util.Iterator<PersistentQuantifiedArticles> iterator() 
				throws PersistenceException{
        return ((PersistentCustomerOrderArticleList)this.getTheObject()).iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentCustomerOrderArticleList)this.getTheObject()).update(event);
    }

    
}
