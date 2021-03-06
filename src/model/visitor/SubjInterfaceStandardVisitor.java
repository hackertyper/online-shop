
package model.visitor;

import persistence.*;

public abstract class SubjInterfaceStandardVisitor implements SubjInterfaceVisitor {
    
    public void handleAccount(PersistentAccount account) throws PersistenceException{
        this.standardHandling(account);
    }
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.standardHandling(productGroup);
    }
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException{
        this.standardHandling(customerService);
    }
    public void handleServer(PersistentServer server) throws PersistenceException{
        this.standardHandling(server);
    }
    public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException{
        this.standardHandling(shopkeeper);
    }
    public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException{
        this.standardHandling(offeredFSale);
    }
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException{
        this.standardHandling(errorDisplay);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException{
        this.standardHandling(preOrder);
    }
    public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException{
        this.standardHandling(customerOrder);
    }
    public void handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException{
        this.standardHandling(overNightDelivery);
    }
    public void handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException{
        this.standardHandling(standardDelivery);
    }
    public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException{
        this.standardHandling(arrivedOrder);
    }
    public void handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException{
        this.standardHandling(basicProductGroup);
    }
    public void handleCustomerPresets(PersistentCustomerPresets customerPresets) throws PersistenceException{
        this.standardHandling(customerPresets);
    }
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException{
        this.standardHandling(registerService);
    }
    public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException{
        this.standardHandling(openCart);
    }
    public void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException{
        this.standardHandling(customerManager);
    }
    public void handleShopService(PersistentShopService shopService) throws PersistenceException{
        this.standardHandling(shopService);
    }
    public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException{
        this.standardHandling(manufacturer);
    }
    public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException{
        this.standardHandling(newlyAdded);
    }
    public void handleShopManager(PersistentShopManager shopManager) throws PersistenceException{
        this.standardHandling(shopManager);
    }
    public void handleCart(PersistentCart cart) throws PersistenceException{
        this.standardHandling(cart);
    }
    public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException{
        this.standardHandling(quantifiedArticles);
    }
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException{
        this.standardHandling(sendOrder);
    }
    public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException{
        this.standardHandling(shopKeeperOrder);
    }
    public void handleSubj(PersistentSubj subj) throws PersistenceException{
        this.standardHandling(subj);
    }
    public void handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException{
        this.standardHandling(testDelivery);
    }
    public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException{
        this.standardHandling(removedFSale);
    }
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException{
        this.standardHandling(shopkeeperService);
    }
    public void handleRetoure(PersistentRetoure retoure) throws PersistenceException{
        this.standardHandling(retoure);
    }
    public void handleCartService(PersistentCartService cartService) throws PersistenceException{
        this.standardHandling(cartService);
    }
    public void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException{
        this.standardHandling(accountManager);
    }
    public void handleOrderService(PersistentOrderService orderService) throws PersistenceException{
        this.standardHandling(orderService);
    }
    public void handleAccountService(PersistentAccountService accountService) throws PersistenceException{
        this.standardHandling(accountService);
    }
    public void handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException{
        this.standardHandling(orderManager);
    }
    public void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException{
        this.standardHandling(articleWrapper);
    }
    public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException{
        this.standardHandling(checkedOut);
    }
    public void handleCartManager(PersistentCartManager cartManager) throws PersistenceException{
        this.standardHandling(cartManager);
    }
    protected abstract void standardHandling(SubjInterface subjInterface) throws PersistenceException;
}
