package persistence;



import model.visitor.*;

public class ShopkeeperServiceICProxi extends ServiceICProxi implements PersistentShopkeeperService{
    
    public ShopkeeperServiceICProxi(long objectId) {
        super(objectId);
    }
    public ShopkeeperServiceICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theShopkeeperServiceFacade
            .getShopkeeperService(this.getId());
    }
    
    public long getClassId() {
        return -143;
    }
    
    public PersistentShopkeeper getManager() throws PersistenceException {
        return ((PersistentShopkeeperService)this.getTheObject()).getManager();
    }
    public void setManager(PersistentShopkeeper newValue) throws PersistenceException {
        ((PersistentShopkeeperService)this.getTheObject()).setManager(newValue);
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
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperService(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperService(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperService(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
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
    
    
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).register(observee);
    }
    public String shopkeeperService_Menu_Filter(final Anything anything) 
				throws PersistenceException{
        return ((PersistentShopkeeperService)this.getTheObject()).shopkeeperService_Menu_Filter(anything);
    }
    public void signalChanged(final boolean signal) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).signalChanged(signal);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).updateObservers(event);
    }
    public void changeDescription(final PersistentItem item, final String newDescription) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeDescription(item, newDescription);
    }
    public void changeExtraCharge(final PersistentCustomerDelivery cd, final long newCharge) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeExtraCharge(cd, newCharge);
    }
    public void changeManufacturerDelivery(final PersistentArticle article, final long newManuDelivery) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeManufacturerDelivery(article, newManuDelivery);
    }
    public void changeMaxStock(final PersistentArticle article, final long maxStock) 
				throws model.InvalidStockNumber, PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeMaxStock(article, maxStock);
    }
    public void changeMinStock(final PersistentArticle article, final long minStock) 
				throws model.InvalidStockNumber, PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeMinStock(article, minStock);
    }
    public void changePrice(final PersistentArticle article, final long newPrice) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changePrice(article, newPrice);
    }
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeProductGroup(article, newPG);
    }
    public void changeRetourePercentage(final long newPercentage) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeRetourePercentage(newPercentage);
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).changeTime(cd, newTime);
    }
    public void connected(final String user) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).connected(user);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public long countArticles(final PersistentProductGroup pg) 
				throws PersistenceException{
        return ((PersistentShopkeeperService)this.getTheObject()).countArticles(pg);
    }
    public void createArticle(final PersistentProductGroup parent, final String description, final String manufacturer, final long price, final long maxStock, final long minStock, final long manuDelivery) 
				throws model.InvalidStockNumber, PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).createArticle(parent, description, manufacturer, price, maxStock, minStock, manuDelivery);
    }
    public void createProductGroup(final PersistentProductGroup parent, final String description) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).createProductGroup(parent, description);
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
    public void orderNew(final PersistentNewlyAdded article, final long amount) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).orderNew(article, amount);
    }
    public void presetBalance(final long amount) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).presetBalance(amount);
    }
    public void presetLowerLimit(final long amount) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).presetLowerLimit(amount);
    }
    public void startSellingAgain(final PersistentRemovedFSale article) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).startSellingAgain(article);
    }
    public void startSelling(final PersistentNewlyAdded article) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).startSelling(article);
    }
    public void stopSelling(final PersistentOfferedFSale article) 
				throws PersistenceException{
        ((PersistentShopkeeperService)this.getTheObject()).stopSelling(article);
    }

    
}
