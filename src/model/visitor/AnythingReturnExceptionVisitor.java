
package model.visitor;

import persistence.*;

public interface AnythingReturnExceptionVisitor<R, E extends model.UserException> extends CartStateReturnExceptionVisitor<R, E> ,CommonDateReturnExceptionVisitor<R, E> ,DeliveryReturnExceptionVisitor<R, E> ,ItemReturnExceptionVisitor<R, E> ,ServiceReturnExceptionVisitor<R, E> {
    
    public R handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException, E;
    public R handleAccount(PersistentAccount account) throws PersistenceException, E;
    public R handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException, E;
    public R handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException, E;
    public R handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException, E;
    public R handleCart(PersistentCart cart) throws PersistenceException, E;
    public R handleCartManager(PersistentCartManager cartManager) throws PersistenceException, E;
    public R handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException, E;
    public R handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException, E;
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException, E;
    public R handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException, E;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException, E;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException, E;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException, E;
    public R handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException, E;
    public R handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException, E;
    public R handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException, E;
    public R handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException, E;
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException, E;
    public R handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException, E;
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    public R handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException, E;
    public R handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException, E;
    public R handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException, E;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException, E;
    public R handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException, E;
    public R handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException, E;
    public R handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException, E;
    public R handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException, E;
    public R handleServer(PersistentServer server) throws PersistenceException, E;
    public R handleShopManager(PersistentShopManager shopManager) throws PersistenceException, E;
    public R handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException, E;
    public R handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException, E;
    public R handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException, E;
    public R handleSubj(PersistentSubj subj) throws PersistenceException, E;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException, E;
    
}
