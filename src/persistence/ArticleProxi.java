package persistence;



import model.visitor.*;

public class ArticleProxi extends ItemProxi implements PersistentArticle{
    
    public ArticleProxi(long objectId) {
        super(objectId);
    }
    public ArticleProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 109;
    }
    
    public PersistentManufacturer getManufacturer() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getManufacturer();
    }
    public void setManufacturer(PersistentManufacturer newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setManufacturer(newValue);
    }
    public ArticleState getState() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getState();
    }
    public void setState(ArticleState newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setState(newValue);
    }
    public long getPrice() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getPrice();
    }
    public void setPrice(long newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setPrice(newValue);
    }
    public long getMinStock() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getMinStock();
    }
    public void setMinStock(long newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setMinStock(newValue);
    }
    public long getMaxStock() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getMaxStock();
    }
    public void setMaxStock(long newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setMaxStock(newValue);
    }
    public long getManuDelivery() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getManuDelivery();
    }
    public void setManuDelivery(long newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setManuDelivery(newValue);
    }
    public long getStock() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getStock();
    }
    public void setStock(long newValue) throws PersistenceException {
        ((PersistentArticle)this.getTheObject()).setStock(newValue);
    }
    public PersistentArticle getThis() throws PersistenceException {
        return ((PersistentArticle)this.getTheObject()).getThis();
    }
    
    public void accept(ItemVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }
    public <R> R accept(ItemReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticle(this);
    }
    public <E extends model.UserException>  void accept(ItemExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends model.UserException> R accept(ItemReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticle(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticle(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticle(this);
    }
    
    
    public void changeDescription(final String newDescription, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeDescription(newDescription, invoker);
    }
    public void changeManuDelivery(final long newManuDelivery, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeManuDelivery(newManuDelivery, invoker);
    }
    public void changePrice(final long newPrice, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).changePrice(newPrice, invoker);
    }
    public void changeProductGroup(final PersistentProductGroup newPG, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeProductGroup(newPG, invoker);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void addToCart(final long amount, final PersistentCart cart) 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentArticle)this.getTheObject()).addToCart(amount, cart);
    }
    public void changeDescription(final String newDescription) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeDescription(newDescription);
    }
    public void changeManuDelivery(final long newManuDelivery) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeManuDelivery(newManuDelivery);
    }
    public void changePrice(final long newPrice) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).changePrice(newPrice);
    }
    public void changeProductGroup(final PersistentProductGroup newPG) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).changeProductGroup(newPG);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).initializeOnInstantiation();
    }
    public void pack(final long amount) 
				throws PersistenceException{
        ((PersistentArticle)this.getTheObject()).pack(amount);
    }
    public void reserve(final long amount) 
				throws model.InsufficientStock, PersistenceException{
        ((PersistentArticle)this.getTheObject()).reserve(amount);
    }

    
}
