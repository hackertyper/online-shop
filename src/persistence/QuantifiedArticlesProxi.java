package persistence;



import model.visitor.*;

public class QuantifiedArticlesProxi extends PersistentProxi implements PersistentQuantifiedArticles{
    
    public QuantifiedArticlesProxi(long objectId) {
        super(objectId);
    }
    public QuantifiedArticlesProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 124;
    }
    
    public void setArticle(PersistentQuantifiedArticlesArticle newValue) throws PersistenceException {
        ((PersistentQuantifiedArticles)this.getTheObject()).setArticle(newValue);
    }
    public PersistentCustomerOrder getMyOrder() throws PersistenceException {
        return ((PersistentQuantifiedArticles)this.getTheObject()).getMyOrder();
    }
    public void setMyOrder(PersistentCustomerOrder newValue) throws PersistenceException {
        ((PersistentQuantifiedArticles)this.getTheObject()).setMyOrder(newValue);
    }
    public long getAmount() throws PersistenceException {
        return ((PersistentQuantifiedArticles)this.getTheObject()).getAmount();
    }
    public void setAmount(long newValue) throws PersistenceException {
        ((PersistentQuantifiedArticles)this.getTheObject()).setAmount(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentQuantifiedArticles)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentQuantifiedArticles)this.getTheObject()).setSubService(newValue);
    }
    public PersistentQuantifiedArticles getThis() throws PersistenceException {
        return ((PersistentQuantifiedArticles)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleQuantifiedArticles(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleQuantifiedArticles(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleQuantifiedArticles(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleQuantifiedArticles(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleQuantifiedArticles(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleQuantifiedArticles(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleQuantifiedArticles(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleQuantifiedArticles(this);
    }
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).deregister(observee);
    }
    public void fireArticleChanged(final model.meta.ArticleMssgs evnt) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).fireArticleChanged(evnt);
    }
    public PersistentArticle getArticle() 
				throws PersistenceException{
        return ((PersistentQuantifiedArticles)this.getTheObject()).getArticle();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).register(observee);
    }
    public void retoure(final long amount) 
				throws model.NotArrived, PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).retoure(amount);
    }
    public void setArticle(final PersistentArticle article) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).setArticle(article);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).updateObservers(event);
    }
    public void article_update(final model.meta.ArticleMssgs event) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).article_update(event);
    }
    public void changeAmount(final long newAmount) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).changeAmount(newAmount);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deleteReserve() 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).deleteReserve();
    }
    public long fetchPrice() 
				throws PersistenceException{
        return ((PersistentQuantifiedArticles)this.getTheObject()).fetchPrice();
    }
    public void fireArticleChangedImplementation(final model.meta.ArticleMssgs evnt) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).fireArticleChangedImplementation(evnt);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).initializeOnInstantiation();
    }
    public void pack() 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).pack();
    }
    public void reserve() 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).reserve();
    }
    public void retoureImplementation(final long amount) 
				throws model.NotArrived, PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).retoureImplementation(amount);
    }

    
}
