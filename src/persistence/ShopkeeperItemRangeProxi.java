package persistence;



import model.visitor.*;

public class ShopkeeperItemRangeProxi extends PersistentProxi implements PersistentShopkeeperItemRange{
    
    public ShopkeeperItemRangeProxi(long objectId) {
        super(objectId);
    }
    public ShopkeeperItemRangeProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 246;
    }
    
    public PersistentShopkeeper getObserver() throws PersistenceException {
        return ((PersistentShopkeeperItemRange)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentShopkeeper newValue) throws PersistenceException {
        ((PersistentShopkeeperItemRange)this.getTheObject()).setObserver(newValue);
    }
    public ShopkeeperItemRange_ObserveeProxi getObservee() throws PersistenceException {
        return ((PersistentShopkeeperItemRange)this.getTheObject()).getObservee();
    }
    public PersistentShopkeeperItemRange getThis() throws PersistenceException {
        return ((PersistentShopkeeperItemRange)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperItemRange(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperItemRange(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperItemRange(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperItemRange(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeperItemRange(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeperItemRange(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeperItemRange(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeperItemRange(this);
    }
    
    
    public void add(final PersistentItem observee) 
				throws PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<PersistentItem,R,E> aggregtion) 
				throws E, PersistenceException{
        return ((PersistentShopkeeperItemRange)this.getTheObject()).aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<PersistentItem,R> aggregtion) 
				throws PersistenceException{
        return ((PersistentShopkeeperItemRange)this.getTheObject()).aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<PersistentItem,E> procdure) 
				throws E, PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<PersistentItem> procdure) 
				throws PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).filterException(predcate);
    }
    public void filter(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<PersistentItem> findAllException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentShopkeeperItemRange)this.getTheObject()).findAllException(predcate);
    }
    public SearchListRoot<PersistentItem> findAll(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        return ((PersistentShopkeeperItemRange)this.getTheObject()).findAll(predcate);
    }
    public <E extends model.UserException> PersistentItem findFirstException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentShopkeeperItemRange)this.getTheObject()).findFirstException(predcate);
    }
    public PersistentItem findFirst(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        return ((PersistentShopkeeperItemRange)this.getTheObject()).findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        return ((PersistentShopkeeperItemRange)this.getTheObject()).getLength();
    }
    public ItemSearchList getList() 
				throws PersistenceException{
        return ((PersistentShopkeeperItemRange)this.getTheObject()).getList();
    }
    public java.util.Iterator<PersistentItem> iterator() 
				throws PersistenceException{
        return ((PersistentShopkeeperItemRange)this.getTheObject()).iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShopkeeperItemRange)this.getTheObject()).update(event);
    }

    
}
