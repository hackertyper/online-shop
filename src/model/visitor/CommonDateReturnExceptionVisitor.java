
package model.visitor;

import persistence.*;

public interface CommonDateReturnExceptionVisitor<R, E extends model.UserException> {
    
    public R handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException, E;
    public R handleAddToCartCommand(PersistentAddToCartCommand addToCartCommand) throws PersistenceException, E;
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException, E;
    public R handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException, E;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException, E;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException, E;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException, E;
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException, E;
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException, E;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException, E;
    public R handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException, E;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException, E;
    public R handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException, E;
    
}
