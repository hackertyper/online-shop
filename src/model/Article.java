
package model;

import persistence.*;
import model.visitor.*;


/* Additional import section end */

public class Article extends model.Item implements PersistentArticle{
    
    
    public static PersistentArticle createArticle(String description,PersistentManufacturer manufacturer,long price,long minStock,long maxStock,long manuDelivery) throws PersistenceException{
        return createArticle(description,manufacturer,price,minStock,maxStock,manuDelivery,false);
    }
    
    public static PersistentArticle createArticle(String description,PersistentManufacturer manufacturer,long price,long minStock,long maxStock,long manuDelivery,boolean delayed$Persistence) throws PersistenceException {
        PersistentArticle result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticleFacade
                .newDelayedArticle(description,price,minStock,maxStock,manuDelivery,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticleFacade
                .newArticle(description,price,minStock,maxStock,manuDelivery,0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("description", description);
        final$$Fields.put("manufacturer", manufacturer);
        final$$Fields.put("price", price);
        final$$Fields.put("minStock", minStock);
        final$$Fields.put("maxStock", maxStock);
        final$$Fields.put("manuDelivery", manuDelivery);
        result.initialize(result, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public static PersistentArticle createArticle(String description,PersistentManufacturer manufacturer,long price,long minStock,long maxStock,long manuDelivery,boolean delayed$Persistence,PersistentArticle This) throws PersistenceException {
        PersistentArticle result = null;
        if(delayed$Persistence){
            result = ConnectionHandler.getTheConnectionHandler().theArticleFacade
                .newDelayedArticle(description,price,minStock,maxStock,manuDelivery,0);
            result.setDelayed$Persistence(true);
        }else{
            result = ConnectionHandler.getTheConnectionHandler().theArticleFacade
                .newArticle(description,price,minStock,maxStock,manuDelivery,0,-1);
        }
        java.util.HashMap<String,Object> final$$Fields = new java.util.HashMap<String,Object>();
        final$$Fields.put("description", description);
        final$$Fields.put("manufacturer", manufacturer);
        final$$Fields.put("price", price);
        final$$Fields.put("minStock", minStock);
        final$$Fields.put("maxStock", maxStock);
        final$$Fields.put("manuDelivery", manuDelivery);
        result.initialize(This, final$$Fields);
        result.initializeOnCreation();
        return result;
    }
    
    public java.util.HashMap<String,Object> toHashtable(java.util.HashMap<String,Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
    java.util.HashMap<String,Object> result = null;
        if (depth > 0 && essentialLevel <= common.RPCConstantsAndServices.EssentialDepth){
            result = super.toHashtable(allResults, depth, essentialLevel, forGUI, false, tdObserver);
            AbstractPersistentRoot manufacturer = (AbstractPersistentRoot)this.getManufacturer();
            if (manufacturer != null) {
                result.put("manufacturer", manufacturer.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    manufacturer.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && manufacturer.hasEssentialFields())manufacturer.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot state = (AbstractPersistentRoot)this.getState();
            if (state != null) {
                result.put("state", state.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    state.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && state.hasEssentialFields())state.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            AbstractPersistentRoot myWrapper = (AbstractPersistentRoot)this.getMyWrapper();
            if (myWrapper != null) {
                result.put("myWrapper", myWrapper.createProxiInformation(false, essentialLevel <= 1));
                if(depth > 1) {
                    myWrapper.toHashtable(allResults, depth - 1, essentialLevel, forGUI, true , tdObserver);
                }else{
                    if(forGUI && myWrapper.hasEssentialFields())myWrapper.toHashtable(allResults, depth, essentialLevel + 1, false, true, tdObserver);
                }
            }
            result.put("price", new Long(this.getPrice()).toString());
            result.put("minStock", new Long(this.getMinStock()).toString());
            result.put("maxStock", new Long(this.getMaxStock()).toString());
            result.put("manuDelivery", new Long(this.getManuDelivery()).toString());
            result.put("stock", new Long(this.getStock()).toString());
            String uniqueKey = common.RPCConstantsAndServices.createHashtableKey(this.getClassId(), this.getId());
            if (leaf && !allResults.containsKey(uniqueKey)) allResults.put(uniqueKey, result);
        }
        return result;
    }
    
    public Article provideCopy() throws PersistenceException{
        Article result = this;
        result = new Article(this.description, 
                             this.subService, 
                             this.This, 
                             this.manufacturer, 
                             this.state, 
                             this.myWrapper, 
                             this.price, 
                             this.minStock, 
                             this.maxStock, 
                             this.manuDelivery, 
                             this.stock, 
                             this.getId());
        this.copyingPrivateUserAttributes(result);
        return result;
    }
    
    public boolean hasEssentialFields() throws PersistenceException{
        return false;
    }
    protected PersistentManufacturer manufacturer;
    protected ArticleState state;
    protected PersistentArticleWrapper myWrapper;
    protected long price;
    protected long minStock;
    protected long maxStock;
    protected long manuDelivery;
    protected long stock;
    
    public Article(String description,SubjInterface subService,PersistentItem This,PersistentManufacturer manufacturer,ArticleState state,PersistentArticleWrapper myWrapper,long price,long minStock,long maxStock,long manuDelivery,long stock,long id) throws PersistenceException {
        /* Shall not be used by clients for object construction! Use static create operation instead! */
        super((String)description,(SubjInterface)subService,(PersistentItem)This,id);
        this.manufacturer = manufacturer;
        this.state = state;
        this.myWrapper = myWrapper;
        this.price = price;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.manuDelivery = manuDelivery;
        this.stock = stock;        
    }
    
    static public long getTypeId() {
        return 109;
    }
    
    public long getClassId() {
        return getTypeId();
    }
    
    public void store() throws PersistenceException {
        if(!this.isDelayed$Persistence()) return;
        if (this.getClassId() == 109) ConnectionHandler.getTheConnectionHandler().theArticleFacade
            .newArticle(description,price,minStock,maxStock,manuDelivery,stock,this.getId());
        super.store();
        if(this.getManufacturer() != null){
            this.getManufacturer().store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.manufacturerSet(this.getId(), getManufacturer());
        }
        if(this.getState() != null){
            this.getState().store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.stateSet(this.getId(), getState());
        }
        if(this.getMyWrapper() != null){
            this.getMyWrapper().store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.myWrapperSet(this.getId(), getMyWrapper());
        }
        
    }
    
    public PersistentManufacturer getManufacturer() throws PersistenceException {
        return this.manufacturer;
    }
    public void setManufacturer(PersistentManufacturer newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.manufacturer)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.manufacturer = (PersistentManufacturer)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.manufacturerSet(this.getId(), newValue);
        }
    }
    public ArticleState getState() throws PersistenceException {
        return this.state;
    }
    public void setState(ArticleState newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.state)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.state = (ArticleState)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.stateSet(this.getId(), newValue);
        }
    }
    public PersistentArticleWrapper getMyWrapper() throws PersistenceException {
        return this.myWrapper;
    }
    public void setMyWrapper(PersistentArticleWrapper newValue) throws PersistenceException {
        if (newValue == null) throw new PersistenceException("Null values not allowed!", 0);
        if(newValue.isTheSameAs(this.myWrapper)) return;
        long objectId = newValue.getId();
        long classId = newValue.getClassId();
        this.myWrapper = (PersistentArticleWrapper)PersistentProxi.createProxi(objectId, classId);
        if(!this.isDelayed$Persistence()){
            newValue.store();
            ConnectionHandler.getTheConnectionHandler().theArticleFacade.myWrapperSet(this.getId(), newValue);
        }
    }
    public long getPrice() throws PersistenceException {
        return this.price;
    }
    public void setPrice(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theArticleFacade.priceSet(this.getId(), newValue);
        this.price = newValue;
    }
    public long getMinStock() throws PersistenceException {
        return this.minStock;
    }
    public void setMinStock(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theArticleFacade.minStockSet(this.getId(), newValue);
        this.minStock = newValue;
    }
    public long getMaxStock() throws PersistenceException {
        return this.maxStock;
    }
    public void setMaxStock(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theArticleFacade.maxStockSet(this.getId(), newValue);
        this.maxStock = newValue;
    }
    public long getManuDelivery() throws PersistenceException {
        return this.manuDelivery;
    }
    public void setManuDelivery(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theArticleFacade.manuDeliverySet(this.getId(), newValue);
        this.manuDelivery = newValue;
    }
    public long getStock() throws PersistenceException {
        return this.stock;
    }
    public void setStock(long newValue) throws PersistenceException {
        if(!this.isDelayed$Persistence()) ConnectionHandler.getTheConnectionHandler().theArticleFacade.stockSet(this.getId(), newValue);
        this.stock = newValue;
    }
    public PersistentArticle getThis() throws PersistenceException {
        if(this.This == null){
            PersistentArticle result = (PersistentArticle)PersistentProxi.createProxi(this.getId(),this.getClassId());
            result.getTheObject();
            return result;
        }return (PersistentArticle)this.This;
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
    public void accept(SubjInterfaceVisitor visitor) throws PersistenceException {
        visitor.handleArticle(this);
    }
    public <R> R accept(SubjInterfaceReturnVisitor<R>  visitor) throws PersistenceException {
         return visitor.handleArticle(this);
    }
    public <E extends model.UserException>  void accept(SubjInterfaceExceptionVisitor<E> visitor) throws PersistenceException, E {
         visitor.handleArticle(this);
    }
    public <R, E extends model.UserException> R accept(SubjInterfaceReturnExceptionVisitor<R, E>  visitor) throws PersistenceException, E {
         return visitor.handleArticle(this);
    }
    public int getLeafInfo() throws PersistenceException{
        if (this.getManufacturer() != null && this.getManufacturer().getTheObject().getLeafInfo() != 0) return 1;
        if (this.getState() != null && this.getState().getTheObject().getLeafInfo() != 0) return 1;
        if (this.getMyWrapper() != null && this.getMyWrapper().getTheObject().getLeafInfo() != 0) return 1;
        return 0;
    }
    
    
    public void changeManuDelivery(final long newManuDelivery, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangeManuDeliveryCommand command = model.meta.ChangeManuDeliveryCommand.createChangeManuDeliveryCommand(newManuDelivery, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changePrice(final long newPrice, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangePriceCommand command = model.meta.ChangePriceCommand.createChangePriceCommand(newPrice, now, now);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public void changeProductGroup(final PersistentProductGroup newPG, final Invoker invoker) 
				throws PersistenceException{
        java.sql.Date now = new java.sql.Date(new java.util.Date().getTime());
		PersistentChangeProductGroupCommand command = model.meta.ChangeProductGroupCommand.createChangeProductGroupCommand(now, now);
		command.setNewPG(newPG);
		command.setInvoker(invoker);
		command.setCommandReceiver(getThis());
		model.meta.CommandCoordinator.getTheCommandCoordinator().coordinate(command);
    }
    public synchronized void deregister(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.deregister(observee);
    }
    public void initialize(final Anything This, final java.util.HashMap<String,Object> final$$Fields) 
				throws PersistenceException{
        this.setThis((PersistentArticle)This);
		if(this.isTheSameAs(This)){
			this.setDescription((String)final$$Fields.get("description"));
			this.setManufacturer((PersistentManufacturer)final$$Fields.get("manufacturer"));
			this.setPrice((Long)final$$Fields.get("price"));
			this.setMinStock((Long)final$$Fields.get("minStock"));
			this.setMaxStock((Long)final$$Fields.get("maxStock"));
			this.setManuDelivery((Long)final$$Fields.get("manuDelivery"));
		}
    }
    public synchronized void register(final ObsInterface observee) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.register(observee);
    }
    public synchronized void updateObservers(final model.meta.Mssgs event) 
				throws PersistenceException{
        SubjInterface subService = getThis().getSubService();
		if (subService == null) {
			subService = model.Subj.createSubj(this.isDelayed$Persistence());
			getThis().setSubService(subService);
		}
		subService.updateObservers(event);
    }
    
    
    // Start of section that contains operations that must be implemented.
    
    public void changeManuDelivery(final long newManuDelivery) 
				throws PersistenceException{
        //TODO: implement method: changeManuDelivery
        
    }
    public void changePrice(final long newPrice) 
				throws PersistenceException{
        //TODO: implement method: changePrice
        
    }
    public void changeProductGroup(final PersistentProductGroup newPG) 
				throws PersistenceException{
        //TODO: implement method: changeProductGroup
        
    }
    public void copyingPrivateUserAttributes(final Anything copy) 
				throws PersistenceException{
    }
    /**
     * Reverses the reservation of an article.
     * @see {@link #reserve(long) reserve }
     * 
     * @param amount - amount which was reserved and is freed.
     */
    public void deleteReserve(final long amount) 
				throws PersistenceException{
    	getThis().setStock(getThis().getStock() + amount);
    }
    public void initializeOnCreation() 
				throws PersistenceException{
        super.initializeOnCreation();
        getThis().setState(NewlyAdded.createNewlyAdded());
        getThis().setMyWrapper(ArticleWrapper.createArticleWrapper());
    }
    public void initializeOnInstantiation() 
				throws PersistenceException{
        super.initializeOnInstantiation();
    }
    /**
     * Models the packing of the articles. Causes {@link OfferedFSale#reorder(long, long) reorder} if stock < minimum.
     */
    public void pack(final long amount) 
				throws PersistenceException{
        if(getThis().getStock() < getThis().getMinStock()) {
        	getThis().getState().accept(new ArticleStateVisitor() {
				@Override
				public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException {}
				@Override
				public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException {}
				
				@Override
				public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException {
					offeredFSale.reorder(getThis().getMaxStock()-getThis().getStock(), getThis().getManuDelivery());
				}
			});
        }
    }
    public void receiveDelivery(final long amount) 
				throws PersistenceException{
        getThis().setStock(getThis().getStock() + amount);
    }
    /**
     * Reserves a given amount of this article through reducing the stock.
     * 
     * @param amount - the amount by which the stock should be reduced
     * @throws InsufficientStock if amount > stock
     */
    public void reserve(final long amount) 
				throws model.InsufficientStock, PersistenceException{
    	if(amount > getThis().getStock()) {
    		throw new InsufficientStock(serverConstants.ErrorMessages.InsufficientStock);
    	}
    	getThis().setStock(getThis().getStock() - amount);
    }
    
    
    // Start of section that contains overridden operations only.
    
    public void changeDescription(final String newDescription) 
				throws PersistenceException{
		getThis().setDescription(newDescription);
	}

    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
}
