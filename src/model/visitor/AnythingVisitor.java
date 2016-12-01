
package model.visitor;

import persistence.*;

public interface AnythingVisitor extends CartStateVisitor,CommonDateVisitor,CustomerDeliveryVisitor,DeliveryVisitor,ItemVisitor,ServiceVisitor{
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public void handleAccount(PersistentAccount account) throws PersistenceException;
    public void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException;
    public void handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException;
    public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException;
    public void handleArticleWrapper(PersistentArticleWrapper articleWrapper) throws PersistenceException;
    public void handleCart(PersistentCart cart) throws PersistenceException;
    public void handleCartManager(PersistentCartManager cartManager) throws PersistenceException;
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException;
    public void handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException;
    public void handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException;
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    public void handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException;
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    public void handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException;
    public void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    public void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public void handleOrderManager(PersistentOrderManager orderManager) throws PersistenceException;
    public void handlePreOrder(PersistentPreOrder preOrder) throws PersistenceException;
    public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    public void handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException;
    public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException;
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException;
    public void handleServer(PersistentServer server) throws PersistenceException;
    public void handleShopManager(PersistentShopManager shopManager) throws PersistenceException;
    public void handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException;
    public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    public void handleSubj(PersistentSubj subj) throws PersistenceException;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    
}
