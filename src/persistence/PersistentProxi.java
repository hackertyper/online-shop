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
		listProxiFactories = new ListProxiFactory[179];
        listProxiFactories[47] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AccountListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[48] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ProductGroupListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[39] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[1] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ServerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[49] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RemoveFCartCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[2] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ErrorDisplayListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[50] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[51] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OverNightDeliveryListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[52] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartManagerOnDeliveryListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[53] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new StandardDeliveryListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[54] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArrivedOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[55] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeMaxStockCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[56] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerPresetsListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[57] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerOrderArticleListListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[0] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommandCoordinatorListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[59] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new QuantifiedArticlesArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[60] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OpenCartListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[61] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CustomerManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[62] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[63] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AddArticleCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[64] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ManufacturerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[65] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new NewlyAddedListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[66] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new PreorderCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[67] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[68] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartManagerStandardDeliveryListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[69] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new DepositCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[70] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeProductGroupCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[71] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new SendOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[72] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new PreOrderArticleListListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[73] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new StartSellingCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[74] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopKeeperOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[75] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeDescriptionCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[77] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AcceptDeliveryCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[78] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new TestDeliveryListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[79] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RemovedFSaleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[80] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RetoureListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[81] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeChargeCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[82] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeTimeCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[83] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AccountManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[84] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[85] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new AccountServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[3] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommonDateListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[86] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderManagerListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[87] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArticleWrapperListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[88] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new PresetBalanceCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[89] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeRetourePercentageCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[90] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OrderCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[91] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopkeeperListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[92] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ArticleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[93] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new OfferedFSaleListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[94] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new PreOrderListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[96] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RetoureArticleCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[175] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new BasicProductGroupListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[97] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new PresetLowerLimitCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[98] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new FindArticleCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[99] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopkeeperBasicProductGroupListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[41] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RegisterServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[100] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new WithdrawCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[101] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartManagerArticleListListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[102] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[103] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new QuantifiedArticlesListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[104] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangePriceCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[105] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new RetoureDeliveryCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[106] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeMinStockCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[108] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new SubjListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[109] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CancelCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[42] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ShopkeeperServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[110] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartServiceListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[112] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CheckOutCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[113] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new ChangeAmountCommandListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[114] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CheckedOutListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[4] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CommandExecuterListEntryProxi(objectId, entryId);
            }
        };
        listProxiFactories[115] = new ListProxiFactory(){
            AbstractPersistentRoot create(long objectId, long entryId){
                return new CartManagerListEntryProxi(objectId, entryId);
            }
        };
	}
	return listProxiFactories;
  }
  private static ProxiFactory [] getTheProxiFactories(){
	if (proxiFactories == null){
		proxiFactories = new ProxiFactory [179];
        proxiFactories[47] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AccountProxi(objectId);
            }
        };
        proxiFactories[48] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ProductGroupProxi(objectId);
            }
        };
        proxiFactories[39] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerServiceProxi(objectId);
            }
        };
        proxiFactories[1] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ServerProxi(objectId);
            }
        };
        proxiFactories[49] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RemoveFCartCommandProxi(objectId);
            }
        };
        proxiFactories[2] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ErrorDisplayProxi(objectId);
            }
        };
        proxiFactories[50] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerOrderProxi(objectId);
            }
        };
        proxiFactories[51] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OverNightDeliveryProxi(objectId);
            }
        };
        proxiFactories[52] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CartManagerOnDeliveryProxi(objectId);
            }
        };
        proxiFactories[53] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new StandardDeliveryProxi(objectId);
            }
        };
        proxiFactories[54] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArrivedOrderProxi(objectId);
            }
        };
        proxiFactories[55] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeMaxStockCommandProxi(objectId);
            }
        };
        proxiFactories[56] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerPresetsProxi(objectId);
            }
        };
        proxiFactories[57] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerOrderArticleListProxi(objectId);
            }
        };
        proxiFactories[0] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommandCoordinatorProxi(objectId);
            }
        };
        proxiFactories[59] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new QuantifiedArticlesArticleProxi(objectId);
            }
        };
        proxiFactories[60] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OpenCartProxi(objectId);
            }
        };
        proxiFactories[61] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CustomerManagerProxi(objectId);
            }
        };
        proxiFactories[62] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopServiceProxi(objectId);
            }
        };
        proxiFactories[63] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AddArticleCommandProxi(objectId);
            }
        };
        proxiFactories[64] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ManufacturerProxi(objectId);
            }
        };
        proxiFactories[65] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new NewlyAddedProxi(objectId);
            }
        };
        proxiFactories[66] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new PreorderCommandProxi(objectId);
            }
        };
        proxiFactories[67] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopManagerProxi(objectId);
            }
        };
        proxiFactories[68] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CartManagerStandardDeliveryProxi(objectId);
            }
        };
        proxiFactories[69] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new DepositCommandProxi(objectId);
            }
        };
        proxiFactories[70] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeProductGroupCommandProxi(objectId);
            }
        };
        proxiFactories[71] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new SendOrderProxi(objectId);
            }
        };
        proxiFactories[72] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new PreOrderArticleListProxi(objectId);
            }
        };
        proxiFactories[73] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new StartSellingCommandProxi(objectId);
            }
        };
        proxiFactories[74] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopKeeperOrderProxi(objectId);
            }
        };
        proxiFactories[75] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeDescriptionCommandProxi(objectId);
            }
        };
        proxiFactories[77] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AcceptDeliveryCommandProxi(objectId);
            }
        };
        proxiFactories[78] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new TestDeliveryProxi(objectId);
            }
        };
        proxiFactories[79] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RemovedFSaleProxi(objectId);
            }
        };
        proxiFactories[80] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RetoureProxi(objectId);
            }
        };
        proxiFactories[81] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeChargeCommandProxi(objectId);
            }
        };
        proxiFactories[82] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeTimeCommandProxi(objectId);
            }
        };
        proxiFactories[83] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AccountManagerProxi(objectId);
            }
        };
        proxiFactories[84] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderServiceProxi(objectId);
            }
        };
        proxiFactories[85] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new AccountServiceProxi(objectId);
            }
        };
        proxiFactories[3] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommonDateProxi(objectId);
            }
        };
        proxiFactories[86] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderManagerProxi(objectId);
            }
        };
        proxiFactories[87] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArticleWrapperProxi(objectId);
            }
        };
        proxiFactories[88] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new PresetBalanceCommandProxi(objectId);
            }
        };
        proxiFactories[89] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeRetourePercentageCommandProxi(objectId);
            }
        };
        proxiFactories[90] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OrderCommandProxi(objectId);
            }
        };
        proxiFactories[91] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopkeeperProxi(objectId);
            }
        };
        proxiFactories[92] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ArticleProxi(objectId);
            }
        };
        proxiFactories[93] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new OfferedFSaleProxi(objectId);
            }
        };
        proxiFactories[94] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new PreOrderProxi(objectId);
            }
        };
        proxiFactories[96] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RetoureArticleCommandProxi(objectId);
            }
        };
        proxiFactories[175] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new BasicProductGroupProxi(objectId);
            }
        };
        proxiFactories[97] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new PresetLowerLimitCommandProxi(objectId);
            }
        };
        proxiFactories[98] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new FindArticleCommandProxi(objectId);
            }
        };
        proxiFactories[99] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopkeeperBasicProductGroupProxi(objectId);
            }
        };
        proxiFactories[41] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RegisterServiceProxi(objectId);
            }
        };
        proxiFactories[100] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new WithdrawCommandProxi(objectId);
            }
        };
        proxiFactories[101] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CartManagerArticleListProxi(objectId);
            }
        };
        proxiFactories[102] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CartProxi(objectId);
            }
        };
        proxiFactories[103] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new QuantifiedArticlesProxi(objectId);
            }
        };
        proxiFactories[104] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangePriceCommandProxi(objectId);
            }
        };
        proxiFactories[105] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new RetoureDeliveryCommandProxi(objectId);
            }
        };
        proxiFactories[106] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeMinStockCommandProxi(objectId);
            }
        };
        proxiFactories[108] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new SubjProxi(objectId);
            }
        };
        proxiFactories[109] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CancelCommandProxi(objectId);
            }
        };
        proxiFactories[42] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ShopkeeperServiceProxi(objectId);
            }
        };
        proxiFactories[110] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CartServiceProxi(objectId);
            }
        };
        proxiFactories[112] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CheckOutCommandProxi(objectId);
            }
        };
        proxiFactories[113] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new ChangeAmountCommandProxi(objectId);
            }
        };
        proxiFactories[114] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CheckedOutProxi(objectId);
            }
        };
        proxiFactories[4] = new ProxiFactory(){
            AbstractPersistentRoot create(long objectId){
                return new CommandExecuterProxi(objectId);
            }
        };
        proxiFactories[115] = new ProxiFactory(){
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
