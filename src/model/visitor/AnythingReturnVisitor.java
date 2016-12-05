
package model.visitor;

import persistence.*;

public interface AnythingReturnVisitor<R> extends CartStateReturnVisitor<R> ,CommonDateReturnVisitor<R> ,CustomerDeliveryReturnVisitor<R> ,DeliveryReturnVisitor<R> ,ItemReturnVisitor<R> ,ServiceReturnVisitor<R> {
    
    public R handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public R handleAccount(PersistentAccount account) throws PersistenceException;
    public R handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException;
    public R handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException;
    public R handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException;
    public R handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException;
    public R handleCart(PersistentCart cart) throws PersistenceException;
    public R handleCartManager(PersistentCartManager cartManager) throws PersistenceException;
    public R handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException;
    public R handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException;
    public R handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException;
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    public R handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    public R handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public R handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException;
    public R handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException;
    public R handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    public R handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException;
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public R handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public R handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    public R handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    public R handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public R handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException;
    public R handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException;
    public R handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    public R handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException;
    public R handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    public R handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException;
    public R handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException;
    public R handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException;
    public R handleServer(PersistentServer server) throws PersistenceException;
    public R handleShopManager(PersistentShopManager shopManager) throws PersistenceException;
    public R handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException;
    public R handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    public R handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    public R handleSubj(PersistentSubj subj) throws PersistenceException;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    
}
