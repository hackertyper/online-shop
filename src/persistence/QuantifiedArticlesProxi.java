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
        return 156;
    }
    
    public PersistentArticle getArticle() throws PersistenceException {
        return ((PersistentQuantifiedArticles)this.getTheObject()).getArticle();
    }
    public void setArticle(PersistentArticle newValue) throws PersistenceException {
        ((PersistentQuantifiedArticles)this.getTheObject()).setArticle(newValue);
    }
    public long getAmount() throws PersistenceException {
        return ((PersistentQuantifiedArticles)this.getTheObject()).getAmount();
    }
    public void setAmount(long newValue) throws PersistenceException {
        ((PersistentQuantifiedArticles)this.getTheObject()).setAmount(newValue);
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
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).copyingPrivateUserAttributes(copy);
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
    public void removeFCart(final PersistentCart cart) 
				throws PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).removeFCart(cart);
    }
    public void reserve() 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentQuantifiedArticles)this.getTheObject()).reserve();
    }

    
}
