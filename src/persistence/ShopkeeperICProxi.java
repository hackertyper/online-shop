package persistence;



import model.visitor.*;

public class ShopkeeperICProxi extends PersistentInCacheProxiOptimistic implements PersistentShopkeeper{
    
    public ShopkeeperICProxi(long objectId) {
        super(objectId);
    }
    public ShopkeeperICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theShopkeeperFacade
            .getShopkeeper(this.getId());
    }
    
    public long getClassId() {
        return 107;
    }
    
    public void setItemRange(PersistentShopkeeperItemRange newValue) throws PersistenceException {
        ((PersistentShopkeeper)this.getTheObject()).setItemRange(newValue);
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
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeTime(cd, newTime);
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeTime(cd, newTime, invoker);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).deregister(observee);
    }
    public PersistentShopkeeperItemRange getItemRange() 
				throws PersistenceException{
        return ((PersistentShopkeeper)this.getTheObject()).getItemRange();
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
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).updateObservers(event);
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
    public void changeTimeImplementation(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeTimeImplementation(cd, newTime);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).initializeOnInstantiation();
    }
    public void itemRange_update(final model.meta.ItemMssgs event) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).itemRange_update(event);
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
