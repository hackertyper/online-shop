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
        return 168;
    }
    
    public void setBasicProductGroup(PersistentShopManagerBasicProductGroup newValue) throws PersistenceException {
        ((PersistentShopManager)this.getTheObject()).setBasicProductGroup(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentShopManager)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentShopManager)this.getTheObject()).setSubService(newValue);
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
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopManager(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManager(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManager(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManager(this);
    }
    
    
    public void addToCart(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).addToCart(article, amount);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).deregister(observee);
    }
    public void findArticle(final String description, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).findArticle(description, invoker);
    }
    public PersistentProductGroup getBasicProductGroup() 
				throws PersistenceException{
        return ((PersistentShopManager)this.getTheObject()).getBasicProductGroup();
    }
    public PersistentCustomerManager getCustomerManager() 
				throws PersistenceException{
        return ((PersistentShopManager)this.getTheObject()).getCustomerManager();
    }
    public PersistentShopService getMyShopServer() 
				throws PersistenceException{
        return ((PersistentShopManager)this.getTheObject()).getMyShopServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).register(observee);
    }
    public void setBasicProductGroup(final PersistentProductGroup basicProductGroup) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).setBasicProductGroup(basicProductGroup);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).updateObservers(event);
    }
    public void addToCartImplementation(final PersistentArticle article, final long amount) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).addToCartImplementation(article, amount);
    }
    public void basicProductGroup_update(final model.meta.ProductGroupMssgs event) 
				throws PersistenceException{
        ((PersistentShopManager)this.getTheObject()).basicProductGroup_update(event);
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
