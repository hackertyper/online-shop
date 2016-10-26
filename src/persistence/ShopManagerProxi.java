package persistence;



import model.visitor.*;

public class ShopManagerProxi extends PersistentProxi implements PersistentShopManager{
    
    public ShopManagerProxi(long objectId) {
        super(objectId);
    }
    public ShopManagerProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 186;
    }
    
    public ShopManager_ItemRangeProxi getItemRange() throws PersistenceException {
        return ((PersistentShopManager)this.getTheObject()).getItemRange();
    }
    public PersistentShopManager getThis() throws PersistenceException {
        return ((PersistentShopManager)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopManager(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManager(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManager(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManager(this);
    }
    
    
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        return ((PersistentShopManager)this.getTheObject()).getCustomerManager();
    }
    public PersistentShopService getMyServer() 
				throws PersistenceException{
        return ((PersistentShopManager)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).addToCart(article, amount);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void findArticle(final String description) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).findArticle(description);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).initializeOnInstantiation();
    }

    
}
