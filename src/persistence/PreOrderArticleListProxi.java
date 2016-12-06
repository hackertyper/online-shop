package persistence;



import model.visitor.*;

public class PreOrderArticleListProxi extends PersistentProxi implements PersistentPreOrderArticleList{
    
    public PreOrderArticleListProxi(long objectId) {
        super(objectId);
    }
    public PreOrderArticleListProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 264;
    }
    
    public PersistentPreOrder getObserver() throws PersistenceException {
        return ((PersistentPreOrderArticleList)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentPreOrder newValue) throws PersistenceException {
        ((PersistentPreOrderArticleList)this.getTheObject()).setObserver(newValue);
    }
    public PreOrderArticleList_ObserveeProxi getObservee() throws PersistenceException {
        return ((PersistentPreOrderArticleList)this.getTheObject()).getObservee();
    }
    public PersistentPreOrderArticleList getThis() throws PersistenceException {
        return ((PersistentPreOrderArticleList)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handlePreOrderArticleList(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrderArticleList(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrderArticleList(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrderArticleList(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handlePreOrderArticleList(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handlePreOrderArticleList(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handlePreOrderArticleList(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handlePreOrderArticleList(this);
    }
    
    
    public void add(final PersistentQuantifiedArticles observee) 
				throws PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<PersistentQuantifiedArticles,R,E> aggregtion) 
				throws E, PersistenceException{
        return ((PersistentPreOrderArticleList)this.getTheObject()).aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<PersistentQuantifiedArticles,R> aggregtion) 
				throws PersistenceException{
        return ((PersistentPreOrderArticleList)this.getTheObject()).aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<PersistentQuantifiedArticles,E> procdure) 
				throws E, PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<PersistentQuantifiedArticles> procdure) 
				throws PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).filterException(predcate);
    }
    public void filter(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<PersistentQuantifiedArticles> findAllException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentPreOrderArticleList)this.getTheObject()).findAllException(predcate);
    }
    public SearchListRoot<PersistentQuantifiedArticles> findAll(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        return ((PersistentPreOrderArticleList)this.getTheObject()).findAll(predcate);
    }
    public <E extends model.UserException> PersistentQuantifiedArticles findFirstException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentPreOrderArticleList)this.getTheObject()).findFirstException(predcate);
    }
    public PersistentQuantifiedArticles findFirst(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        return ((PersistentPreOrderArticleList)this.getTheObject()).findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        return ((PersistentPreOrderArticleList)this.getTheObject()).getLength();
    }
    public QuantifiedArticlesSearchList getList() 
				throws PersistenceException{
        return ((PersistentPreOrderArticleList)this.getTheObject()).getList();
    }
    public java.util.Iterator<PersistentQuantifiedArticles> iterator() 
				throws PersistenceException{
        return ((PersistentPreOrderArticleList)this.getTheObject()).iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<PersistentQuantifiedArticles,E> predcate) 
				throws E, PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<PersistentQuantifiedArticles> predcate) 
				throws PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentPreOrderArticleList)this.getTheObject()).update(event);
    }

    
}
