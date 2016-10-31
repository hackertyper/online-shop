package persistence;


import model.visitor.*;

public interface ShopManagerItemRange4Public extends Anything, PersistentListProxiInterface<PersistentItem>, ObsInterface, AbstractPersistentProxi {
    
    public ShopManagerItemRange_ObserveeProxi getObservee() throws PersistenceException ;
    
    public void accept(AnythingVisitor visitor) throws PersistenceException;
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    public void accept(ObsInterfaceVisitor visitor) throws PersistenceException;
    public <R> R accept(ObsInterfaceReturnVisitor<R>  visitor) throws PersistenceException;
    public <E extends model.UserException>  void accept(ObsInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E;
    public <R, E extends model.UserException> R accept(ObsInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E;
    
    public void add(final PersistentItem observee) 
				throws PersistenceException;
    public <E extends model.UserException,R> R aggregateException(final persistence.AggregtionException<PersistentItem,R,E> aggregtion) 
				throws E, PersistenceException;
    public <R> R aggregate(final persistence.Aggregtion<PersistentItem,R> aggregtion) 
				throws PersistenceException;
    public <E extends model.UserException> void applyToAllException(final persistence.ProcdureException<PersistentItem,E> procdure) 
				throws E, PersistenceException;
    public void applyToAll(final persistence.Procdure<PersistentItem> procdure) 
				throws PersistenceException;
    public <E extends model.UserException> void filterException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException;
    public void filter(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> SearchListRoot<PersistentItem> findAllException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException;
    public SearchListRoot<PersistentItem> findAll(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> PersistentItem findFirstException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException;
    public PersistentItem findFirst(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException;
    public long getLength() 
				throws PersistenceException;
    public ItemSearchList getList() 
				throws PersistenceException;
    public java.util.Iterator<PersistentItem> iterator() 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstFailureException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstFailure(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException;
    public <E extends model.UserException> void removeFirstSuccessException(final persistence.PredcateException<PersistentItem,E> predcate) 
				throws E, PersistenceException;
    public void removeFirstSuccess(final persistence.Predcate<PersistentItem> predcate) 
				throws PersistenceException;
    public void update(final model.meta.Mssgs event) 
				throws PersistenceException;

}

