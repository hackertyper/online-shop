package persistence;



import model.visitor.*;

public class CartProxi extends PersistentProxi implements PersistentCart{
    
    public CartProxi(long objectId) {
        super(objectId);
    }
    public CartProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 141;
    }
    
    public long getCurrentSum() throws PersistenceException {
        return ((PersistentCart)this.getTheObject()).getCurrentSum();
    }
    public void setCurrentSum(long newValue) throws PersistenceException {
        ((PersistentCart)this.getTheObject()).setCurrentSum(newValue);
    }
    public Cart_ArticleListProxi getArticleList() throws PersistenceException {
        return ((PersistentCart)this.getTheObject()).getArticleList();
    }
    public PersistentCart getThis() throws PersistenceException {
        return ((PersistentCart)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleCart(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleCart(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleCart(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleCart(this);
    }
    
    
    public PersistentCustomer getManager() 
				throws PersistenceException{
        return ((PersistentCart)this.getTheObject()).getManager();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void addArticle(final PersistentQuantifiedArticles article) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).addArticle(article);
    }
    public void checkOut() 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentCart)this.getTheObject()).checkOut();
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).initializeOnInstantiation();
    }
    public void order() 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).order();
    }
    public void removeArticle(final PersistentQuantifiedArticles article) 
				throws PersistenceException{
        ((PersistentCart)this.getTheObject()).removeArticle(article);
    }

    
}
