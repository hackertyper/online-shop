package persistence;



import model.visitor.*;

public class ProductGroupICProxi extends ItemICProxi implements PersistentProductGroup{
    
    public ProductGroupICProxi(long objectId) {
        super(objectId);
    }
    public ProductGroupICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theProductGroupFacade
            .getProductGroup(this.getId());
    }
    
    public long getClassId() {
        return 102;
    }
    
    public ProductGroup_ItemListProxi getItemList() throws PersistenceException {
        return ((PersistentProductGroup)this.getTheObject()).getItemList();
    }
    public PersistentProductGroup getThis() throws PersistenceException {
        return ((PersistentProductGroup)this.getTheObject()).getThis();
    }
    
    public void accept(ItemVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleProductGroup(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleProductGroup(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleProductGroup(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleProductGroup(this);
    }
    
    
    public void addItem(final PersistentItem item) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).addItem(item);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).updateObservers(event);
    }
    public void addItemImplementation(final PersistentItem item) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).addItemImplementation(item);
    }
    public void changeDescription(final String newDescription) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).changeDescription(newDescription);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentProductGroup)this.getTheObject()).initializeOnInstantiation();
    }

    
}
