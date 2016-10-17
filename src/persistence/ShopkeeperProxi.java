package persistence;



import model.visitor.*;

public class ShopkeeperProxi extends PersistentProxi implements PersistentShopkeeper{
    
    public ShopkeeperProxi(long objectId) {
        super(objectId);
    }
    public ShopkeeperProxi(PersistentInCacheProxi object) {
        super(object);
    }
    
    
    public long getClassId() {
        return 107;
    }
    
    public Shopkeeper_ItemRangeProxi getItemRange() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getItemRange();
    }
    public PersistentShopkeeper getThis() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getThis();
    }
    
    public void accept(AnythingVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeper(this);
    }
    public <R> R accept(AnythingReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeper(this);
    }
    public <E extends model.UserException>  void accept(AnythingExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeper(this);
    }
    public <R, E extends model.UserException> R accept(AnythingReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeper(this);
    }
    
    
    public PersistentShopkeeperService getMyServer() 
				throws PersistenceException{
        return ((PersistentShopkeeper)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).copyingPrivateUserAttributes(copy);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).initializeOnCreation();
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).initializeOnInstantiation();
    }

    
}