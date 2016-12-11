package persistence;

import java.util.HashMap;

abstract class ICProxiFactory {
	  abstract PersistentInCacheProxi create(long objectId);
}

public abstract class PersistentInCacheProxi extends PersistentRoot {

	  private static ICProxiFactory [] iCProxiFactories;
		
	  private static ICProxiFactory [] getTheICProxiFactories(){
		if (iCProxiFactories == null){
			iCProxiFactories = new ICProxiFactory[178];
        iCProxiFactories[47] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AccountICProxi(objectId);
            }
        };
        iCProxiFactories[48] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[39] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerServiceICProxi(objectId);
            }
        };
        iCProxiFactories[1] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ServerICProxi(objectId);
            }
        };
        iCProxiFactories[49] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RemoveFCartCommandICProxi(objectId);
            }
        };
        iCProxiFactories[2] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ErrorDisplayICProxi(objectId);
            }
        };
        iCProxiFactories[50] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerOrderICProxi(objectId);
            }
        };
        iCProxiFactories[51] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OverNightDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[52] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartManagerOnDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[53] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new StandardDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[54] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArrivedOrderICProxi(objectId);
            }
        };
        iCProxiFactories[55] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeMaxStockCommandICProxi(objectId);
            }
        };
        iCProxiFactories[56] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerPresetsICProxi(objectId);
            }
        };
        iCProxiFactories[57] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerOrderArticleListICProxi(objectId);
            }
        };
        iCProxiFactories[0] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommandCoordinatorICProxi(objectId);
            }
        };
        iCProxiFactories[59] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new QuantifiedArticlesArticleICProxi(objectId);
            }
        };
        iCProxiFactories[60] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OpenCartICProxi(objectId);
            }
        };
        iCProxiFactories[61] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CustomerManagerICProxi(objectId);
            }
        };
        iCProxiFactories[62] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopServiceICProxi(objectId);
            }
        };
        iCProxiFactories[63] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AddArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[64] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ManufacturerICProxi(objectId);
            }
        };
        iCProxiFactories[65] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new NewlyAddedICProxi(objectId);
            }
        };
        iCProxiFactories[66] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PreorderCommandICProxi(objectId);
            }
        };
        iCProxiFactories[67] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopManagerICProxi(objectId);
            }
        };
        iCProxiFactories[68] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartManagerStandardDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[69] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new DepositCommandICProxi(objectId);
            }
        };
        iCProxiFactories[70] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeProductGroupCommandICProxi(objectId);
            }
        };
        iCProxiFactories[71] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new SendOrderICProxi(objectId);
            }
        };
        iCProxiFactories[72] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PreOrderArticleListICProxi(objectId);
            }
        };
        iCProxiFactories[73] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new StartSellingCommandICProxi(objectId);
            }
        };
        iCProxiFactories[74] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopKeeperOrderICProxi(objectId);
            }
        };
        iCProxiFactories[75] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeDescriptionCommandICProxi(objectId);
            }
        };
        iCProxiFactories[77] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AcceptDeliveryCommandICProxi(objectId);
            }
        };
        iCProxiFactories[78] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new TestDeliveryICProxi(objectId);
            }
        };
        iCProxiFactories[79] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RemovedFSaleICProxi(objectId);
            }
        };
        iCProxiFactories[80] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RetoureICProxi(objectId);
            }
        };
        iCProxiFactories[81] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeChargeCommandICProxi(objectId);
            }
        };
        iCProxiFactories[82] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeTimeCommandICProxi(objectId);
            }
        };
        iCProxiFactories[83] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AccountManagerICProxi(objectId);
            }
        };
        iCProxiFactories[84] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderServiceICProxi(objectId);
            }
        };
        iCProxiFactories[85] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new AccountServiceICProxi(objectId);
            }
        };
        iCProxiFactories[3] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommonDateICProxi(objectId);
            }
        };
        iCProxiFactories[86] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderManagerICProxi(objectId);
            }
        };
        iCProxiFactories[87] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArticleWrapperICProxi(objectId);
            }
        };
        iCProxiFactories[88] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PresetBalanceCommandICProxi(objectId);
            }
        };
        iCProxiFactories[89] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeRetourePercentageCommandICProxi(objectId);
            }
        };
        iCProxiFactories[90] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OrderCommandICProxi(objectId);
            }
        };
        iCProxiFactories[91] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopkeeperICProxi(objectId);
            }
        };
        iCProxiFactories[92] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ArticleICProxi(objectId);
            }
        };
        iCProxiFactories[93] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new OfferedFSaleICProxi(objectId);
            }
        };
        iCProxiFactories[94] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PreOrderICProxi(objectId);
            }
        };
        iCProxiFactories[96] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RetoureArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[175] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new BasicProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[97] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new PresetLowerLimitCommandICProxi(objectId);
            }
        };
        iCProxiFactories[98] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new FindArticleCommandICProxi(objectId);
            }
        };
        iCProxiFactories[99] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopkeeperBasicProductGroupICProxi(objectId);
            }
        };
        iCProxiFactories[41] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RegisterServiceICProxi(objectId);
            }
        };
        iCProxiFactories[100] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new WithdrawCommandICProxi(objectId);
            }
        };
        iCProxiFactories[101] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartManagerArticleListICProxi(objectId);
            }
        };
        iCProxiFactories[102] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartICProxi(objectId);
            }
        };
        iCProxiFactories[103] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new QuantifiedArticlesICProxi(objectId);
            }
        };
        iCProxiFactories[104] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangePriceCommandICProxi(objectId);
            }
        };
        iCProxiFactories[105] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new RetoureDeliveryCommandICProxi(objectId);
            }
        };
        iCProxiFactories[106] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeMinStockCommandICProxi(objectId);
            }
        };
        iCProxiFactories[108] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new SubjICProxi(objectId);
            }
        };
        iCProxiFactories[109] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CancelCommandICProxi(objectId);
            }
        };
        iCProxiFactories[42] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ShopkeeperServiceICProxi(objectId);
            }
        };
        iCProxiFactories[110] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CartServiceICProxi(objectId);
            }
        };
        iCProxiFactories[112] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CheckOutCommandICProxi(objectId);
            }
        };
        iCProxiFactories[113] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new ChangeAmountCommandICProxi(objectId);
            }
        };
        iCProxiFactories[114] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CheckedOutICProxi(objectId);
            }
        };
        iCProxiFactories[4] = new ICProxiFactory(){
            PersistentInCacheProxi create(long objectId){
                return new CommandExecuterICProxi(objectId);
            }
        };
        iCProxiFactories[115] = new ICProxiFactory(){
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
