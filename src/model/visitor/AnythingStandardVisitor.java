
package model.visitor;

import persistence.*;

public abstract class AnythingStandardVisitor implements AnythingVisitor {
    
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
    public void handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException{
        this.standardHandling(removeFCartCommand);
    }
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException{
        this.standardHandling(errorDisplay);
    }
    public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException{
        this.standardHandling(customerOrder);
    }
    public void handleCartManagerOnDelivery(PersistentCartManagerOnDelivery cartManagerOnDelivery) throws PersistenceException{
        this.standardHandling(cartManagerOnDelivery);
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
    public void handleChangeMaxStockCommand(PersistentChangeMaxStockCommand changeMaxStockCommand) throws PersistenceException{
        this.standardHandling(changeMaxStockCommand);
    }
    public void handleCustomerPresets(PersistentCustomerPresets customerPresets) throws PersistenceException{
        this.standardHandling(customerPresets);
    }
    public void handleCustomerOrderArticleList(PersistentCustomerOrderArticleList customerOrderArticleList) throws PersistenceException{
        this.standardHandling(customerOrderArticleList);
    }
    public void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException{
        this.standardHandling(commandCoordinator);
    }
    public void handleQuantifiedArticlesArticle(PersistentQuantifiedArticlesArticle quantifiedArticlesArticle) throws PersistenceException{
        this.standardHandling(quantifiedArticlesArticle);
    }
    public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException{
        this.standardHandling(openCart);
    }
    public void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException{
        this.standardHandling(customerManager);
    }
    public void handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException{
        this.standardHandling(addArticleCommand);
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
    public void handlePreorderCommand(PersistentPreorderCommand preorderCommand) throws PersistenceException{
        this.standardHandling(preorderCommand);
    }
    public void handleShopManager(PersistentShopManager shopManager) throws PersistenceException{
        this.standardHandling(shopManager);
    }
    public void handleCartManagerStandardDelivery(PersistentCartManagerStandardDelivery cartManagerStandardDelivery) throws PersistenceException{
        this.standardHandling(cartManagerStandardDelivery);
    }
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException{
        this.standardHandling(depositCommand);
    }
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException{
        this.standardHandling(changeProductGroupCommand);
    }
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException{
        this.standardHandling(sendOrder);
    }
    public void handlePreOrderArticleList(PersistentPreOrderArticleList preOrderArticleList) throws PersistenceException{
        this.standardHandling(preOrderArticleList);
    }
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException{
        this.standardHandling(startSellingCommand);
    }
    public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException{
        this.standardHandling(shopKeeperOrder);
    }
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException{
        this.standardHandling(changeDescriptionCommand);
    }
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException{
        this.standardHandling(acceptDeliveryCommand);
    }
    public void handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException{
        this.standardHandling(testDelivery);
    }
    public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException{
        this.standardHandling(removedFSale);
    }
    public void handleRetoure(PersistentRetoure retoure) throws PersistenceException{
        this.standardHandling(retoure);
    }
    public void handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException{
        this.standardHandling(changeChargeCommand);
    }
    public void handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException{
        this.standardHandling(changeTimeCommand);
    }
    public void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException{
        this.standardHandling(accountManager);
    }
    public void handleOrderService(PersistentOrderService orderService) throws PersistenceException{
        this.standardHandling(orderService);
    }
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException{
        this.standardHandling(commonDate);
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
    public void handlePresetBalanceCommand(PersistentPresetBalanceCommand presetBalanceCommand) throws PersistenceException{
        this.standardHandling(presetBalanceCommand);
    }
    public void handleChangeRetourePercentageCommand(PersistentChangeRetourePercentageCommand changeRetourePercentageCommand) throws PersistenceException{
        this.standardHandling(changeRetourePercentageCommand);
    }
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException{
        this.standardHandling(orderCommand);
    }
    public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException{
        this.standardHandling(shopkeeper);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.standardHandling(article);
    }
    public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException{
        this.standardHandling(offeredFSale);
    }
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException{
        this.standardHandling(preOrder);
    }
    public void handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException{
        this.standardHandling(retoureArticleCommand);
    }
    public void handleBasicProductGroup(PersistentBasicProductGroup basicProductGroup) throws PersistenceException{
        this.standardHandling(basicProductGroup);
    }
    public void handlePresetLowerLimitCommand(PersistentPresetLowerLimitCommand presetLowerLimitCommand) throws PersistenceException{
        this.standardHandling(presetLowerLimitCommand);
    }
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException{
        this.standardHandling(findArticleCommand);
    }
    public void handleShopkeeperBasicProductGroup(PersistentShopkeeperBasicProductGroup shopkeeperBasicProductGroup) throws PersistenceException{
        this.standardHandling(shopkeeperBasicProductGroup);
    }
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException{
        this.standardHandling(registerService);
    }
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException{
        this.standardHandling(withdrawCommand);
    }
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException{
        this.standardHandling(cartManagerArticleList);
    }
    public void handleCart(PersistentCart cart) throws PersistenceException{
        this.standardHandling(cart);
    }
    public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException{
        this.standardHandling(quantifiedArticles);
    }
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException{
        this.standardHandling(changePriceCommand);
    }
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException{
        this.standardHandling(retoureDeliveryCommand);
    }
    public void handleChangeMinStockCommand(PersistentChangeMinStockCommand changeMinStockCommand) throws PersistenceException{
        this.standardHandling(changeMinStockCommand);
    }
    public void handleSubj(PersistentSubj subj) throws PersistenceException{
        this.standardHandling(subj);
    }
    public void handleCancelCommand(PersistentCancelCommand cancelCommand) throws PersistenceException{
        this.standardHandling(cancelCommand);
    }
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException{
        this.standardHandling(shopkeeperService);
    }
    public void handleCartService(PersistentCartService cartService) throws PersistenceException{
        this.standardHandling(cartService);
    }
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException{
        this.standardHandling(checkOutCommand);
    }
    public void handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException{
        this.standardHandling(changeAmountCommand);
    }
    public void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException{
        this.standardHandling(commandExecuter);
    }
    public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException{
        this.standardHandling(checkedOut);
    }
    public void handleCartManager(PersistentCartManager cartManager) throws PersistenceException{
        this.standardHandling(cartManager);
    }
    protected abstract void standardHandling(Anything anything) throws PersistenceException;
}
