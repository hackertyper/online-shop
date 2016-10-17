
package model.visitor;

import persistence.*;

public interface AnythingVisitor extends CommonDateVisitor,DeliveryVisitor,ItemVisitor,ServiceVisitor{
    
    public void handleAccount(PersistentAccount account) throws PersistenceException;
    public void handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException;
    public void handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException;
    public void handleCart(PersistentCart cart) throws PersistenceException;
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    public void handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException;
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public void handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException;
    public void handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    public void handleCustomer(PersistentCustomer customer) throws PersistenceException;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public void handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public void handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    public void handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    public void handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public void handlePayCommand(PersistentPayCommand payCommand) throws PersistenceException;
    public void handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    public void handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    public void handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException;
    public void handleServer(PersistentServer server) throws PersistenceException;
    public void handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    
}
