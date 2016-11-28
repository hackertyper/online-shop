package persistence;



import model.visitor.*;

public class ShopKeeperOrderICProxi extends DeliveryICProxi implements PersistentShopKeeperOrder{
    
    public ShopKeeperOrderICProxi(long objectId) {
        super(objectId);
    }
    public ShopKeeperOrderICProxi(PersistentObject object) {
        super(object);
    }
    
    protected PersistentObject getRemote() throws PersistenceException {
        return ConnectionHandler.getTheConnectionHandler().theShopKeeperOrderFacade
            .getShopKeeperOrder(this.getId());
    }
    
    public long getClassId() {
        return 130;
    }
    
    public PersistentArticle getArticle() throws PersistenceException {
        return ((PersistentShopKeeperOrder)this.getTheObject()).getArticle();
    }
    public void setArticle(PersistentArticle newValue) throws PersistenceException {
        ((PersistentShopKeeperOrder)this.getTheObject()).setArticle(newValue);
    }
    public long getAmount() throws PersistenceException {
        return ((PersistentShopKeeperOrder)this.getTheObject()).getAmount();
    }
    public void setAmount(long newValue) throws PersistenceException {
        ((PersistentShopKeeperOrder)this.getTheObject()).setAmount(newValue);
    }
    public PersistentShopKeeperOrder getThis() throws PersistenceException {
        return ((PersistentShopKeeperOrder)this.getTheObject()).getThis();
    }
    
    public void accept(DeliveryVisitor visitor) throws PersistenceException {
        visitor.handleShopKeeperOrder(this);
    }
    public <R> R accept(DeliveryReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopKeeperOrder(this);
    }
    public <E extends model.UserException>  void accept(DeliveryExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopKeeperOrder(this);
    }
    public <R, E extends model.UserException> R accept(DeliveryReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopKeeperOrder(this);
    }
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopKeeperOrder(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopKeeperOrder(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopKeeperOrder(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopKeeperOrder(this);
    }
    
    
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopKeeperOrder)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShopKeeperOrder)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void deliver() 
				throws PersistenceException{
        ((PersistentShopKeeperOrder)this.getTheObject()).deliver();
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShopKeeperOrder)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShopKeeperOrder)this.getTheObject()).initializeOnInstantiation();
    }
    public void run() {
        try{
            ((PersistentShopKeeperOrder)this.getTheObject()).run();
        }catch(PersistenceException pe){
            throw new PersistenceError(pe);
        }
    }
    public void send() 
				throws PersistenceException{
        ((PersistentShopKeeperOrder)this.getTheObject()).send();
    }

    
}
