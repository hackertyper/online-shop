package persistence;



import model.visitor.*;

public class ShopkeeperServiceProxi extends ServiceProxi implements PersistentShopkeeperService{
    
    public ShopkeeperServiceProxi(long objectId) {
        super(objectId);
    }
    public ShopkeeperServiceProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return -105;
    }
    
    public PersistentShopkeeper getManager() throws PersistenceException {
        return ((PersistentShopkeeperService)this.getTheObject()).getManager();
    }
    public void setManager(PersistentShopkeeper newValue) throws PersistenceException {
        ((PersistentShopkeeperService)this.getTheObject()).setManager(newValue);
    }
    public long getLowerLimitPreset() throws PersistenceException {
        return ((PersistentShopkeeperService)this.getTheObject()).getLowerLimitPreset();
    }
    public void setLowerLimitPreset(long newValue) throws PersistenceException {
        ((PersistentShopkeeperService)this.getTheObject()).setLowerLimitPreset(newValue);
    }
    public long getBalancePreset() throws PersistenceException {
        return ((PersistentShopkeeperService)this.getTheObject()).getBalancePreset();
    }
    public void setBalancePreset(long newValue) throws PersistenceException {
        ((PersistentShopkeeperService)this.getTheObject()).setBalancePreset(newValue);
    }
    public PersistentShopkeeperService getThis() throws PersistenceException {
        return ((PersistentShopkeeperService)this.getTheObject()).getThis();
    }
    
    public void accept(ServiceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(InvokerVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    public void accept(RemoteVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperService(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public String shopkeeperService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentShopkeeperService)this.getTheObject()).shopkeeperService_Menu_Filter(anything);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).signalChanged(signal);
    }
    public void changeDescription(final PersistentItem item, final String newDescription) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeDescription(item, newDescription);
    }
    public void changeManufacturerDelivery(final long newManuDelivery) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeManufacturerDelivery(newManuDelivery);
    }
    public void changePrice(final PersistentArticle article, final long newPrice) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changePrice(article, newPrice);
    }
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeProductGroup(article, newPG);
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void disconnected() 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).disconnected();
    }
    public void handleException(final Command command, final PersistenceException exception) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).handleException(command, exception);
    }
    public void handleResult(final Command command) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).handleResult(command);
    }
    public boolean hasChanged() 
				throws PersistenceException{
        return ((PersistentShopkeeperService)this.getTheObject()).hasChanged();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).initializeOnInstantiation();
    }
    public void presetBalance(final long amount) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).presetBalance(amount);
    }
    public void presetLowerLimit(final long amount) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).presetLowerLimit(amount);
    }
    public void startSelling(final PersistentNewlyAdded article) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).startSelling(article);
    }

    
}
