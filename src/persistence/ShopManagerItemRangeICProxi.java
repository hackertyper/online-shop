package persistence;



import model.visitor.*;

public class ShopManagerItemRangeICProxi extends PersistentInCacheProxiOptimistic implements PersistentShopManagerItemRange{
    
    public ShopManagerItemRangeICProxi(long objectId) {
        super(objectId);
    }
    public ShopManagerItemRangeICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theShopManagerItemRangeFacade
            .getShopManagerItemRange(this.getId());
    }
    
    public long getClassId() {
        return 204;
    }
    
    public PersistentShopManager getObserver() throws PersistenceException {
        return ((PersistentShopManagerItemRange)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentShopManager newValue) throws PersistenceException {
        ((PersistentShopManagerItemRange)this.getTheObject()).setObserver(newValue);
    }
    public ShopManagerItemRange_ObserveeProxi getObservee() throws PersistenceException {
        return ((PersistentShopManagerItemRange)this.getTheObject()).getObservee();
    }
    public PersistentShopManagerItemRange getThis() throws PersistenceException {
        return ((PersistentShopManagerItemRange)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopManagerItemRange(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManagerItemRange(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManagerItemRange(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManagerItemRange(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopManagerItemRange(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopManagerItemRange(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopManagerItemRange(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopManagerItemRange(this);
    }
    
    
    public void add(final PersistentItem observee) 
				throws PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<PersistentItem,R,E> aggregtion) 
				throws E, PersistenceException{
        return ((PersistentShopManagerItemRange)this.getTheObject()).aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<PersistentItem,R> aggregtion) 
				throws PersistenceException{
        return ((PersistentShopManagerItemRange)this.getTheObject()).aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<PersistentItem,E> procdure) 
				throws E, PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<PersistentItem> procdure) 
				throws PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).filterException(predcate);
    }
    public void filter(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<PersistentItem> findAllException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentShopManagerItemRange)this.getTheObject()).findAllException(predcate);
    }
    public SearchListRoot<PersistentItem> findAll(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        return ((PersistentShopManagerItemRange)this.getTheObject()).findAll(predcate);
    }
    public <E extends model.UserException> PersistentItem findFirstException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentShopManagerItemRange)this.getTheObject()).findFirstException(predcate);
    }
    public PersistentItem findFirst(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        return ((PersistentShopManagerItemRange)this.getTheObject()).findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        return ((PersistentShopManagerItemRange)this.getTheObject()).getLength();
    }
    public ItemSearchList getList() 
				throws PersistenceException{
        return ((PersistentShopManagerItemRange)this.getTheObject()).getList();
    }
    public java.util.Iterator<PersistentItem> iterator() 
				throws PersistenceException{
        return ((PersistentShopManagerItemRange)this.getTheObject()).iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShopManagerItemRange)this.getTheObject()).update(event);
    }

    
}
