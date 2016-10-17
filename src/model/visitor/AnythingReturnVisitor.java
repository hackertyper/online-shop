
package model.visitor;

import persistence.*;

public interface AnythingReturnVisitor<R> extends CommonDateReturnVisitor<R> ,DeliveryReturnVisitor<R> ,ItemReturnVisitor<R> ,ServiceReturnVisitor<R> {
    
    public R handleAccount(PersistentAccount account) throws PersistenceException;
    public R handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException;
    public R handleArrivedOrder(PersistentArrivedOrder arrivedOrder) throws PersistenceException;
    public R handleCart(PersistentCart cart) throws PersistenceException;
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    public R handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public R handleCommandCoordinator(PersistentCommandCoordinator commandCoordinator) throws PersistenceException;
    public R handleCommandExecuter(PersistentCommandExecuter commandExecuter) throws PersistenceException;
    public R handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    public R handleCustomer(PersistentCustomer customer) throws PersistenceException;
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public R handleErrorDisplay(PersistentErrorDisplay errorDisplay) throws PersistenceException;
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public R handleManufacturer(PersistentManufacturer manufacturer) throws PersistenceException;
    public R handleNewlyAdded(PersistentNewlyAdded newlyAdded) throws PersistenceException;
    public R handleOfferedFSale(PersistentOfferedFSale offeredFSale) throws PersistenceException;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public R handlePayCommand(PersistentPayCommand payCommand) throws PersistenceException;
    public R handleQuantifiedArticles(PersistentQuantifiedArticles quantifiedArticles) throws PersistenceException;
    public R handleRemovedFSale(PersistentRemovedFSale removedFSale) throws PersistenceException;
    public R handleSendOrder(PersistentSendOrder sendOrder) throws PersistenceException;
    public R handleServer(PersistentServer server) throws PersistenceException;
    public R handleShopkeeper(PersistentShopkeeper shopkeeper) throws PersistenceException;
    public R handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    
}
