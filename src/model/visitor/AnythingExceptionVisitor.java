
package model.visitor;

import persistence.*;

public interface AnythingExceptionVisitor<E extends model.UserException> extends CartStateExceptionVisitor<E>,CommonDateExceptionVisitor<E>,CustomerDeliveryExceptionVisitor<E>,DeliveryExceptionVisitor<E>,ItemExceptionVisitor<E>,ServiceExceptionVisitor<E>{
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException, E;
    public void handleAccount(PersistentAccount account) throws PersistenceException, E;
    public void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException, E;
    public void handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException, E;
    public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException, E;
    public void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException, E;
    public void handleCancelCommand(PersistentCancelCommand cancelCommand) throws PersistenceException, E;
    public void handleCart(PersistentCart cart) throws PersistenceException, E;
    public void handleCartManager(PersistentCartManager cartManager) throws PersistenceException, E;
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException, E;
    public void handleCartManagerOnDelivery(PersistentCartManagerOnDelivery cartManagerOnDelivery) throws PersistenceException, E;
    public void handleCartManagerStandardDelivery(PersistentCartManagerStandardDelivery cartManagerStandardDelivery) throws PersistenceException, E;
    public void handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException, E;
    public void handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException, E;
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException, E;
    public void handleChangeMaxStockCommand(PersistentChangeMaxStockCommand changeMaxStockCommand) throws PersistenceException, E;
    public void handleChangeMinStockCommand(PersistentChangeMinStockCommand changeMinStockCommand) throws PersistenceException, E;
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException, E;
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException, E;
    public void handleChangeRetourePercentageCommand(PersistentChangeRetourePercentageCommand changeRetourePercentageCommand) throws PersistenceException, E;
    public void handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException, E;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException, E;
    public void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException, E;
    public void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException, E;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException, E;
    public void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException, E;
    public void handleCustomerOrderArticleList(PersistentCustomerOrderArticleList customerOrderArticleList) throws PersistenceException, E;
    public void handleCustomerPresets(PersistentCustomerPresets customerPresets) throws PersistenceException, E;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException, E;
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException, E;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException, E;
    public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException, E;
    public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException, E;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException, E;
    public void handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException, E;
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException, E;
    public void handlePreOrderArticleList(PersistentPreOrderArticleList preOrderArticleList) throws PersistenceException, E;
    public void handlePreorderCommand(PersistentPreorderCommand preorderCommand) throws PersistenceException, E;
    public void handlePresetBalanceCommand(PersistentPresetBalanceCommand presetBalanceCommand) throws PersistenceException, E;
    public void handlePresetLowerLimitCommand(PersistentPresetLowerLimitCommand presetLowerLimitCommand) throws PersistenceException, E;
    public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException, E;
    public void handleQuantifiedArticlesArticle(PersistentQuantifiedArticlesArticle quantifiedArticlesArticle) throws PersistenceException, E;
    public void handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException, E;
    public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException, E;
    public void handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException, E;
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException, E;
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException, E;
    public void handleServer(PersistentServer server) throws PersistenceException, E;
    public void handleShopManager(PersistentShopManager shopManager) throws PersistenceException, E;
    public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException, E;
    public void handleShopkeeperBasicProductGroup(PersistentShopkeeperBasicProductGroup shopkeeperBasicProductGroup) throws PersistenceException, E;
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException, E;
    public void handleSubj(PersistentSubj subj) throws PersistenceException, E;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException, E;
    
}
