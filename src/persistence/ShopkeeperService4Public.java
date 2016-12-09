package persistence;


import model.visitor.*;

public interface ShopkeeperService4Public extends Service4Public {
    
    
    public void accept(ServiceVisitor visitor) throws PersistenceException;
    public <R> R accept(ServiceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ServiceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ServiceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(InvokerVisitor visitor) throws PersistenceException;
    public <R> R accept(InvokerReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(InvokerExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(InvokerReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(RemoteVisitor visitor) throws PersistenceException;
    public <R> R accept(RemoteReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(RemoteExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(RemoteReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException;
    public String shopkeeperService_Menu_Filter(final Anything anything) 
				throws PersistenceException;
    public void changeDescription(final PersistentItem item, final String newDescription) 
				throws PersistenceException;
    public void changeExtraCharge(final PersistentCustomerDelivery cd, final long newCharge) 
				throws PersistenceException;
    public void changeManufacturerDelivery(final PersistentArticle article, final long newManuDelivery) 
				throws PersistenceException;
    public void changeMaxStock(final PersistentArticle article, final long maxStock) 
				throws model.InvalidStockNumber, PersistenceException;
    public void changeMinStock(final PersistentArticle article, final long minStock) 
				throws model.InvalidStockNumber, PersistenceException;
    public void changePrice(final PersistentArticle article, final long newPrice) 
				throws PersistenceException;
    public void changeProductGroup(final PersistentArticle article, final PersistentProductGroup newPG) 
				throws PersistenceException;
    public void changeRetourePercentage(final long newPercentage) 
				throws PersistenceException;
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException;
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException;
    public long countArticles(final PersistentProductGroup pg) 
				throws PersistenceException;
    public void createArticle(final PersistentProductGroup parent, final String description, final String manufacturer, final long price, final long maxStock, final long minStock, final long manuDelivery) 
				throws model.InvalidStockNumber, PersistenceException;
    public void createProductGroup(final PersistentProductGroup parent, final String description) 
				throws PersistenceException;
    public void initializeOnCreation() 
				throws PersistenceException;
    public void initializeOnInstantiation() 
				throws PersistenceException;
    public void orderNew(final PersistentNewlyAdded article, final long amount) 
				throws PersistenceException;
    public void presetBalance(final long amount) 
				throws PersistenceException;
    public void presetLowerLimit(final long amount) 
				throws PersistenceException;
    public void startSellingAgain(final PersistentRemovedFSale article) 
				throws PersistenceException;
    public void startSelling(final PersistentNewlyAdded article) 
				throws PersistenceException;
    public void stopSelling(final PersistentOfferedFSale article) 
				throws PersistenceException;

}

