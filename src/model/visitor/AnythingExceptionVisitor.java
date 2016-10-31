
package model.visitor;

import persistence.*;

public interface AnythingExceptionVisitor<E extends model.UserException> extends CartStateExceptionVisitor<E>,CommonDateExceptionVisitor<E>,DeliveryExceptionVisitor<E>,ItemExceptionVisitor<E>,ServiceExceptionVisitor<E>{
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException, E;
    public void handleAccount(PersistentAccount account) throws PersistenceException, E;
    public void handleAccountManager(PersistentAccountManager accountManager) throws PersistenceException, E;
    public void handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException, E;
    public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException, E;
    public void handleCart(PersistentCart cart) throws PersistenceException, E;
    public void handleCartManager(PersistentCartManager cartManager) throws PersistenceException, E;
    public void handleCartManagerArticleList(PersistentCartManagerArticleList cartManagerArticleList) throws PersistenceException, E;
    public void handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException, E;
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException, E;
    public void handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException, E;
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException, E;
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException, E;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException, E;
    public void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException, E;
    public void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException, E;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException, E;
    public void handleCustomerManager(PersistentCustomerManager customerManager) throws PersistenceException, E;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException, E;
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException, E;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException, E;
    public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException, E;
    public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException, E;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException, E;
    public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException, E;
    public void handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException, E;
    public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException, E;
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException, E;
    public void handleServer(PersistentServer server) throws PersistenceException, E;
    public void handleShopManager(PersistentShopManager shopManager) throws PersistenceException, E;
    public void handleShopManagerItemRange(PersistentShopManagerItemRange shopManagerItemRange) throws PersistenceException, E;
    public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException, E;
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException, E;
    public void handleSubj(PersistentSubj subj) throws PersistenceException, E;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException, E;
    
}
