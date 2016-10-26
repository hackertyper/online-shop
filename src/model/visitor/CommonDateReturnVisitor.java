
package model.visitor;

import persistence.*;

public interface CommonDateReturnVisitor<R> {
    
    public R handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public R handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException;
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    public R handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public R handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    public R handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    
}
