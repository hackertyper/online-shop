
package model.visitor;

import persistence.*;

public interface CommonDateReturnVisitor<R> {
    
    public R handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public R handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException;
    public R handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException;
    public R handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException;
    public R handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    public R handleChangeManuDeliveryCommand(PersistentChangeManuDeliveryCommand changeManuDeliveryCommand) throws PersistenceException;
    public R handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public R handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    public R handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException;
    public R handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public R handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public R handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public R handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public R handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException;
    public R handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException;
    public R handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException;
    public R handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    public R handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    public R handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    
}
