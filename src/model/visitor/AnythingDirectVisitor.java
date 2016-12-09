
package model.visitor;

import persistence.*;

public abstract class AnythingDirectVisitor implements AnythingVisitor {
    
    public abstract void handleAccount(PersistentAccount account) throws PersistenceException;
    
    public abstract void handleServer(PersistentServer server) throws PersistenceException;
    
    public abstract void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    
    public abstract void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    
    public abstract void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    
    public abstract void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException;
    
    public abstract void handleCartManagerOnDelivery(PersistentCartManagerOnDelivery cartManagerOnDelivery) throws PersistenceException;
    
    public abstract void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException;
    
    public abstract void handleCartState(PersistentCartState cartState) throws PersistenceException;
    
    public void handleOpenCart(PersistentOpenCart openCart) throws PersistenceException{
        this.handleCartState(openCart);
    }
    public void handleCheckedOut(PersistentCheckedOut checkedOut) throws PersistenceException{
        this.handleCartState(checkedOut);
    }
    public abstract void handleShopkeeperBasicProductGroup(PersistentShopkeeperBasicProductGroup shopkeeperBasicProductGroup) throws PersistenceException;
    
    public abstract void handleCustomerPresets(PersistentCustomerPresets customerPresets) throws PersistenceException;
    
    public abstract void handleCustomerOrderArticleList(PersistentCustomerOrderArticleList customerOrderArticleList) throws PersistenceException;
    
    public abstract void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException;
    
    public abstract void handleItem(PersistentItem item) throws PersistenceException;
    
    public void handleProductGroup(PersistentProductGroup productGroup) throws PersistenceException{
        this.handleItem(productGroup);
    }
    public void handleArticle(PersistentArticle article) throws PersistenceException{
        this.handleItem(article);
    }
    public abstract void handleQuantifiedArticlesArticle(PersistentQuantifiedArticlesArticle quantifiedArticlesArticle) throws PersistenceException;
    
    public abstract void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException;
    
    public abstract void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    
    public abstract void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    
    public abstract void handleShopManager(PersistentShopManager shopManager) throws PersistenceException;
    
    public abstract void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException;
    
    public abstract void handleCartManagerStandardDelivery(PersistentCartManagerStandardDelivery cartManagerStandardDelivery) throws PersistenceException;
    
    public abstract void handleCart(PersistentCart cart) throws PersistenceException;
    
    public abstract void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    
    public abstract void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException;
    
    public abstract void handlePreOrderArticleList(PersistentPreOrderArticleList preOrderArticleList) throws PersistenceException;
    
    public abstract void handleShopManagerBasicProductGroup(PersistentShopManagerBasicProductGroup shopManagerBasicProductGroup) throws PersistenceException;
    
    public abstract void handleService(PersistentService service) throws PersistenceException;
    
    public void handleRegisterService(PersistentRegisterService registerService) throws PersistenceException{
        this.handleService(registerService);
    }
    public void handleCustomerService(PersistentCustomerService customerService) throws PersistenceException{
        this.handleService(customerService);
    }
    public void handleShopkeeperService(PersistentShopkeeperService shopkeeperService) throws PersistenceException{
        this.handleService(shopkeeperService);
    }
    public void handleShopService(PersistentShopService shopService) throws PersistenceException{
        this.handleService(shopService);
    }
    public void handleCartService(PersistentCartService cartService) throws PersistenceException{
        this.handleService(cartService);
    }
    public void handleOrderService(PersistentOrderService orderService) throws PersistenceException{
        this.handleService(orderService);
    }
    public void handleAccountService(PersistentAccountService accountService) throws PersistenceException{
        this.handleService(accountService);
    }
    public abstract void handleCustomerDelivery(PersistentCustomerDelivery customerDelivery) throws PersistenceException;
    
    public void handleTestDelivery(PersistentTestDelivery testDelivery) throws PersistenceException{
        this.handleCustomerDelivery(testDelivery);
    }
    public void handleOverNightDelivery(PersistentOverNightDelivery overNightDelivery) throws PersistenceException{
        this.handleCustomerDelivery(overNightDelivery);
    }
    public void handleStandardDelivery(PersistentStandardDelivery standardDelivery) throws PersistenceException{
        this.handleCustomerDelivery(standardDelivery);
    }
    public abstract void handleSubj(PersistentSubj subj) throws PersistenceException;
    
    public abstract void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    
    public abstract void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException;
    
    public abstract void handleDelivery(PersistentDelivery delivery) throws PersistenceException;
    
    public void handleRetoure(PersistentRetoure retoure) throws PersistenceException{
        this.handleDelivery(retoure);
    }
    public void handleCustomerOrder(PersistentCustomerOrder customerOrder) throws PersistenceException{
        this.handleDelivery(customerOrder);
    }
    public void handleShopKeeperOrder(PersistentShopKeeperOrder shopKeeperOrder) throws PersistenceException{
        this.handleDelivery(shopKeeperOrder);
    }
    public abstract void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException{
        this.handleCommonDate(changeProductGroupCommand);
    }
    public void handlePresetBalanceCommand(PersistentPresetBalanceCommand presetBalanceCommand) throws PersistenceException{
        this.handleCommonDate(presetBalanceCommand);
    }
    public void handleChangeRetourePercentageCommand(PersistentChangeRetourePercentageCommand changeRetourePercentageCommand) throws PersistenceException{
        this.handleCommonDate(changeRetourePercentageCommand);
    }
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException{
        this.handleCommonDate(orderCommand);
    }
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException{
        this.handleCommonDate(changePriceCommand);
    }
    public void handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException{
        this.handleCommonDate(removeFCartCommand);
    }
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException{
        this.handleCommonDate(retoureDeliveryCommand);
    }
    public void handleChangeMinStockCommand(PersistentChangeMinStockCommand changeMinStockCommand) throws PersistenceException{
        this.handleCommonDate(changeMinStockCommand);
    }
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException{
        this.handleCommonDate(startSellingCommand);
    }
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException{
        this.handleCommonDate(changeDescriptionCommand);
    }
    public void handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException{
        this.handleCommonDate(retoureArticleCommand);
    }
    public void handleChangeMaxStockCommand(PersistentChangeMaxStockCommand changeMaxStockCommand) throws PersistenceException{
        this.handleCommonDate(changeMaxStockCommand);
    }
    public void handlePresetLowerLimitCommand(PersistentPresetLowerLimitCommand presetLowerLimitCommand) throws PersistenceException{
        this.handleCommonDate(presetLowerLimitCommand);
    }
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException{
        this.handleCommonDate(findArticleCommand);
    }
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException{
        this.handleCommonDate(acceptDeliveryCommand);
    }
    public void handleCancelCommand(PersistentCancelCommand cancelCommand) throws PersistenceException{
        this.handleCommonDate(cancelCommand);
    }
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException{
        this.handleCommonDate(withdrawCommand);
    }
    public void handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException{
        this.handleCommonDate(addArticleCommand);
    }
    public void handlePreorderCommand(PersistentPreorderCommand preorderCommand) throws PersistenceException{
        this.handleCommonDate(preorderCommand);
    }
    public void handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException{
        this.handleCommonDate(changeChargeCommand);
    }
    public void handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException{
        this.handleCommonDate(changeTimeCommand);
    }
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException{
        this.handleCommonDate(checkOutCommand);
    }
    public void handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException{
        this.handleCommonDate(changeAmountCommand);
    }
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException{
        this.handleCommonDate(depositCommand);
    }
    public abstract void handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException;
    
    public abstract void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException;
    
    public abstract void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException;
    
    public abstract void handleCartManager(PersistentCartManager cartManager) throws PersistenceException;
    
    
}
