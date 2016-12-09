
package model.visitor;

import persistence.*;

public interface CommonDateVisitor {
    
    public void handleAcceptDeliveryCommand(PersistentAcceptDeliveryCommand acceptDeliveryCommand) throws PersistenceException;
    public void handleAddArticleCommand(PersistentAddArticleCommand addArticleCommand) throws PersistenceException;
    public void handleCancelCommand(PersistentCancelCommand cancelCommand) throws PersistenceException;
    public void handleChangeAmountCommand(PersistentChangeAmountCommand changeAmountCommand) throws PersistenceException;
    public void handleChangeChargeCommand(PersistentChangeChargeCommand changeChargeCommand) throws PersistenceException;
    public void handleChangeDescriptionCommand(PersistentChangeDescriptionCommand changeDescriptionCommand) throws PersistenceException;
    public void handleChangeMaxStockCommand(PersistentChangeMaxStockCommand changeMaxStockCommand) throws PersistenceException;
    public void handleChangeMinStockCommand(PersistentChangeMinStockCommand changeMinStockCommand) throws PersistenceException;
    public void handleChangePriceCommand(PersistentChangePriceCommand changePriceCommand) throws PersistenceException;
    public void handleChangeProductGroupCommand(PersistentChangeProductGroupCommand changeProductGroupCommand) throws PersistenceException;
    public void handleChangeRetourePercentageCommand(PersistentChangeRetourePercentageCommand changeRetourePercentageCommand) throws PersistenceException;
    public void handleChangeTimeCommand(PersistentChangeTimeCommand changeTimeCommand) throws PersistenceException;
    public void handleCheckOutCommand(PersistentCheckOutCommand checkOutCommand) throws PersistenceException;
    public void handleDepositCommand(PersistentDepositCommand depositCommand) throws PersistenceException;
    public void handleFindArticleCommand(PersistentFindArticleCommand findArticleCommand) throws PersistenceException;
    public void handleOrderCommand(PersistentOrderCommand orderCommand) throws PersistenceException;
    public void handlePreorderCommand(PersistentPreorderCommand preorderCommand) throws PersistenceException;
    public void handlePresetBalanceCommand(PersistentPresetBalanceCommand presetBalanceCommand) throws PersistenceException;
    public void handlePresetLowerLimitCommand(PersistentPresetLowerLimitCommand presetLowerLimitCommand) throws PersistenceException;
    public void handleRemoveFCartCommand(PersistentRemoveFCartCommand removeFCartCommand) throws PersistenceException;
    public void handleRetoureArticleCommand(PersistentRetoureArticleCommand retoureArticleCommand) throws PersistenceException;
    public void handleRetoureDeliveryCommand(PersistentRetoureDeliveryCommand retoureDeliveryCommand) throws PersistenceException;
    public void handleStartSellingCommand(PersistentStartSellingCommand startSellingCommand) throws PersistenceException;
    public void handleWithdrawCommand(PersistentWithdrawCommand withdrawCommand) throws PersistenceException;
    public void handleCommonDate(PersistentCommonDate commonDate) throws PersistenceException;
    
}
