package model;

import persistence.*;

public class ToString$Visitor extends model.visitor.ToString$Visitor {

	private String result;
	
	public ToString$Visitor() {
	}
	public synchronized String toString(Anything anything) throws PersistenceException {
		try {
			result = null;
			anything.accept(this);
			if (result == null) {
				this.standardHandling(anything);
			} else {
				if (common.RPCConstantsAndServices.test) 
					result = " " + anything.getClassId() + " , " + anything.getId() + "::  " + result; 
			}
		} catch (Exception ex){
			System.out.println("During toString of " + anything.getClass() + " happened " + ex);
			this.standardHandling(anything);
		}
		return result;
	}
	
	protected void standardHandling(Anything anything) {
		result = anything.getClassId() + ";" + anything.getId();
	}
	
	@Override
	public void handleAccount(PersistentAccount account) throws PersistenceException {
		result = serverConstants.StringConstants.AccountBalance + account.getBalance();
	}
	@Override
	public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException {
		result = productGroup.getDescription();
	}
	@Override
	public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException {
	}
	@Override
	public void handleServer(PersistentServer server) throws PersistenceException {
	}
	@Override
	public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException {
	}
	@Override
	public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException {
		result = "Im Verkauf";
	}
	@Override
	public void handleArticle(PersistentArticle article) throws PersistenceException {
		result = article.getDescription() + " (" + article.getState().toString() + ")";
	}
	@SuppressWarnings("deprecation")
	@Override
	public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException {
		result = serverConstants.StringConstants.Order + 
				customerOrder.getSentDate().getDate() + serverConstants.StringConstants.Point + customerOrder.getSentDate().getMonth() + serverConstants.StringConstants.PointWBlank + 
				customerOrder.getSentDate().getHours() + serverConstants.StringConstants.ColonSeparator + customerOrder.getSentDate().getMinutes() +
				customerOrder.getMyState().toString();
	}
	@Override
	public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException {
		result = "";
	}
	@Override
	public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException {
	}
	@Override
	public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException {
		result = manufacturer.getName();
	}
	@Override
	public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException {
		result = "Neuer Artikel";
		
	}
	@Override
	public void handleCart(PersistentCart cart) throws PersistenceException {
		result = serverConstants.StringConstants.CartSum + cart.getCurrentSum();
	}
	@Override
	public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException {
		result = quantifiedArticles.getArticle() + " " + serverConstants.StringConstants.Amount + quantifiedArticles.getAmount();
	}
	@SuppressWarnings("deprecation")
	@Override
	public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException {
		result = serverConstants.StringConstants.ExpectedArrivalDate +
				sendOrder.getArrivalDate().getDate() + serverConstants.StringConstants.Point + sendOrder.getArrivalDate().getMonth() + serverConstants.StringConstants.PointWBlank + 
				sendOrder.getArrivalDate().getHours() + serverConstants.StringConstants.ColonSeparator + sendOrder.getArrivalDate().getMinutes();
	}
	@Override
	public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException {
	}
	@Override
	public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException {
		result = "Aus dem Verkauf genommen";
	}
	@Override
	public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException {
	}
	@Override
	public void handleRetoure(PersistentRetoure retoure) throws PersistenceException {
	}
	@Override
	public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException {
	}
	@Override
	public void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException {
	}
	@Override
	public void handleShopService(PersistentShopService shopService) throws PersistenceException {
	}
	@Override
	public void handleShopManager(PersistentShopManager shopManager) throws PersistenceException {
	}
	@Override
	public void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException {
	}
	@Override
	public void handleOrderService(PersistentOrderService orderService) throws PersistenceException {
	}
	@Override
	public void handleAccountService(PersistentAccountService accountService) throws PersistenceException {
	}
	@Override
	public void handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException {
	}
	@Override
	public void handleCartService(PersistentCartService cartService) throws PersistenceException {
	}
	@Override
	public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException {
	}
	@Override
	public void handleCartManager(PersistentCartManager cartManager) throws PersistenceException {
	}
	@Override
	public void handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException {
		result = serverConstants.StringConstants.ONDelivery + overNightDelivery.getTime() + serverConstants.StringConstants.Charge + overNightDelivery.getExtraCharge();
	}
	@Override
	public void handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException {
		result = serverConstants.StringConstants.StandardDelivery + standardDelivery.getTime() + serverConstants.StringConstants.Charge + standardDelivery.getExtraCharge();
	}
	@Override
	public void handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException {	
	}
	@Override
	public void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException {
		result = articleWrapper.getMyArticle().getDescription();
	}
	@Override
	public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException {
		result = serverConstants.StringConstants.PreOrder + " " + serverConstants.StringConstants.CartSum + preOrder.getSum();
	}
	@Override
	public void handleCustomerPresets(PersistentCustomerPresets customerPresets) throws PersistenceException {
		result = "Standardwerte von Kundenkonten";
	}
	@Override
	public void handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException {
		result = basicProductGroup.getDescription();
	}

}
