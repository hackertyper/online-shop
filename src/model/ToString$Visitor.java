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
		result = "Kontostand: " + account.getBalance();
	}
	@Override
	public void handleCart(PersistentCart cart) throws PersistenceException {
		result = "Aktuelle Bestellsumme: " + cart.getCurrentSum();
	}
	@Override
	public void handleArticle(PersistentArticle article) throws PersistenceException {
		result = article.getDescription();
	}
	@Override
	public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException {
		result = productGroup.getDescription();
	}
	@Override
	public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException {
		result = manufacturer.getName();
	}
	@Override
	public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException {
		result = quantifiedArticles.getArticle() + " Menge: " + quantifiedArticles.getAmount();
	}
	@Override
	public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException {
		result = "Bestellung vom: " + customerOrder.getSendDate().getDate() + "." + customerOrder.getSendDate().getMonth() + ". " + customerOrder.getSendDate().getHours() + ":" + customerOrder.getSendDate().getMinutes()
				+ customerOrder.getMyState();
	}
	@Override
	public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException {
		result = " Annehmen bis: " + arrivedOrder.getTimeToAccept();
	}
	@Override
	public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException {}
	@Override
	public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException {}
	@Override
	public void handleRetoure(PersistentRetoure retoure) throws PersistenceException {}
	@Override
	public void handleShopService(PersistentShopService shopService) throws PersistenceException {}
	@Override
	public void handleCartService(PersistentCartService cartService) throws PersistenceException {}
	@Override
	public void handleAccountService(PersistentAccountService accountService) throws PersistenceException {}
	@Override
	public void handleShopManager(PersistentShopManager shopManager) throws PersistenceException {}
	@Override
	public void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException {}
	@Override
	public void handleCartManager(PersistentCartManager cartManager) throws PersistenceException {}
	@Override
	public void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException {}
	@Override
	public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException {}
	@Override
	public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException {}
	@Override
	public void handleServer(PersistentServer server) throws PersistenceException {}
	@Override
	public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException {}
	@Override
	public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException {}
	@Override
	public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException {}
	@Override
	public void handleOrderService(PersistentOrderService orderService) throws PersistenceException {}
	@Override
	public void handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException {}
	@Override
	public void handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException {
		result = "OverNight Versand Dauer: " + overNightDelivery.getTime() + " Kosten: " + overNightDelivery.getExtraCharge();
	}
	@Override
	public void handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException {
		result = "Standard Versand Dauer: " + standardDelivery.getTime() + " Kosten: " + standardDelivery.getExtraCharge();
	}
	@Override
	public void handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException {}
	

}
