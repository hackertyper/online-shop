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
    public PersistentStandardDelivery getStandardDelivery() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getStandardDelivery();
    }
    public void setStandardDelivery(PersistentStandardDelivery newValue) throws PersistenceException {
        ((PersistentShopkeeper)this.getTheObject()).setStandardDelivery(newValue);
    }
    public PersistentOverNightDelivery getOnDelivery() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getOnDelivery();
    }
    public void setOnDelivery(PersistentOverNightDelivery newValue) throws PersistenceException {
        ((PersistentShopkeeper)this.getTheObject()).setOnDelivery(newValue);
    }
    public SubjInterface getSubService() throws PersistenceException {
        return ((PersistentShopkeeper)this.getTheObject()).getSubService();
    }
    public void setSubService(SubjInterface newValue) throws PersistenceException {
        ((PersistentShopkeeper)this.getTheObject()).setSubService(newValue);
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
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleShopkeeper(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleShopkeeper(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleShopkeeper(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleShopkeeper(this);
    }
    
    
    public void changeCharge(final PersistentCustomerDelivery cd, final long newCharge, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeCharge(cd, newCharge, invoker);
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime, final Invoker invoker) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeTime(cd, newTime, invoker);
    }
    public void deregister(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).deregister(observee);
    }
    public PersistentShopkeeperService getMyServer() 
				throws PersistenceException{
        return ((PersistentShopkeeper)this.getTheObject()).getMyServer();
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).initialize(This, final$$Fields);
    }
    public void register(final ObsInterface observee) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).register(observee);
    }
    public void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).updateObservers(event);
    }
    public void changeCharge(final PersistentCustomerDelivery cd, final long newCharge) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeCharge(cd, newCharge);
    }
    public void changeTime(final PersistentCustomerDelivery cd, final long newTime) 
				throws PersistenceException{
        ((PersistentShopkeeper)this.getTheObject()).changeTime(cd, newTime);
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
