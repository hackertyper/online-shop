package persistence;



import model.visitor.*;

public class ProductGroupItemListICProxi extends PersistentInCacheProxiOptimistic implements PersistentProductGroupItemList{
    
    public ProductGroupItemListICProxi(long objectId) {
        super(objectId);
    }
    public ProductGroupItemListICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theProductGroupItemListFacade
            .getProductGroupItemList(this.getId());
    }
    
    public long getClassId() {
        return 245;
    }
    
    public PersistentProductGroup getObserver() throws PersistenceException {
        return ((PersistentProductGroupItemList)this.getTheObject()).getObserver();
    }
    public void setObserver(PersistentProductGroup newValue) throws PersistenceException {
        ((PersistentProductGroupItemList)this.getTheObject()).setObserver(newValue);
    }
    public ProductGroupItemList_ObserveeProxi getObservee() throws PersistenceException {
        return ((PersistentProductGroupItemList)this.getTheObject()).getObservee();
    }
    public PersistentProductGroupItemList getThis() throws PersistenceException {
        return ((PersistentProductGroupItemList)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProductGroupItemList(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroupItemList(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroupItemList(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroupItemList(this);
    }
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleProductGroupItemList(this);
    }
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroupItemList(this);
    }
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroupItemList(this);
    }
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroupItemList(this);
    }
    
    
    public void add(final PersistentItem observee) 
				throws PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).add(observee);
    }
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<PersistentItem,R,E> aggregtion) 
				throws E, PersistenceException{
        return ((PersistentProductGroupItemList)this.getTheObject()).aggregateException(aggregtion);
    }
    public <R> R aggregate(final persistence.Aggregtion<PersistentItem,R> aggregtion) 
				throws PersistenceException{
        return ((PersistentProductGroupItemList)this.getTheObject()).aggregate(aggregtion);
    }
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<PersistentItem,E> procdure) 
				throws E, PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).applyToAllException(procdure);
    }
    public void applyToAll(final persistence.Procdure<PersistentItem> procdure) 
				throws PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).applyToAll(procdure);
    }
    public <E extends model.UserException> void filterException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).filterException(predcate);
    }
    public void filter(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).filter(predcate);
    }
    public <E extends model.UserException> SearchListRoot<PersistentItem> findAllException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentProductGroupItemList)this.getTheObject()).findAllException(predcate);
    }
    public SearchListRoot<PersistentItem> findAll(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        return ((PersistentProductGroupItemList)this.getTheObject()).findAll(predcate);
    }
    public <E extends model.UserException> PersistentItem findFirstException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        return ((PersistentProductGroupItemList)this.getTheObject()).findFirstException(predcate);
    }
    public PersistentItem findFirst(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        return ((PersistentProductGroupItemList)this.getTheObject()).findFirst(predcate);
    }
    public long getLength() 
				throws PersistenceException{
        return ((PersistentProductGroupItemList)this.getTheObject()).getLength();
    }
    public ItemSearchList getList() 
				throws PersistenceException{
        return ((PersistentProductGroupItemList)this.getTheObject()).getList();
    }
    public java.util.Iterator<PersistentItem> iterator() 
				throws PersistenceException{
        return ((PersistentProductGroupItemList)this.getTheObject()).iterator();
    }
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).removeFirstFailureException(predcate);
    }
    public void removeFirstFailure(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).removeFirstFailure(predcate);
    }
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).removeFirstSuccessException(predcate);
    }
    public void removeFirstSuccess(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).removeFirstSuccess(predcate);
    }
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentProductGroupItemList)this.getTheObject()).update(event);
    }

    
}
