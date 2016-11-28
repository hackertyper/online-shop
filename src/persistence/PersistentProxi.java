package persistence;

import java.util.HashMap;

import common.ProxiInformation;
import common.RPCConstantsAndServices;

abstract class ProxiFactory {
	  abstract AbstractPersistentRoot create(long objectId);
}
abstract class ListProxiFactory {
	  abstract AbstractPersistentRoot create(long objectId, long entryId);
}

public abstract class PersistentProxi extends PersistentRoot implements PersistentProxiInterface {

  private static ProxiFactory [] proxiFactories;
  private static ListProxiFactory [] listProxiFactories;
	
  private static ListProxiFactory [] getTheListProxiFactories(){
	if (listProxiFactories == null){
		listProxiFactories = new ListProxiFactory[137];
        listProxiFactories[98] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AccountListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[1] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ProductGroupListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[2] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[4] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ServerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[114] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RemoveFCartCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[7] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ErrorDisplayListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[10] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[127] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OverNightDeliveryListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[128] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new StandardDeliveryListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[11] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArrivedOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[16] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommandCoordinatorListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[115] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OpenCartListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[83] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[84] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[101] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AddArticleCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[18] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ManufacturerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[19] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new NewlyAddedListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[85] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[21] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new DepositCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[24] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeProductGroupCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[25] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new SendOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[27] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new StartSellingCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[29] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopKeeperOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[30] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeDescriptionCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[97] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AcceptDeliveryCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[130] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new TestDeliveryListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[31] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RemovedFSaleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[33] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RetoureListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[135] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeChargeCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[136] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeTimeCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[87] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AccountManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[122] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[88] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AccountServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[37] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommonDateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[123] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[103] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopManagerItemRangeListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[3] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[6] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopkeeperListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[8] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[9] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OfferedFSaleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[12] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new FindArticleCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[14] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RegisterServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[17] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new WithdrawCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[112] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartManagerArticleListListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[20] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeManuDeliveryCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[22] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[23] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new QuantifiedArticlesListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[26] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangePriceCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[124] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RetoureDeliveryCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[104] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new SubjListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[32] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopkeeperServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[86] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[36] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CheckOutCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[100] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeAmountCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[117] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CheckedOutListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[38] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommandExecuterListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[89] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartManagerListEntryProxi(objectId, entryId);
            }
        };
	}
	return listProxiFactories;
  }
  private static ProxiFactory [] getTheProxiFactories(){
	if (proxiFactories == null){
		proxiFactories = new ProxiFactory [137];
        proxiFactories[98] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AccountProxi(objectId);
            }
        };
        proxiFactories[1] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ProductGroupProxi(objectId);
            }
        };
        proxiFactories[2] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerServiceProxi(objectId);
            }
        };
        proxiFactories[4] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ServerProxi(objectId);
            }
        };
        proxiFactories[114] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RemoveFCartCommandProxi(objectId);
            }
        };
        proxiFactories[7] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ErrorDisplayProxi(objectId);
            }
        };
        proxiFactories[10] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerOrderProxi(objectId);
            }
        };
        proxiFactories[127] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OverNightDeliveryProxi(objectId);
            }
        };
        proxiFactories[128] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new StandardDeliveryProxi(objectId);
            }
        };
        proxiFactories[11] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArrivedOrderProxi(objectId);
            }
        };
        proxiFactories[16] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommandCoordinatorProxi(objectId);
            }
        };
        proxiFactories[115] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OpenCartProxi(objectId);
            }
        };
        proxiFactories[83] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerManagerProxi(objectId);
            }
        };
        proxiFactories[84] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopServiceProxi(objectId);
            }
        };
        proxiFactories[101] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AddArticleCommandProxi(objectId);
            }
        };
        proxiFactories[18] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ManufacturerProxi(objectId);
            }
        };
        proxiFactories[19] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new NewlyAddedProxi(objectId);
            }
        };
        proxiFactories[85] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopManagerProxi(objectId);
            }
        };
        proxiFactories[21] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new DepositCommandProxi(objectId);
            }
        };
        proxiFactories[24] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeProductGroupCommandProxi(objectId);
            }
        };
        proxiFactories[25] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new SendOrderProxi(objectId);
            }
        };
        proxiFactories[27] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new StartSellingCommandProxi(objectId);
            }
        };
        proxiFactories[29] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopKeeperOrderProxi(objectId);
            }
        };
        proxiFactories[30] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeDescriptionCommandProxi(objectId);
            }
        };
        proxiFactories[97] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AcceptDeliveryCommandProxi(objectId);
            }
        };
        proxiFactories[130] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new TestDeliveryProxi(objectId);
            }
        };
        proxiFactories[31] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RemovedFSaleProxi(objectId);
            }
        };
        proxiFactories[33] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RetoureProxi(objectId);
            }
        };
        proxiFactories[135] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeChargeCommandProxi(objectId);
            }
        };
        proxiFactories[136] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeTimeCommandProxi(objectId);
            }
        };
        proxiFactories[87] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AccountManagerProxi(objectId);
            }
        };
        proxiFactories[122] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderServiceProxi(objectId);
            }
        };
        proxiFactories[88] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AccountServiceProxi(objectId);
            }
        };
        proxiFactories[37] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommonDateProxi(objectId);
            }
        };
        proxiFactories[123] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderManagerProxi(objectId);
            }
        };
        proxiFactories[103] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopManagerItemRangeProxi(objectId);
            }
        };
        proxiFactories[3] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderCommandProxi(objectId);
            }
        };
        proxiFactories[6] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopkeeperProxi(objectId);
            }
        };
        proxiFactories[8] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArticleProxi(objectId);
            }
        };
        proxiFactories[9] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OfferedFSaleProxi(objectId);
            }
        };
        proxiFactories[12] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new FindArticleCommandProxi(objectId);
            }
        };
        proxiFactories[14] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RegisterServiceProxi(objectId);
            }
        };
        proxiFactories[17] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new WithdrawCommandProxi(objectId);
            }
        };
        proxiFactories[112] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CartManagerArticleListProxi(objectId);
            }
        };
        proxiFactories[20] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeManuDeliveryCommandProxi(objectId);
            }
        };
        proxiFactories[22] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CartProxi(objectId);
            }
        };
        proxiFactories[23] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new QuantifiedArticlesProxi(objectId);
            }
        };
        proxiFactories[26] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangePriceCommandProxi(objectId);
            }
        };
        proxiFactories[124] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RetoureDeliveryCommandProxi(objectId);
            }
        };
        proxiFactories[104] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new SubjProxi(objectId);
            }
        };
        proxiFactories[32] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopkeeperServiceProxi(objectId);
            }
        };
        proxiFactories[86] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CartServiceProxi(objectId);
            }
        };
        proxiFactories[36] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CheckOutCommandProxi(objectId);
            }
        };
        proxiFactories[100] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeAmountCommandProxi(objectId);
            }
        };
        proxiFactories[117] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CheckedOutProxi(objectId);
            }
        };
        proxiFactories[38] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommandExecuterProxi(objectId);
            }
        };
        proxiFactories[89] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CartManagerProxi(objectId);
            }
        };
	}
	return proxiFactories;
  }

  public static PersistentProxiInterface createProxi(ProxiInformation proxi) throws PersistenceException{
	  if (proxi.isDecorator()){
		  Decoratees resultDecoratee = (Decoratees) createProxi(proxi.getDecorateeObjectId(), proxi.getDecorateeClassId());
		  PersistentProxiInterface resultDecorator = (PersistentProxiInterface) resultDecoratee.createDecorator();
		  resultDecorator.setId(proxi.getObjectId());
		  return resultDecorator;
	  } else {
		  return createProxi(proxi.getObjectId(), proxi.getClassId());
	  }
  }

  public static PersistentProxiInterface createProxi(long objectId, long classId) throws PersistenceException {
    int index = (int) classId;
    if (classId == RPCConstantsAndServices.NullClassID) return null; 
	if (index < 0) index = index * -1;
    index = index - 101;
    if (index > getTheProxiFactories().length) throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    ProxiFactory factory = getTheProxiFactories()[index];
    if (factory == null)  throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    PersistentProxiInterface result =  (PersistentProxiInterface)factory.create(objectId);
    result.getTheObject();
    return result;
  }
  public static PersistentListEntryProxi createListEntryProxi(long objectId, long classId, long entryId) throws PersistenceException {
    int index = (int) classId;
	if (index < 0) index = index * -1;
    index = index - 101;
    if (index > getTheListProxiFactories().length) throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    ListProxiFactory factory = getTheListProxiFactories()[index];
    if (factory == null)  throw new PersistenceException("Unknown class :" + Long.toString(classId),0);
    PersistentListEntryProxi result =  (PersistentListEntryProxi)factory.create(objectId,entryId);
    result.getTheObject();
    return result;
  }

	private PersistentInCacheProxi object;

	protected PersistentProxi(long id) {
		super(id);
		this.object = null;
	}

	protected PersistentProxi(PersistentInCacheProxi object) {
		//TODO (GOJA) Still needed for Decorator???
		super(object.getId());
		this.object = object;
		this.object.incrementUserCount();
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

	public void setObject(PersistentRoot object) {
		if (this.object == null)
			this.object = (PersistentInCacheProxi)object;
	}

	public HashMap<String,Object> toHashtable(int depth, int essentialLevel, boolean forGUI, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot iCRroxi = this.getTheObject();
		if (iCRroxi == null) return null;
		return iCRroxi.toHashtable(depth, essentialLevel, forGUI, tdObserver);
	}
	public HashMap<String, Object> toHashtable(HashMap<String, Object> allResults, int depth, int essentialLevel, boolean forGUI, boolean leaf, TDObserver tdObserver) throws PersistenceException {
		PersistentRoot iCRroxi = this.getTheObject();
		if (iCRroxi == null) return null;
		return iCRroxi.toHashtable(allResults, depth, essentialLevel, forGUI, leaf, tdObserver);
	}

	public PersistentRoot getTheObject() throws PersistenceException {
		if (this.object == null) {
			this.object = Cache.getTheCache().get(this);
			this.object.incrementUserCount();
		}
		return this.object;
	}
	public boolean hasEssentialFields() throws PersistenceException{
		return this.getTheObject().hasEssentialFields();
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
	public void delete$Me() throws PersistenceException {
		this.getTheObject().delete$Me();
	}
	public Anything getThis() throws PersistenceException {
		return this.getTheObject().getThis();
	}
	
	
    protected void setDltd() throws PersistenceException{
        this.getTheObject().setDltd();
    }
    public boolean isDltd() throws PersistenceException {
        return this.getTheObject().isDltd();
    }
	
	
//	public void finalize(){
//		if (this.object != null)this.object.decrementUserCount();
//	}
}
