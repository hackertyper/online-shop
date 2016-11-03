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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException {
		result = productGroup.getDescription();
	}
	@Override
	public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleServer(PersistentServer server) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleCustomer(PersistentCustomer customer) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException {
		result = "Im Verkauf";
	}
	@Override
	public void handleArticle(PersistentArticle article) throws PersistenceException {
		result = article.getDescription() + " (" + article.getState().toString() + ")";
	}
	@Override
	public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException {
		result = "Aus dem Verkauf genommen";
	}
	@Override
	public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void handleRetoure(PersistentRetoure retoure) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

}
