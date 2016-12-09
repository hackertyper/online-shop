package persistence;

import java.util.HashMap;

abstract class ICProxiFactory {
	  abstract PersistentInCacheProxi create(long objectId);
}

public abstract class PersistentInCacheProxi extends PersistentRoot {

	  private static ICProxiFactory [] iCProxiFactories;
		
	  private static ICProxiFactory [] getTheICProxiFactories(){
		if (iCProxiFactories == null){
			iCProxiFactories = new ICProxiFactory[180];
        iCProxiFactories[98] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AccountICProxi(objectId);
            }
        };
        iCProxiFactories[1] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[2] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerServiceICProxi(objectId);
            }
        };
        iCProxiFactories[4] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ServerICProxi(objectId);
            }
        };
        iCProxiFactories[114] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RemoveFCartCommandICProxi(objectId);
            }
        };
        iCProxiFactories[7] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ErrorDisplayICProxi(objectId);
            }
        };
        iCProxiFactories[10] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerOrderICProxi(objectId);
            }
        };
        iCProxiFactories[127] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OverNightDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[157] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartManagerOnDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[128] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new StandardDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[11] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArrivedOrderICProxi(objectId);
            }
        };
        iCProxiFactories[169] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeMaxStockCommandICProxi(objectId);
            }
        };
        iCProxiFactories[170] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerPresetsICProxi(objectId);
            }
        };
        iCProxiFactories[151] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerOrderArticleListICProxi(objectId);
            }
        };
        iCProxiFactories[16] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommandCoordinatorICProxi(objectId);
            }
        };
        iCProxiFactories[149] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new QuantifiedArticlesArticleICProxi(objectId);
            }
        };
        iCProxiFactories[115] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OpenCartICProxi(objectId);
            }
        };
        iCProxiFactories[83] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerManagerICProxi(objectId);
            }
        };
        iCProxiFactories[84] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopServiceICProxi(objectId);
            }
        };
        iCProxiFactories[101] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AddArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[18] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ManufacturerICProxi(objectId);
            }
        };
        iCProxiFactories[19] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewlyAddedICProxi(objectId);
            }
        };
        iCProxiFactories[166] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PreorderCommandICProxi(objectId);
            }
        };
        iCProxiFactories[85] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopManagerICProxi(objectId);
            }
        };
        iCProxiFactories[158] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartManagerStandardDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[21] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new DepositCommandICProxi(objectId);
            }
        };
        iCProxiFactories[148] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeProductGroupCommandICProxi(objectId);
            }
        };
        iCProxiFactories[25] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new SendOrderICProxi(objectId);
            }
        };
        iCProxiFactories[163] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PreOrderArticleListICProxi(objectId);
            }
        };
        iCProxiFactories[27] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new StartSellingCommandICProxi(objectId);
            }
        };
        iCProxiFactories[29] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopKeeperOrderICProxi(objectId);
            }
        };
        iCProxiFactories[30] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeDescriptionCommandICProxi(objectId);
            }
        };
        iCProxiFactories[97] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AcceptDeliveryCommandICProxi(objectId);
            }
        };
        iCProxiFactories[130] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new TestDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[31] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RemovedFSaleICProxi(objectId);
            }
        };
        iCProxiFactories[33] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RetoureICProxi(objectId);
            }
        };
        iCProxiFactories[135] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeChargeCommandICProxi(objectId);
            }
        };
        iCProxiFactories[136] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeTimeCommandICProxi(objectId);
            }
        };
        iCProxiFactories[87] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AccountManagerICProxi(objectId);
            }
        };
        iCProxiFactories[122] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderServiceICProxi(objectId);
            }
        };
        iCProxiFactories[88] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AccountServiceICProxi(objectId);
            }
        };
        iCProxiFactories[37] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommonDateICProxi(objectId);
            }
        };
        iCProxiFactories[123] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderManagerICProxi(objectId);
            }
        };
        iCProxiFactories[137] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArticleWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[142] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PresetBalanceCommandICProxi(objectId);
            }
        };
        iCProxiFactories[161] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeRetourePercentageCommandICProxi(objectId);
            }
        };
        iCProxiFactories[3] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderCommandICProxi(objectId);
            }
        };
        iCProxiFactories[6] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopkeeperICProxi(objectId);
            }
        };
        iCProxiFactories[8] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArticleICProxi(objectId);
            }
        };
        iCProxiFactories[9] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OfferedFSaleICProxi(objectId);
            }
        };
        iCProxiFactories[139] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PreOrderICProxi(objectId);
            }
        };
        iCProxiFactories[141] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RetoureArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[178] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new BasicProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[143] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PresetLowerLimitCommandICProxi(objectId);
            }
        };
        iCProxiFactories[12] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new FindArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[171] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopkeeperBasicProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[14] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RegisterServiceICProxi(objectId);
            }
        };
        iCProxiFactories[17] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new WithdrawCommandICProxi(objectId);
            }
        };
        iCProxiFactories[112] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartManagerArticleListICProxi(objectId);
            }
        };
        iCProxiFactories[22] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartICProxi(objectId);
            }
        };
        iCProxiFactories[23] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new QuantifiedArticlesICProxi(objectId);
            }
        };
        iCProxiFactories[26] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangePriceCommandICProxi(objectId);
            }
        };
        iCProxiFactories[124] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RetoureDeliveryCommandICProxi(objectId);
            }
        };
        iCProxiFactories[172] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeMinStockCommandICProxi(objectId);
            }
        };
        iCProxiFactories[173] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopManagerBasicProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[104] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new SubjICProxi(objectId);
            }
        };
        iCProxiFactories[165] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CancelCommandICProxi(objectId);
            }
        };
        iCProxiFactories[32] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopkeeperServiceICProxi(objectId);
            }
        };
        iCProxiFactories[86] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartServiceICProxi(objectId);
            }
        };
        iCProxiFactories[36] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CheckOutCommandICProxi(objectId);
            }
        };
        iCProxiFactories[100] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeAmountCommandICProxi(objectId);
            }
        };
        iCProxiFactories[117] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CheckedOutICProxi(objectId);
            }
        };
        iCProxiFactories[38] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommandExecuterICProxi(objectId);
            }
        };
        iCProxiFactories[89] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartManagerICProxi(objectId);
            }
        };
		}
		return iCProxiFactories;
	  }

	public static PersistentInCacheProxi createInCacheProxi(long objectId, long classId) throws PersistenceException {
	    int index = (int) classId;
		if (index < 0) index = index * -1;
	    index = index - 101;
	    if (index > getTheICProxiFactories().length) throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
	    ICProxiFactory factory = getTheICProxiFactories()[index];
	    if (factory == null)  throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
	    PersistentInCacheProxi result =  factory.create(objectId);
	    return result;
	}

	protected PersistentObject object;
  	public int userCount;
	
	protected PersistentInCacheProxi(long id) {
		super(id);
		this.userCount = 0;
	}

	public PersistentInCacheProxi(PersistentObject object) {
		this(object.getId());
	}
	
	public boolean isDelayed$Persistence() throws PersistenceException {
		return this.getTheObject().isDelayed$Persistence();
	}

	public void setDelayed$Persistence(boolean b) throws PersistenceException {
		this.getTheObject().setDelayed$Persistence(b);
	}
	public void store() throws PersistenceException{
		this.getTheObject().store();
	}

	public void setId(long id) {
		super.setId(id);
		try {
			this.getTheObject().setId(id);
		} catch (PersistenceException e) {
			throw new PersistenceError(e);
		}
	}
	public HashMap<String,Object> toHashtable(int depth, int essentialLevel, boolean forGUI, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot object = this.getTheObject();
		if (object == null) return null;
		return object.toHashtable(depth, essentialLevel, forGUI, tdObserver);
	}
	public HashMap<String, Object> toHashtable(HashMap<String, Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot object = this.getTheObject();
		if (object == null) return null;
		return object.toHashtable(allResults, depth, essentialLevel, forGUI, leaf, tdObserver);
	}

	protected abstract PersistentObject getRemote() throws PersistenceException;

	public synchronized PersistentRoot getTheObject() throws PersistenceException {
		if (this.object == null) this.object = getRemote();
		return this.object;
	}		
	protected synchronized void setObject(PersistentObject object) throws PersistenceException {
		this.object = object;
	}
	protected synchronized void clear() throws PersistenceException {
		this.object = null;
	}
	public int getIconInfo() throws PersistenceException {
		return this.getTheObject().getIconInfo();
	}
	public int getLeafInfo() throws PersistenceException {
		return this.getTheObject().getLeafInfo();
	}
	public String toString() {
		try {
			return this.getTheObject().toString();
		} catch (PersistenceException pe) {
			throw new PersistenceError(pe);
		}
	}
	public String toString(boolean inner)throws PersistenceException{
		try {
			return this.getTheObject().toString(inner);
		} catch (PersistenceException pe) {
			throw new PersistenceError(pe);
		}		
	}

	public synchronized void incrementUserCount() {
		this.userCount++;
	}

	public static long recycleCounter = 0;
	public synchronized void decrementUserCount() {
		this.userCount--;
		if (this.isRemovable()){
			Cache.getTheCache().remove(this);
			PersistentInCacheProxi.recycleCounter ++;
		}
	}

	protected boolean isRemovable() {
		return this.userCount <= 0 ;
	}
	public synchronized void tryBreak() {
		try {
			if (!this.isDelayed$Persistence())this.object = null;
		} catch (PersistenceException e) {
			return;
		}
	}

	public boolean hasEssentialFields() throws PersistenceException{
		return this.getTheObject().hasEssentialFields();
	}
	public void delete$Me() throws PersistenceException {
		this.getTheObject().delete$Me();
	}
	public Anything getThis() throws PersistenceException {
		return this.getTheObject().getThis();
	}
	
    protected void setDltd() throws PersistenceException {
        this.getTheObject().setDltd();
    }
    public boolean isDltd() throws PersistenceException {
        return this.getTheObject().isDltd();
    }

}
