package persistence;



import model.visitor.*;

public class ShopkeeperProxi extends PersistentProxi implements PersistentShopkeeper{
    
    public ShopkeeperProxi(long objectId) {
        super(objectId);
    }
    public ShopkeeperProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 107;
    }
    
    public void setBasicProductGroup(PersistentShopkeeperBasicProductGroup newValue) throws PersistenceException {
        ((PersistentShopkeeper)this.getTheObject()).setBasicProductGroup(newValue);
    }
    public PersistentCustomerPresets getPresets() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getPresets();
    }
    public void setPresets(PersistentCustomerPresets newValue) throws PersistenceException {
        ((PersistentShopkeeper)this.getTheObject()).setPresets(newValue);
    }
    public PersistentStandardDelivery getStandardDelivery() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getStandardDelivery();
    }
    public void setStandardDelivery(PersistentStandardDelivery newValue) throws PersistenceException {
        ((PersistentShopkeeper)this.getTheObject()).setStandardDelivery(newValue);
    }
    public PersistentOverNightDelivery getOnDelivery() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getOnDelivery();
    }
    public void setOnDelivery(PersistentOverNightDelivery newValue) throws PersistenceException {
        ((PersistentShopkeeper)this.getTheObject()).setOnDelivery(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentShopkeeper)this.getTheObject()).setSubService(newValue);
    }
    public PersistentShopkeeper getThis() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeper(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeper(this);
    }
    
    
    public void changeCharge(final PersistentCustomerDelivery cd, final long newCharge, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeCharge(cd, newCharge, invoker);
    }
    public void changeDescription(final PersistentItem item, final String newDescription) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeDescription(item, newDescription);
    }
    public void changeDescription(final PersistentItem item, final String newDescription, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeDescription(item, newDescription, invoker);
    }
    public void changePrice(final PersistentArticle article, final long newPrice) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changePrice(article, newPrice);
    }
    public void changePrice(final PersistentArticle article, final long newPrice, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changePrice(article, newPrice, invoker);
    }
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeProductGroup(article, newPG);
    }
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeProductGroup(article, newPG, invoker);
    }
    public void changeRetourePercentage(final long newPercentage, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeRetourePercentage(newPercentage, invoker);
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeTime(cd, newTime, invoker);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).deregister(observee);
    }
    public PersistentProductGroup getBasicProductGroup() 
				throws PersistenceException{
        return ((PersistentShopkeeper)this.getTheObject()).getBasicProductGroup();
    }
    public PersistentShopkeeperService getMyServer() 
				throws PersistenceException{
        return ((PersistentShopkeeper)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void presetBalance(final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).presetBalance(amount, invoker);
    }
    public void presetLowerLimit(final long amount, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).presetLowerLimit(amount, invoker);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).register(observee);
    }
    public void setBasicProductGroup(final PersistentProductGroup basicProductGroup) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).setBasicProductGroup(basicProductGroup);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).updateObservers(event);
    }
    public void basicProductGroup_update(final model.meta.ProductGroupMssgs event) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).basicProductGroup_update(event);
    }
    public void changeCharge(final PersistentCustomerDelivery cd, final long newCharge) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeCharge(cd, newCharge);
    }
    public void changeDescriptionImplementation(final PersistentItem item, final String newDescription) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeDescriptionImplementation(item, newDescription);
    }
    public void changePriceImplementation(final PersistentArticle article, final long newPrice) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changePriceImplementation(article, newPrice);
    }
    public void changeProductGroupImplementation(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeProductGroupImplementation(article, newPG);
    }
    public void changeRetourePercentage(final long newPercentage) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeRetourePercentage(newPercentage);
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeTime(cd, newTime);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void createArticle(final PersistentProductGroup parent, final String description, final String manufacturer, final long price, final long maxStock, final long minStock, final long manuDelivery) 
				throws model.InvalidStockNumber, PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).createArticle(parent, description, manufacturer, price, maxStock, minStock, manuDelivery);
    }
    public void createProductGroup(final PersistentProductGroup parent, final String description) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).createProductGroup(parent, description);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).initializeOnInstantiation();
    }
    public void presetBalance(final long amount) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).presetBalance(amount);
    }
    public void presetLowerLimit(final long amount) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).presetLowerLimit(amount);
    }

    
}
